(ns onyx-log-subscriber-demo.core
  (:require [clojure.core.async :refer [chan <!! close!]]
            [onyx.extensions :as extensions]
            [onyx.api]))

;; Hi! You'll need to change one thing below for your Docker set up.
;; You can control+B at the repl to kill off the connection. The finally
;; block *should* clean things up for you nicely.

;; Note that this runs the Greedy job scheduler. Peers are all allocated to
;; the "oldest" job until it's done. We ran through several iterations of
;; bringing jobs up and down with multiple rounds of peers.

;; :jobs and :peers in the log are self explanatory - those are the IDs
;; of the :jobs and :peers in the cluster as of that moment. :allocations
;; is a map of job ID -> task ID -> peer IDs assigned to that task. See
;; the :tasks keep to find all the task IDs, keyed by job ID.

;; Enjoy!

(defn list-cluster-status []
  (let [peer-config {:onyx/id "dev-tenancy"
                     :zookeeper/address "192.168.99.100:32769" ;; <- Change me to your Docker host + IP
                     :onyx.peer/job-scheduler :onyx.job-scheduler/greedy
                     :onyx.peer/zookeeper-timeout 60000
                     :onyx.messaging.aeron/embedded-driver? true
                     :onyx.messaging/allow-short-circuit? false
                     :onyx.messaging/impl :aeron
                     :onyx.messaging/peer-port 40199
                     :onyx.messaging/bind-addr "localhost"}
        ch (chan 1000)
        {:keys [replica env]} (onyx.api/subscribe-to-log peer-config ch)]
    (try
      (loop [rep replica]
        (when-let [entry (<!! ch)]
          (let [result (extensions/apply-log-entry entry rep)]
            (println (str "=== entry id " (:message-id entry) " ==="))
            (println (str "Function: " (:fn entry)))
            (println (str "ZooKeeper Timestamp: " (:created-at entry)))
            (println (str "Peers: " (:peers result)))
            (println (str "Jobs: " (:jobs result)))
            (println "Allocations ...")
            (clojure.pprint/pprint (:allocations result))
            (recur result))))
      (catch InterruptedException e)
      (catch ThreadDeath e)
      (finally
        (onyx.api/shutdown-env env)))))

#_(list-cluster-status)
