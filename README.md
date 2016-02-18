# onyx-log-subscriber-demo

Very quick demo of the Onyx log subscription feature. Reads off a Docker image with an Onyx log that has been preloaded. Pull the container (below), then see `core.clj` for more!

Make sure you're using Onyx version `0.8.11`, since that's what version of Onyx we used to load up the log to begin with. Core's version must match the subscriber's version.

Get and start the container:

```
$ docker run -d -p 2181 michaeldrogalis/onyx-log:0.1.0
```

Run `docker ps` to find which port `2181` is bound to. If you're on OS X and using docker-machine, obtain your VM's IP by running `docker-machine ip default`. That's the address you'll use to connect to ZooKeeper.

## Log output

The subscriber should output *exactly* this if you're using the container:

```
=== entry id 0 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763816499
Peers: [#uuid "671137f3-cabb-4bcc-9d67-fc613b906765"]
Jobs: []
Allocations ...
{}
=== entry id 1 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763816590
Peers: [#uuid "671137f3-cabb-4bcc-9d67-fc613b906765"]
Jobs: []
Allocations ...
{}
=== entry id 2 ===
Function: :notify-join-cluster
ZooKeeper Timestamp: 1455763816621
Peers: [#uuid "671137f3-cabb-4bcc-9d67-fc613b906765"]
Jobs: []
Allocations ...
{}
=== entry id 3 ===
Function: :accept-join-cluster
ZooKeeper Timestamp: 1455763816636
Peers: [#uuid "671137f3-cabb-4bcc-9d67-fc613b906765" #uuid "634a36fd-eb2e-41c8-88b9-df63624f1e73"]
Jobs: []
Allocations ...
{}
=== entry id 4 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763816686
Peers: [#uuid "671137f3-cabb-4bcc-9d67-fc613b906765" #uuid "634a36fd-eb2e-41c8-88b9-df63624f1e73"]
Jobs: []
Allocations ...
{}
=== entry id 5 ===
Function: :notify-join-cluster
ZooKeeper Timestamp: 1455763816719
Peers: [#uuid "671137f3-cabb-4bcc-9d67-fc613b906765" #uuid "634a36fd-eb2e-41c8-88b9-df63624f1e73"]
Jobs: []
Allocations ...
{}
=== entry id 6 ===
Function: :accept-join-cluster
ZooKeeper Timestamp: 1455763816764
Peers: [#uuid "671137f3-cabb-4bcc-9d67-fc613b906765" #uuid "634a36fd-eb2e-41c8-88b9-df63624f1e73" #uuid "5acf687b-afb3-4999-88ac-b4fc269b4181"]
Jobs: []
Allocations ...
{}
=== entry id 7 ===
Function: :submit-job
ZooKeeper Timestamp: 1455763816826
Peers: [#uuid "671137f3-cabb-4bcc-9d67-fc613b906765" #uuid "634a36fd-eb2e-41c8-88b9-df63624f1e73" #uuid "5acf687b-afb3-4999-88ac-b4fc269b4181"]
Jobs: [#uuid "fcc1f018-b906-44e5-83cd-f87ff4e461c2"]
Allocations ...
{#uuid "fcc1f018-b906-44e5-83cd-f87ff4e461c2"
 {#uuid "360e51ca-9254-450c-bae0-2d14d66be15f"
  [#uuid "671137f3-cabb-4bcc-9d67-fc613b906765"],
  #uuid "3d11bb16-1c31-4de2-98c8-d2766834f81f"
  [#uuid "634a36fd-eb2e-41c8-88b9-df63624f1e73"],
  #uuid "b0a3ba07-1603-48fa-a743-c0b3e24040b6"
  [#uuid "5acf687b-afb3-4999-88ac-b4fc269b4181"]}}
=== entry id 8 ===
Function: :signal-ready
ZooKeeper Timestamp: 1455763816913
Peers: [#uuid "671137f3-cabb-4bcc-9d67-fc613b906765" #uuid "634a36fd-eb2e-41c8-88b9-df63624f1e73" #uuid "5acf687b-afb3-4999-88ac-b4fc269b4181"]
Jobs: [#uuid "fcc1f018-b906-44e5-83cd-f87ff4e461c2"]
Allocations ...
{#uuid "fcc1f018-b906-44e5-83cd-f87ff4e461c2"
 {#uuid "360e51ca-9254-450c-bae0-2d14d66be15f"
  [#uuid "671137f3-cabb-4bcc-9d67-fc613b906765"],
  #uuid "3d11bb16-1c31-4de2-98c8-d2766834f81f"
  [#uuid "634a36fd-eb2e-41c8-88b9-df63624f1e73"],
  #uuid "b0a3ba07-1603-48fa-a743-c0b3e24040b6"
  [#uuid "5acf687b-afb3-4999-88ac-b4fc269b4181"]}}
=== entry id 9 ===
Function: :signal-ready
ZooKeeper Timestamp: 1455763816918
Peers: [#uuid "671137f3-cabb-4bcc-9d67-fc613b906765" #uuid "634a36fd-eb2e-41c8-88b9-df63624f1e73" #uuid "5acf687b-afb3-4999-88ac-b4fc269b4181"]
Jobs: [#uuid "fcc1f018-b906-44e5-83cd-f87ff4e461c2"]
Allocations ...
{#uuid "fcc1f018-b906-44e5-83cd-f87ff4e461c2"
 {#uuid "360e51ca-9254-450c-bae0-2d14d66be15f"
  [#uuid "671137f3-cabb-4bcc-9d67-fc613b906765"],
  #uuid "3d11bb16-1c31-4de2-98c8-d2766834f81f"
  [#uuid "634a36fd-eb2e-41c8-88b9-df63624f1e73"],
  #uuid "b0a3ba07-1603-48fa-a743-c0b3e24040b6"
  [#uuid "5acf687b-afb3-4999-88ac-b4fc269b4181"]}}
=== entry id 10 ===
Function: :signal-ready
ZooKeeper Timestamp: 1455763816924
Peers: [#uuid "671137f3-cabb-4bcc-9d67-fc613b906765" #uuid "634a36fd-eb2e-41c8-88b9-df63624f1e73" #uuid "5acf687b-afb3-4999-88ac-b4fc269b4181"]
Jobs: [#uuid "fcc1f018-b906-44e5-83cd-f87ff4e461c2"]
Allocations ...
{#uuid "fcc1f018-b906-44e5-83cd-f87ff4e461c2"
 {#uuid "360e51ca-9254-450c-bae0-2d14d66be15f"
  [#uuid "671137f3-cabb-4bcc-9d67-fc613b906765"],
  #uuid "3d11bb16-1c31-4de2-98c8-d2766834f81f"
  [#uuid "634a36fd-eb2e-41c8-88b9-df63624f1e73"],
  #uuid "b0a3ba07-1603-48fa-a743-c0b3e24040b6"
  [#uuid "5acf687b-afb3-4999-88ac-b4fc269b4181"]}}
=== entry id 11 ===
Function: :exhaust-input
ZooKeeper Timestamp: 1455763817677
Peers: [#uuid "671137f3-cabb-4bcc-9d67-fc613b906765" #uuid "634a36fd-eb2e-41c8-88b9-df63624f1e73" #uuid "5acf687b-afb3-4999-88ac-b4fc269b4181"]
Jobs: [#uuid "fcc1f018-b906-44e5-83cd-f87ff4e461c2"]
Allocations ...
{#uuid "fcc1f018-b906-44e5-83cd-f87ff4e461c2"
 {#uuid "360e51ca-9254-450c-bae0-2d14d66be15f"
  [#uuid "671137f3-cabb-4bcc-9d67-fc613b906765"],
  #uuid "3d11bb16-1c31-4de2-98c8-d2766834f81f"
  [#uuid "634a36fd-eb2e-41c8-88b9-df63624f1e73"],
  #uuid "b0a3ba07-1603-48fa-a743-c0b3e24040b6"
  [#uuid "5acf687b-afb3-4999-88ac-b4fc269b4181"]}}
=== entry id 12 ===
Function: :seal-output
ZooKeeper Timestamp: 1455763817698
Peers: [#uuid "671137f3-cabb-4bcc-9d67-fc613b906765" #uuid "634a36fd-eb2e-41c8-88b9-df63624f1e73" #uuid "5acf687b-afb3-4999-88ac-b4fc269b4181"]
Jobs: []
Allocations ...
{}
=== entry id 13 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763817732
Peers: [#uuid "634a36fd-eb2e-41c8-88b9-df63624f1e73" #uuid "5acf687b-afb3-4999-88ac-b4fc269b4181"]
Jobs: []
Allocations ...
{}
=== entry id 14 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763817733
Peers: [#uuid "634a36fd-eb2e-41c8-88b9-df63624f1e73" #uuid "5acf687b-afb3-4999-88ac-b4fc269b4181"]
Jobs: []
Allocations ...
{}
=== entry id 15 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763817780
Peers: [#uuid "5acf687b-afb3-4999-88ac-b4fc269b4181"]
Jobs: []
Allocations ...
{}
=== entry id 16 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763837836
Peers: [#uuid "5acf687b-afb3-4999-88ac-b4fc269b4181"]
Jobs: []
Allocations ...
{}
=== entry id 17 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763837940
Peers: [#uuid "5acf687b-afb3-4999-88ac-b4fc269b4181"]
Jobs: []
Allocations ...
{}
=== entry id 18 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763837947
Peers: []
Jobs: []
Allocations ...
{}
=== entry id 19 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763837965
Peers: []
Jobs: []
Allocations ...
{}
=== entry id 20 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763838044
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e"]
Jobs: []
Allocations ...
{}
=== entry id 21 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763838060
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e"]
Jobs: []
Allocations ...
{}
=== entry id 22 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763838074
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e"]
Jobs: []
Allocations ...
{}
=== entry id 23 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763838178
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e"]
Jobs: []
Allocations ...
{}
=== entry id 24 ===
Function: :notify-join-cluster
ZooKeeper Timestamp: 1455763838285
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e"]
Jobs: []
Allocations ...
{}
=== entry id 25 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763838313
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e"]
Jobs: []
Allocations ...
{}
=== entry id 26 ===
Function: :accept-join-cluster
ZooKeeper Timestamp: 1455763838419
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e" #uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad"]
Jobs: []
Allocations ...
{}
=== entry id 27 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763838465
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e" #uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad"]
Jobs: []
Allocations ...
{}
=== entry id 28 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763838487
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e" #uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad"]
Jobs: []
Allocations ...
{}
=== entry id 29 ===
Function: :notify-join-cluster
ZooKeeper Timestamp: 1455763838511
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e" #uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad"]
Jobs: []
Allocations ...
{}
=== entry id 30 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763838522
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e" #uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad"]
Jobs: []
Allocations ...
{}
=== entry id 31 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763838602
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e" #uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad"]
Jobs: []
Allocations ...
{}
=== entry id 32 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763838664
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e" #uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad"]
Jobs: []
Allocations ...
{}
=== entry id 33 ===
Function: :submit-job
ZooKeeper Timestamp: 1455763838674
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e" #uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad"]
Jobs: [#uuid "a138454f-a4c1-4d9c-99e6-8eb63f4014b3"]
Allocations ...
{}
=== entry id 34 ===
Function: :notify-join-cluster
ZooKeeper Timestamp: 1455763838697
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e" #uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad"]
Jobs: [#uuid "a138454f-a4c1-4d9c-99e6-8eb63f4014b3"]
Allocations ...
{}
=== entry id 35 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763838707
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e" #uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad"]
Jobs: [#uuid "a138454f-a4c1-4d9c-99e6-8eb63f4014b3"]
Allocations ...
{}
=== entry id 36 ===
Function: :accept-join-cluster
ZooKeeper Timestamp: 1455763838728
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e" #uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad" #uuid "17a7260e-478e-42b7-9440-abc94b0c0006"]
Jobs: [#uuid "a138454f-a4c1-4d9c-99e6-8eb63f4014b3"]
Allocations ...
{#uuid "a138454f-a4c1-4d9c-99e6-8eb63f4014b3"
 {#uuid "9d0ca6b3-1855-46be-b3ce-9097d1a5326b"
  [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e"],
  #uuid "878cefd3-404c-4423-8ef5-24d20a59b1c9"
  [#uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad"],
  #uuid "03bafd14-263d-4e48-8da6-d9deaa0046bc"
  [#uuid "17a7260e-478e-42b7-9440-abc94b0c0006"]}}
=== entry id 37 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763838737
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e" #uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad" #uuid "17a7260e-478e-42b7-9440-abc94b0c0006"]
Jobs: [#uuid "a138454f-a4c1-4d9c-99e6-8eb63f4014b3"]
Allocations ...
{#uuid "a138454f-a4c1-4d9c-99e6-8eb63f4014b3"
 {#uuid "9d0ca6b3-1855-46be-b3ce-9097d1a5326b"
  [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e"],
  #uuid "878cefd3-404c-4423-8ef5-24d20a59b1c9"
  [#uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad"],
  #uuid "03bafd14-263d-4e48-8da6-d9deaa0046bc"
  [#uuid "17a7260e-478e-42b7-9440-abc94b0c0006"]}}
=== entry id 38 ===
Function: :signal-ready
ZooKeeper Timestamp: 1455763838825
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e" #uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad" #uuid "17a7260e-478e-42b7-9440-abc94b0c0006"]
Jobs: [#uuid "a138454f-a4c1-4d9c-99e6-8eb63f4014b3"]
Allocations ...
{#uuid "a138454f-a4c1-4d9c-99e6-8eb63f4014b3"
 {#uuid "9d0ca6b3-1855-46be-b3ce-9097d1a5326b"
  [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e"],
  #uuid "878cefd3-404c-4423-8ef5-24d20a59b1c9"
  [#uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad"],
  #uuid "03bafd14-263d-4e48-8da6-d9deaa0046bc"
  [#uuid "17a7260e-478e-42b7-9440-abc94b0c0006"]}}
=== entry id 39 ===
Function: :signal-ready
ZooKeeper Timestamp: 1455763838825
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e" #uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad" #uuid "17a7260e-478e-42b7-9440-abc94b0c0006"]
Jobs: [#uuid "a138454f-a4c1-4d9c-99e6-8eb63f4014b3"]
Allocations ...
{#uuid "a138454f-a4c1-4d9c-99e6-8eb63f4014b3"
 {#uuid "9d0ca6b3-1855-46be-b3ce-9097d1a5326b"
  [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e"],
  #uuid "878cefd3-404c-4423-8ef5-24d20a59b1c9"
  [#uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad"],
  #uuid "03bafd14-263d-4e48-8da6-d9deaa0046bc"
  [#uuid "17a7260e-478e-42b7-9440-abc94b0c0006"]}}
=== entry id 40 ===
Function: :signal-ready
ZooKeeper Timestamp: 1455763838826
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e" #uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad" #uuid "17a7260e-478e-42b7-9440-abc94b0c0006"]
Jobs: [#uuid "a138454f-a4c1-4d9c-99e6-8eb63f4014b3"]
Allocations ...
{#uuid "a138454f-a4c1-4d9c-99e6-8eb63f4014b3"
 {#uuid "9d0ca6b3-1855-46be-b3ce-9097d1a5326b"
  [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e"],
  #uuid "878cefd3-404c-4423-8ef5-24d20a59b1c9"
  [#uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad"],
  #uuid "03bafd14-263d-4e48-8da6-d9deaa0046bc"
  [#uuid "17a7260e-478e-42b7-9440-abc94b0c0006"]}}
=== entry id 41 ===
Function: :accept-join-cluster
ZooKeeper Timestamp: 1455763838875
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e" #uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad" #uuid "17a7260e-478e-42b7-9440-abc94b0c0006" #uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501"]
Jobs: [#uuid "a138454f-a4c1-4d9c-99e6-8eb63f4014b3"]
Allocations ...
{#uuid "a138454f-a4c1-4d9c-99e6-8eb63f4014b3"
 {#uuid "9d0ca6b3-1855-46be-b3ce-9097d1a5326b"
  [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e"
   #uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501"],
  #uuid "878cefd3-404c-4423-8ef5-24d20a59b1c9"
  [#uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad"],
  #uuid "03bafd14-263d-4e48-8da6-d9deaa0046bc"
  [#uuid "17a7260e-478e-42b7-9440-abc94b0c0006"]}}
=== entry id 42 ===
Function: :signal-ready
ZooKeeper Timestamp: 1455763838994
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e" #uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad" #uuid "17a7260e-478e-42b7-9440-abc94b0c0006" #uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501"]
Jobs: [#uuid "a138454f-a4c1-4d9c-99e6-8eb63f4014b3"]
Allocations ...
{#uuid "a138454f-a4c1-4d9c-99e6-8eb63f4014b3"
 {#uuid "9d0ca6b3-1855-46be-b3ce-9097d1a5326b"
  [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e"
   #uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501"],
  #uuid "878cefd3-404c-4423-8ef5-24d20a59b1c9"
  [#uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad"],
  #uuid "03bafd14-263d-4e48-8da6-d9deaa0046bc"
  [#uuid "17a7260e-478e-42b7-9440-abc94b0c0006"]}}
=== entry id 43 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763839546
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e" #uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad" #uuid "17a7260e-478e-42b7-9440-abc94b0c0006" #uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501"]
Jobs: [#uuid "a138454f-a4c1-4d9c-99e6-8eb63f4014b3"]
Allocations ...
{#uuid "a138454f-a4c1-4d9c-99e6-8eb63f4014b3"
 {#uuid "9d0ca6b3-1855-46be-b3ce-9097d1a5326b"
  [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e"
   #uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501"],
  #uuid "878cefd3-404c-4423-8ef5-24d20a59b1c9"
  [#uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad"],
  #uuid "03bafd14-263d-4e48-8da6-d9deaa0046bc"
  [#uuid "17a7260e-478e-42b7-9440-abc94b0c0006"]}}
=== entry id 44 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763839597
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e" #uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad" #uuid "17a7260e-478e-42b7-9440-abc94b0c0006" #uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501"]
Jobs: [#uuid "a138454f-a4c1-4d9c-99e6-8eb63f4014b3"]
Allocations ...
{#uuid "a138454f-a4c1-4d9c-99e6-8eb63f4014b3"
 {#uuid "9d0ca6b3-1855-46be-b3ce-9097d1a5326b"
  [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e"
   #uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501"],
  #uuid "878cefd3-404c-4423-8ef5-24d20a59b1c9"
  [#uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad"],
  #uuid "03bafd14-263d-4e48-8da6-d9deaa0046bc"
  [#uuid "17a7260e-478e-42b7-9440-abc94b0c0006"]}}
=== entry id 45 ===
Function: :notify-join-cluster
ZooKeeper Timestamp: 1455763839627
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e" #uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad" #uuid "17a7260e-478e-42b7-9440-abc94b0c0006" #uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501"]
Jobs: [#uuid "a138454f-a4c1-4d9c-99e6-8eb63f4014b3"]
Allocations ...
{#uuid "a138454f-a4c1-4d9c-99e6-8eb63f4014b3"
 {#uuid "9d0ca6b3-1855-46be-b3ce-9097d1a5326b"
  [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e"
   #uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501"],
  #uuid "878cefd3-404c-4423-8ef5-24d20a59b1c9"
  [#uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad"],
  #uuid "03bafd14-263d-4e48-8da6-d9deaa0046bc"
  [#uuid "17a7260e-478e-42b7-9440-abc94b0c0006"]}}
=== entry id 46 ===
Function: :exhaust-input
ZooKeeper Timestamp: 1455763839689
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e" #uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad" #uuid "17a7260e-478e-42b7-9440-abc94b0c0006" #uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501"]
Jobs: [#uuid "a138454f-a4c1-4d9c-99e6-8eb63f4014b3"]
Allocations ...
{#uuid "a138454f-a4c1-4d9c-99e6-8eb63f4014b3"
 {#uuid "9d0ca6b3-1855-46be-b3ce-9097d1a5326b"
  [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e"
   #uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501"],
  #uuid "878cefd3-404c-4423-8ef5-24d20a59b1c9"
  [#uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad"],
  #uuid "03bafd14-263d-4e48-8da6-d9deaa0046bc"
  [#uuid "17a7260e-478e-42b7-9440-abc94b0c0006"]}}
=== entry id 47 ===
Function: :accept-join-cluster
ZooKeeper Timestamp: 1455763839747
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e" #uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad" #uuid "17a7260e-478e-42b7-9440-abc94b0c0006" #uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501" #uuid "650ca9bd-8aa2-4b97-bbb7-89a78b2c9c31"]
Jobs: [#uuid "a138454f-a4c1-4d9c-99e6-8eb63f4014b3"]
Allocations ...
{#uuid "a138454f-a4c1-4d9c-99e6-8eb63f4014b3"
 {#uuid "9d0ca6b3-1855-46be-b3ce-9097d1a5326b"
  [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e"
   #uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501"
   #uuid "650ca9bd-8aa2-4b97-bbb7-89a78b2c9c31"],
  #uuid "878cefd3-404c-4423-8ef5-24d20a59b1c9"
  [#uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad"],
  #uuid "03bafd14-263d-4e48-8da6-d9deaa0046bc"
  [#uuid "17a7260e-478e-42b7-9440-abc94b0c0006"]}}
=== entry id 48 ===
Function: :notify-join-cluster
ZooKeeper Timestamp: 1455763839752
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e" #uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad" #uuid "17a7260e-478e-42b7-9440-abc94b0c0006" #uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501" #uuid "650ca9bd-8aa2-4b97-bbb7-89a78b2c9c31"]
Jobs: [#uuid "a138454f-a4c1-4d9c-99e6-8eb63f4014b3"]
Allocations ...
{#uuid "a138454f-a4c1-4d9c-99e6-8eb63f4014b3"
 {#uuid "9d0ca6b3-1855-46be-b3ce-9097d1a5326b"
  [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e"
   #uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501"
   #uuid "650ca9bd-8aa2-4b97-bbb7-89a78b2c9c31"],
  #uuid "878cefd3-404c-4423-8ef5-24d20a59b1c9"
  [#uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad"],
  #uuid "03bafd14-263d-4e48-8da6-d9deaa0046bc"
  [#uuid "17a7260e-478e-42b7-9440-abc94b0c0006"]}}
=== entry id 49 ===
Function: :seal-output
ZooKeeper Timestamp: 1455763839825
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e" #uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad" #uuid "17a7260e-478e-42b7-9440-abc94b0c0006" #uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501" #uuid "650ca9bd-8aa2-4b97-bbb7-89a78b2c9c31"]
Jobs: []
Allocations ...
{}
=== entry id 50 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763839875
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e" #uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad" #uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501" #uuid "650ca9bd-8aa2-4b97-bbb7-89a78b2c9c31"]
Jobs: []
Allocations ...
{}
=== entry id 51 ===
Function: :accept-join-cluster
ZooKeeper Timestamp: 1455763839888
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e" #uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad" #uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501" #uuid "650ca9bd-8aa2-4b97-bbb7-89a78b2c9c31" #uuid "024036ea-89b0-42e3-aa0e-f1acfcdd164b"]
Jobs: []
Allocations ...
{}
=== entry id 52 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763839979
Peers: [#uuid "ac11b334-1a46-4ce5-9a0f-eba2ff14c86e" #uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad" #uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501" #uuid "024036ea-89b0-42e3-aa0e-f1acfcdd164b"]
Jobs: []
Allocations ...
{}
=== entry id 53 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763839983
Peers: [#uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad" #uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501" #uuid "024036ea-89b0-42e3-aa0e-f1acfcdd164b"]
Jobs: []
Allocations ...
{}
=== entry id 54 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763839986
Peers: [#uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad" #uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501" #uuid "024036ea-89b0-42e3-aa0e-f1acfcdd164b"]
Jobs: []
Allocations ...
{}
=== entry id 55 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763839987
Peers: [#uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad" #uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501" #uuid "024036ea-89b0-42e3-aa0e-f1acfcdd164b"]
Jobs: []
Allocations ...
{}
=== entry id 56 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763840027
Peers: [#uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad" #uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501"]
Jobs: []
Allocations ...
{}
=== entry id 57 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763858640
Peers: [#uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad" #uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501"]
Jobs: []
Allocations ...
{}
=== entry id 58 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763858723
Peers: [#uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad" #uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501"]
Jobs: []
Allocations ...
{}
=== entry id 59 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763858822
Peers: [#uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad" #uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501"]
Jobs: []
Allocations ...
{}
=== entry id 60 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763858959
Peers: [#uuid "af29e4d9-59bf-487a-91ae-b72c5bdb90ad" #uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501"]
Jobs: []
Allocations ...
{}
=== entry id 61 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763859155
Peers: [#uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501"]
Jobs: []
Allocations ...
{}
=== entry id 62 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763859192
Peers: [#uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501"]
Jobs: []
Allocations ...
{}
=== entry id 63 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763859198
Peers: [#uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501"]
Jobs: []
Allocations ...
{}
=== entry id 64 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763859252
Peers: [#uuid "a5c93c3a-28d6-4f9e-8b84-8341fc502501"]
Jobs: []
Allocations ...
{}
=== entry id 65 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763859303
Peers: []
Jobs: []
Allocations ...
{}
=== entry id 66 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763859309
Peers: []
Jobs: []
Allocations ...
{}
=== entry id 67 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763859345
Peers: []
Jobs: []
Allocations ...
{}
=== entry id 68 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763859350
Peers: []
Jobs: []
Allocations ...
{}
=== entry id 69 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763859451
Peers: []
Jobs: []
Allocations ...
{}
=== entry id 70 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763859455
Peers: []
Jobs: []
Allocations ...
{}
=== entry id 71 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763859467
Peers: [#uuid "8cb5c76d-e5d8-4244-aa12-02e74ee1bc1d"]
Jobs: []
Allocations ...
{}
=== entry id 72 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763859549
Peers: [#uuid "8cb5c76d-e5d8-4244-aa12-02e74ee1bc1d"]
Jobs: []
Allocations ...
{}
=== entry id 73 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763859553
Peers: [#uuid "8cb5c76d-e5d8-4244-aa12-02e74ee1bc1d"]
Jobs: []
Allocations ...
{}
=== entry id 74 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763859604
Peers: [#uuid "8cb5c76d-e5d8-4244-aa12-02e74ee1bc1d"]
Jobs: []
Allocations ...
{}
=== entry id 75 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763859607
Peers: [#uuid "8cb5c76d-e5d8-4244-aa12-02e74ee1bc1d"]
Jobs: []
Allocations ...
{}
=== entry id 76 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763859845
Peers: [#uuid "8cb5c76d-e5d8-4244-aa12-02e74ee1bc1d"]
Jobs: []
Allocations ...
{}
=== entry id 77 ===
Function: :notify-join-cluster
ZooKeeper Timestamp: 1455763859862
Peers: [#uuid "8cb5c76d-e5d8-4244-aa12-02e74ee1bc1d"]
Jobs: []
Allocations ...
{}
=== entry id 78 ===
Function: :accept-join-cluster
ZooKeeper Timestamp: 1455763859882
Peers: [#uuid "8cb5c76d-e5d8-4244-aa12-02e74ee1bc1d" #uuid "16542a41-c0bf-4c21-97ee-144919f7f03f"]
Jobs: []
Allocations ...
{}
=== entry id 79 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763859951
Peers: [#uuid "8cb5c76d-e5d8-4244-aa12-02e74ee1bc1d" #uuid "16542a41-c0bf-4c21-97ee-144919f7f03f"]
Jobs: []
Allocations ...
{}
=== entry id 80 ===
Function: :notify-join-cluster
ZooKeeper Timestamp: 1455763859973
Peers: [#uuid "8cb5c76d-e5d8-4244-aa12-02e74ee1bc1d" #uuid "16542a41-c0bf-4c21-97ee-144919f7f03f"]
Jobs: []
Allocations ...
{}
=== entry id 81 ===
Function: :accept-join-cluster
ZooKeeper Timestamp: 1455763859984
Peers: [#uuid "8cb5c76d-e5d8-4244-aa12-02e74ee1bc1d" #uuid "16542a41-c0bf-4c21-97ee-144919f7f03f" #uuid "b282c8bb-54d1-4c19-87a2-883c28c66af6"]
Jobs: []
Allocations ...
{}
=== entry id 82 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763860369
Peers: [#uuid "8cb5c76d-e5d8-4244-aa12-02e74ee1bc1d" #uuid "16542a41-c0bf-4c21-97ee-144919f7f03f" #uuid "b282c8bb-54d1-4c19-87a2-883c28c66af6"]
Jobs: []
Allocations ...
{}
=== entry id 83 ===
Function: :notify-join-cluster
ZooKeeper Timestamp: 1455763860390
Peers: [#uuid "8cb5c76d-e5d8-4244-aa12-02e74ee1bc1d" #uuid "16542a41-c0bf-4c21-97ee-144919f7f03f" #uuid "b282c8bb-54d1-4c19-87a2-883c28c66af6"]
Jobs: []
Allocations ...
{}
=== entry id 84 ===
Function: :accept-join-cluster
ZooKeeper Timestamp: 1455763860404
Peers: [#uuid "8cb5c76d-e5d8-4244-aa12-02e74ee1bc1d" #uuid "16542a41-c0bf-4c21-97ee-144919f7f03f" #uuid "b282c8bb-54d1-4c19-87a2-883c28c66af6" #uuid "3cd48295-6e65-4d4b-b2e8-2757b70f1c4d"]
Jobs: []
Allocations ...
{}
=== entry id 85 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763860439
Peers: [#uuid "8cb5c76d-e5d8-4244-aa12-02e74ee1bc1d" #uuid "16542a41-c0bf-4c21-97ee-144919f7f03f" #uuid "b282c8bb-54d1-4c19-87a2-883c28c66af6" #uuid "3cd48295-6e65-4d4b-b2e8-2757b70f1c4d"]
Jobs: []
Allocations ...
{}
=== entry id 86 ===
Function: :notify-join-cluster
ZooKeeper Timestamp: 1455763860464
Peers: [#uuid "8cb5c76d-e5d8-4244-aa12-02e74ee1bc1d" #uuid "16542a41-c0bf-4c21-97ee-144919f7f03f" #uuid "b282c8bb-54d1-4c19-87a2-883c28c66af6" #uuid "3cd48295-6e65-4d4b-b2e8-2757b70f1c4d"]
Jobs: []
Allocations ...
{}
=== entry id 87 ===
Function: :accept-join-cluster
ZooKeeper Timestamp: 1455763860484
Peers: [#uuid "8cb5c76d-e5d8-4244-aa12-02e74ee1bc1d" #uuid "16542a41-c0bf-4c21-97ee-144919f7f03f" #uuid "b282c8bb-54d1-4c19-87a2-883c28c66af6" #uuid "3cd48295-6e65-4d4b-b2e8-2757b70f1c4d" #uuid "96b4a054-4a57-4605-a472-48ba3e3273db"]
Jobs: []
Allocations ...
{}
=== entry id 88 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763864199
Peers: [#uuid "16542a41-c0bf-4c21-97ee-144919f7f03f" #uuid "b282c8bb-54d1-4c19-87a2-883c28c66af6" #uuid "3cd48295-6e65-4d4b-b2e8-2757b70f1c4d" #uuid "96b4a054-4a57-4605-a472-48ba3e3273db"]
Jobs: []
Allocations ...
{}
=== entry id 89 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763864199
Peers: [#uuid "16542a41-c0bf-4c21-97ee-144919f7f03f" #uuid "b282c8bb-54d1-4c19-87a2-883c28c66af6" #uuid "3cd48295-6e65-4d4b-b2e8-2757b70f1c4d" #uuid "96b4a054-4a57-4605-a472-48ba3e3273db"]
Jobs: []
Allocations ...
{}
=== entry id 90 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763864201
Peers: [#uuid "16542a41-c0bf-4c21-97ee-144919f7f03f" #uuid "b282c8bb-54d1-4c19-87a2-883c28c66af6" #uuid "3cd48295-6e65-4d4b-b2e8-2757b70f1c4d" #uuid "96b4a054-4a57-4605-a472-48ba3e3273db"]
Jobs: []
Allocations ...
{}
=== entry id 91 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763864208
Peers: [#uuid "16542a41-c0bf-4c21-97ee-144919f7f03f" #uuid "3cd48295-6e65-4d4b-b2e8-2757b70f1c4d" #uuid "96b4a054-4a57-4605-a472-48ba3e3273db"]
Jobs: []
Allocations ...
{}
=== entry id 92 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763864225
Peers: [#uuid "3cd48295-6e65-4d4b-b2e8-2757b70f1c4d" #uuid "96b4a054-4a57-4605-a472-48ba3e3273db"]
Jobs: []
Allocations ...
{}
=== entry id 93 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763914280
Peers: [#uuid "3cd48295-6e65-4d4b-b2e8-2757b70f1c4d" #uuid "96b4a054-4a57-4605-a472-48ba3e3273db"]
Jobs: []
Allocations ...
{}
=== entry id 94 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763914349
Peers: [#uuid "3cd48295-6e65-4d4b-b2e8-2757b70f1c4d" #uuid "96b4a054-4a57-4605-a472-48ba3e3273db"]
Jobs: []
Allocations ...
{}
=== entry id 95 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763914428
Peers: [#uuid "3cd48295-6e65-4d4b-b2e8-2757b70f1c4d" #uuid "96b4a054-4a57-4605-a472-48ba3e3273db"]
Jobs: []
Allocations ...
{}
=== entry id 96 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763914552
Peers: [#uuid "3cd48295-6e65-4d4b-b2e8-2757b70f1c4d" #uuid "96b4a054-4a57-4605-a472-48ba3e3273db"]
Jobs: []
Allocations ...
{}
=== entry id 97 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763914699
Peers: [#uuid "3cd48295-6e65-4d4b-b2e8-2757b70f1c4d" #uuid "96b4a054-4a57-4605-a472-48ba3e3273db"]
Jobs: []
Allocations ...
{}
=== entry id 98 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763914825
Peers: [#uuid "3cd48295-6e65-4d4b-b2e8-2757b70f1c4d" #uuid "96b4a054-4a57-4605-a472-48ba3e3273db"]
Jobs: []
Allocations ...
{}
=== entry id 99 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763915036
Peers: [#uuid "3cd48295-6e65-4d4b-b2e8-2757b70f1c4d" #uuid "96b4a054-4a57-4605-a472-48ba3e3273db"]
Jobs: []
Allocations ...
{}
=== entry id 100 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763915115
Peers: [#uuid "96b4a054-4a57-4605-a472-48ba3e3273db"]
Jobs: []
Allocations ...
{}
=== entry id 101 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763915200
Peers: [#uuid "96b4a054-4a57-4605-a472-48ba3e3273db"]
Jobs: []
Allocations ...
{}
=== entry id 102 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763915231
Peers: [#uuid "96b4a054-4a57-4605-a472-48ba3e3273db"]
Jobs: []
Allocations ...
{}
=== entry id 103 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763915360
Peers: [#uuid "96b4a054-4a57-4605-a472-48ba3e3273db"]
Jobs: []
Allocations ...
{}
=== entry id 104 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763915368
Peers: [#uuid "96b4a054-4a57-4605-a472-48ba3e3273db"]
Jobs: []
Allocations ...
{}
=== entry id 105 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763915423
Peers: [#uuid "96b4a054-4a57-4605-a472-48ba3e3273db"]
Jobs: []
Allocations ...
{}
=== entry id 106 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763915510
Peers: [#uuid "96b4a054-4a57-4605-a472-48ba3e3273db"]
Jobs: []
Allocations ...
{}
=== entry id 107 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763915552
Peers: []
Jobs: []
Allocations ...
{}
=== entry id 108 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763915567
Peers: []
Jobs: []
Allocations ...
{}
=== entry id 109 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763915589
Peers: []
Jobs: []
Allocations ...
{}
=== entry id 110 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763915601
Peers: []
Jobs: []
Allocations ...
{}
=== entry id 111 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763915649
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: []
Allocations ...
{}
=== entry id 112 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763915818
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: []
Allocations ...
{}
=== entry id 113 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763915825
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: []
Allocations ...
{}
=== entry id 114 ===
Function: :submit-job
ZooKeeper Timestamp: 1455763915910
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"]
Allocations ...
{}
=== entry id 115 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763915923
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"]
Allocations ...
{}
=== entry id 116 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763915943
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"]
Allocations ...
{}
=== entry id 117 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763915993
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"]
Allocations ...
{}
=== entry id 118 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763916091
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"]
Allocations ...
{}
=== entry id 119 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763916138
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"]
Allocations ...
{}
=== entry id 120 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763916147
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"]
Allocations ...
{}
=== entry id 121 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763916147
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"]
Allocations ...
{}
=== entry id 122 ===
Function: :submit-job
ZooKeeper Timestamp: 1455763916265
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{}
=== entry id 123 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763916366
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{}
=== entry id 124 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763916392
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{}
=== entry id 125 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763916403
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{}
=== entry id 126 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763916407
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{}
=== entry id 127 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763916554
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{}
=== entry id 128 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763916572
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{}
=== entry id 129 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763916737
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{}
=== entry id 130 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763916747
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{}
=== entry id 131 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763916782
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{}
=== entry id 132 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763916790
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{}
=== entry id 133 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763916793
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{}
=== entry id 134 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763916830
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{}
=== entry id 135 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763916869
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{}
=== entry id 136 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763916888
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{}
=== entry id 137 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763916906
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{}
=== entry id 138 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763916917
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{}
=== entry id 139 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763916920
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{}
=== entry id 140 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763916934
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{}
=== entry id 141 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763917001
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{}
=== entry id 142 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763917025
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{}
=== entry id 143 ===
Function: :notify-join-cluster
ZooKeeper Timestamp: 1455763917140
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{}
=== entry id 144 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763917142
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{}
=== entry id 145 ===
Function: :accept-join-cluster
ZooKeeper Timestamp: 1455763917163
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{}
=== entry id 146 ===
Function: :abort-join-cluster
ZooKeeper Timestamp: 1455763917173
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{}
=== entry id 147 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763917263
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{}
=== entry id 148 ===
Function: :notify-join-cluster
ZooKeeper Timestamp: 1455763917292
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{}
=== entry id 149 ===
Function: :accept-join-cluster
ZooKeeper Timestamp: 1455763917316
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"
 {#uuid "5f4e9e9d-b635-4e6e-a49a-792ebfc6f76e"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"],
  #uuid "7d40d0a4-792a-4010-8bf8-f893b9b42fcc"
  [#uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"],
  #uuid "fb263f50-28b8-45ca-af1b-3d973d4069df"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]}}
=== entry id 150 ===
Function: :signal-ready
ZooKeeper Timestamp: 1455763917396
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"
 {#uuid "5f4e9e9d-b635-4e6e-a49a-792ebfc6f76e"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"],
  #uuid "7d40d0a4-792a-4010-8bf8-f893b9b42fcc"
  [#uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"],
  #uuid "fb263f50-28b8-45ca-af1b-3d973d4069df"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]}}
=== entry id 151 ===
Function: :signal-ready
ZooKeeper Timestamp: 1455763917399
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"
 {#uuid "5f4e9e9d-b635-4e6e-a49a-792ebfc6f76e"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"],
  #uuid "7d40d0a4-792a-4010-8bf8-f893b9b42fcc"
  [#uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"],
  #uuid "fb263f50-28b8-45ca-af1b-3d973d4069df"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]}}
=== entry id 152 ===
Function: :signal-ready
ZooKeeper Timestamp: 1455763917399
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"
 {#uuid "5f4e9e9d-b635-4e6e-a49a-792ebfc6f76e"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"],
  #uuid "7d40d0a4-792a-4010-8bf8-f893b9b42fcc"
  [#uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"],
  #uuid "fb263f50-28b8-45ca-af1b-3d973d4069df"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]}}
=== entry id 153 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763917434
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"
 {#uuid "5f4e9e9d-b635-4e6e-a49a-792ebfc6f76e"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"],
  #uuid "7d40d0a4-792a-4010-8bf8-f893b9b42fcc"
  [#uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"],
  #uuid "fb263f50-28b8-45ca-af1b-3d973d4069df"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]}}
=== entry id 154 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763917460
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"
 {#uuid "5f4e9e9d-b635-4e6e-a49a-792ebfc6f76e"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"],
  #uuid "7d40d0a4-792a-4010-8bf8-f893b9b42fcc"
  [#uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"],
  #uuid "fb263f50-28b8-45ca-af1b-3d973d4069df"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]}}
=== entry id 155 ===
Function: :notify-join-cluster
ZooKeeper Timestamp: 1455763917538
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"
 {#uuid "5f4e9e9d-b635-4e6e-a49a-792ebfc6f76e"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"],
  #uuid "7d40d0a4-792a-4010-8bf8-f893b9b42fcc"
  [#uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"],
  #uuid "fb263f50-28b8-45ca-af1b-3d973d4069df"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]}}
=== entry id 156 ===
Function: :notify-join-cluster
ZooKeeper Timestamp: 1455763917571
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"
 {#uuid "5f4e9e9d-b635-4e6e-a49a-792ebfc6f76e"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"],
  #uuid "7d40d0a4-792a-4010-8bf8-f893b9b42fcc"
  [#uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"],
  #uuid "fb263f50-28b8-45ca-af1b-3d973d4069df"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]}}
=== entry id 157 ===
Function: :accept-join-cluster
ZooKeeper Timestamp: 1455763917580
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"
 {#uuid "5f4e9e9d-b635-4e6e-a49a-792ebfc6f76e"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"],
  #uuid "7d40d0a4-792a-4010-8bf8-f893b9b42fcc"
  [#uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"],
  #uuid "fb263f50-28b8-45ca-af1b-3d973d4069df"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]}}
=== entry id 158 ===
Function: :accept-join-cluster
ZooKeeper Timestamp: 1455763917596
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"
 {#uuid "5f4e9e9d-b635-4e6e-a49a-792ebfc6f76e"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"],
  #uuid "7d40d0a4-792a-4010-8bf8-f893b9b42fcc"
  [#uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"],
  #uuid "fb263f50-28b8-45ca-af1b-3d973d4069df"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]}}
=== entry id 159 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763917623
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"
 {#uuid "5f4e9e9d-b635-4e6e-a49a-792ebfc6f76e"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"],
  #uuid "7d40d0a4-792a-4010-8bf8-f893b9b42fcc"
  [#uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"],
  #uuid "fb263f50-28b8-45ca-af1b-3d973d4069df"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]}}
=== entry id 160 ===
Function: :notify-join-cluster
ZooKeeper Timestamp: 1455763917695
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"
 {#uuid "5f4e9e9d-b635-4e6e-a49a-792ebfc6f76e"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"],
  #uuid "7d40d0a4-792a-4010-8bf8-f893b9b42fcc"
  [#uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"],
  #uuid "fb263f50-28b8-45ca-af1b-3d973d4069df"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]}}
=== entry id 161 ===
Function: :signal-ready
ZooKeeper Timestamp: 1455763917702
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"
 {#uuid "5f4e9e9d-b635-4e6e-a49a-792ebfc6f76e"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"],
  #uuid "7d40d0a4-792a-4010-8bf8-f893b9b42fcc"
  [#uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"],
  #uuid "fb263f50-28b8-45ca-af1b-3d973d4069df"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]}}
=== entry id 162 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763917716
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"
 {#uuid "5f4e9e9d-b635-4e6e-a49a-792ebfc6f76e"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"],
  #uuid "7d40d0a4-792a-4010-8bf8-f893b9b42fcc"
  [#uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"],
  #uuid "fb263f50-28b8-45ca-af1b-3d973d4069df"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]}}
=== entry id 163 ===
Function: :signal-ready
ZooKeeper Timestamp: 1455763917717
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"
 {#uuid "5f4e9e9d-b635-4e6e-a49a-792ebfc6f76e"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"],
  #uuid "7d40d0a4-792a-4010-8bf8-f893b9b42fcc"
  [#uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"],
  #uuid "fb263f50-28b8-45ca-af1b-3d973d4069df"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]}}
=== entry id 164 ===
Function: :accept-join-cluster
ZooKeeper Timestamp: 1455763917728
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"
 {#uuid "5f4e9e9d-b635-4e6e-a49a-792ebfc6f76e"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"],
  #uuid "7d40d0a4-792a-4010-8bf8-f893b9b42fcc"
  [#uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"
   #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"],
  #uuid "fb263f50-28b8-45ca-af1b-3d973d4069df"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]}}
=== entry id 165 ===
Function: :notify-join-cluster
ZooKeeper Timestamp: 1455763917825
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"
 {#uuid "5f4e9e9d-b635-4e6e-a49a-792ebfc6f76e"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"],
  #uuid "7d40d0a4-792a-4010-8bf8-f893b9b42fcc"
  [#uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"
   #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"],
  #uuid "fb263f50-28b8-45ca-af1b-3d973d4069df"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]}}
=== entry id 166 ===
Function: :accept-join-cluster
ZooKeeper Timestamp: 1455763917873
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"
 {#uuid "5f4e9e9d-b635-4e6e-a49a-792ebfc6f76e"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"],
  #uuid "7d40d0a4-792a-4010-8bf8-f893b9b42fcc"
  [#uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"
   #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"
   #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"],
  #uuid "fb263f50-28b8-45ca-af1b-3d973d4069df"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]}}
=== entry id 167 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763917884
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"
 {#uuid "5f4e9e9d-b635-4e6e-a49a-792ebfc6f76e"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"],
  #uuid "7d40d0a4-792a-4010-8bf8-f893b9b42fcc"
  [#uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"
   #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"
   #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"],
  #uuid "fb263f50-28b8-45ca-af1b-3d973d4069df"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]}}
=== entry id 168 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763917995
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"
 {#uuid "5f4e9e9d-b635-4e6e-a49a-792ebfc6f76e"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"],
  #uuid "7d40d0a4-792a-4010-8bf8-f893b9b42fcc"
  [#uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"
   #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"
   #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"],
  #uuid "fb263f50-28b8-45ca-af1b-3d973d4069df"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]}}
=== entry id 169 ===
Function: :exhaust-input
ZooKeeper Timestamp: 1455763918149
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"
 {#uuid "5f4e9e9d-b635-4e6e-a49a-792ebfc6f76e"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"],
  #uuid "7d40d0a4-792a-4010-8bf8-f893b9b42fcc"
  [#uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"
   #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"
   #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"],
  #uuid "fb263f50-28b8-45ca-af1b-3d973d4069df"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]}}
=== entry id 170 ===
Function: :prepare-join-cluster
ZooKeeper Timestamp: 1455763918177
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"
 {#uuid "5f4e9e9d-b635-4e6e-a49a-792ebfc6f76e"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"],
  #uuid "7d40d0a4-792a-4010-8bf8-f893b9b42fcc"
  [#uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"
   #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"
   #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"],
  #uuid "fb263f50-28b8-45ca-af1b-3d973d4069df"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]}}
=== entry id 171 ===
Function: :signal-ready
ZooKeeper Timestamp: 1455763918263
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"
 {#uuid "5f4e9e9d-b635-4e6e-a49a-792ebfc6f76e"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"],
  #uuid "7d40d0a4-792a-4010-8bf8-f893b9b42fcc"
  [#uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"
   #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"
   #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"],
  #uuid "fb263f50-28b8-45ca-af1b-3d973d4069df"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]}}
=== entry id 172 ===
Function: :notify-join-cluster
ZooKeeper Timestamp: 1455763918285
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"
 {#uuid "5f4e9e9d-b635-4e6e-a49a-792ebfc6f76e"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"],
  #uuid "7d40d0a4-792a-4010-8bf8-f893b9b42fcc"
  [#uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"
   #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"
   #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"],
  #uuid "fb263f50-28b8-45ca-af1b-3d973d4069df"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]}}
=== entry id 173 ===
Function: :notify-join-cluster
ZooKeeper Timestamp: 1455763918331
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"]
Jobs: [#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff" #uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "d0d66e23-563a-4e9d-a639-ab2caf3f9eff"
 {#uuid "5f4e9e9d-b635-4e6e-a49a-792ebfc6f76e"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"],
  #uuid "7d40d0a4-792a-4010-8bf8-f893b9b42fcc"
  [#uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"
   #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"
   #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"],
  #uuid "fb263f50-28b8-45ca-af1b-3d973d4069df"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"]}}
=== entry id 174 ===
Function: :seal-output
ZooKeeper Timestamp: 1455763918367
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"]
Jobs: [#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"
 {#uuid "6291b715-775d-4a4c-a5b3-82d1eff4b4d0"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"
   #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"
   #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"
   #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"],
  #uuid "90766790-5e92-40ac-839f-0a213779c182"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"],
  #uuid "43e19540-a5d9-4ece-9409-0b4ceec833ea"
  [#uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"]}}
=== entry id 175 ===
Function: :signal-ready
ZooKeeper Timestamp: 1455763918377
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"]
Jobs: [#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"
 {#uuid "6291b715-775d-4a4c-a5b3-82d1eff4b4d0"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"
   #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"
   #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"
   #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"],
  #uuid "90766790-5e92-40ac-839f-0a213779c182"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"],
  #uuid "43e19540-a5d9-4ece-9409-0b4ceec833ea"
  [#uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"]}}
=== entry id 176 ===
Function: :accept-join-cluster
ZooKeeper Timestamp: 1455763918392
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d" #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5"]
Jobs: [#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"
 {#uuid "6291b715-775d-4a4c-a5b3-82d1eff4b4d0"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"
   #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"
   #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"
   #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"
   #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5"],
  #uuid "90766790-5e92-40ac-839f-0a213779c182"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"],
  #uuid "43e19540-a5d9-4ece-9409-0b4ceec833ea"
  [#uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"]}}
=== entry id 177 ===
Function: :notify-join-cluster
ZooKeeper Timestamp: 1455763918401
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d" #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5"]
Jobs: [#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"
 {#uuid "6291b715-775d-4a4c-a5b3-82d1eff4b4d0"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"
   #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"
   #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"
   #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"
   #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5"],
  #uuid "90766790-5e92-40ac-839f-0a213779c182"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"],
  #uuid "43e19540-a5d9-4ece-9409-0b4ceec833ea"
  [#uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"]}}
=== entry id 178 ===
Function: :accept-join-cluster
ZooKeeper Timestamp: 1455763918426
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d" #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5" #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84"]
Jobs: [#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"
 {#uuid "6291b715-775d-4a4c-a5b3-82d1eff4b4d0"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"
   #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"
   #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"
   #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"
   #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5"
   #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84"],
  #uuid "90766790-5e92-40ac-839f-0a213779c182"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"],
  #uuid "43e19540-a5d9-4ece-9409-0b4ceec833ea"
  [#uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"]}}
=== entry id 179 ===
Function: :seal-output
ZooKeeper Timestamp: 1455763918440
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d" #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5" #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84"]
Jobs: [#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"
 {#uuid "6291b715-775d-4a4c-a5b3-82d1eff4b4d0"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"
   #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"
   #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"
   #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"
   #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5"
   #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84"],
  #uuid "90766790-5e92-40ac-839f-0a213779c182"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"],
  #uuid "43e19540-a5d9-4ece-9409-0b4ceec833ea"
  [#uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"]}}
=== entry id 180 ===
Function: :accept-join-cluster
ZooKeeper Timestamp: 1455763918586
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d" #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5" #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84" #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"]
Jobs: [#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"
 {#uuid "90766790-5e92-40ac-839f-0a213779c182"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"],
  #uuid "6291b715-775d-4a4c-a5b3-82d1eff4b4d0"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"
   #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"
   #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"
   #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5"
   #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"
   #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84"],
  #uuid "43e19540-a5d9-4ece-9409-0b4ceec833ea"
  [#uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"]}}
=== entry id 181 ===
Function: :signal-ready
ZooKeeper Timestamp: 1455763918706
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d" #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5" #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84" #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"]
Jobs: [#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"
 {#uuid "90766790-5e92-40ac-839f-0a213779c182"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"],
  #uuid "6291b715-775d-4a4c-a5b3-82d1eff4b4d0"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"
   #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"
   #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"
   #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5"
   #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"
   #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84"],
  #uuid "43e19540-a5d9-4ece-9409-0b4ceec833ea"
  [#uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"]}}
=== entry id 182 ===
Function: :signal-ready
ZooKeeper Timestamp: 1455763918726
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d" #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5" #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84" #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"]
Jobs: [#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"
 {#uuid "90766790-5e92-40ac-839f-0a213779c182"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"],
  #uuid "6291b715-775d-4a4c-a5b3-82d1eff4b4d0"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"
   #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"
   #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"
   #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5"
   #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"
   #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84"],
  #uuid "43e19540-a5d9-4ece-9409-0b4ceec833ea"
  [#uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"]}}
=== entry id 183 ===
Function: :signal-ready
ZooKeeper Timestamp: 1455763918778
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d" #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5" #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84" #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"]
Jobs: [#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"
 {#uuid "90766790-5e92-40ac-839f-0a213779c182"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"],
  #uuid "6291b715-775d-4a4c-a5b3-82d1eff4b4d0"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"
   #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"
   #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"
   #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5"
   #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"
   #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84"],
  #uuid "43e19540-a5d9-4ece-9409-0b4ceec833ea"
  [#uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"]}}
=== entry id 184 ===
Function: :signal-ready
ZooKeeper Timestamp: 1455763918782
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d" #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5" #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84" #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"]
Jobs: [#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"
 {#uuid "90766790-5e92-40ac-839f-0a213779c182"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"],
  #uuid "6291b715-775d-4a4c-a5b3-82d1eff4b4d0"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"
   #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"
   #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"
   #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5"
   #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"
   #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84"],
  #uuid "43e19540-a5d9-4ece-9409-0b4ceec833ea"
  [#uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"]}}
=== entry id 185 ===
Function: :signal-ready
ZooKeeper Timestamp: 1455763918783
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d" #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5" #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84" #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"]
Jobs: [#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"
 {#uuid "90766790-5e92-40ac-839f-0a213779c182"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"],
  #uuid "6291b715-775d-4a4c-a5b3-82d1eff4b4d0"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"
   #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"
   #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"
   #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5"
   #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"
   #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84"],
  #uuid "43e19540-a5d9-4ece-9409-0b4ceec833ea"
  [#uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"]}}
=== entry id 186 ===
Function: :signal-ready
ZooKeeper Timestamp: 1455763918783
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d" #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5" #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84" #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"]
Jobs: [#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"
 {#uuid "90766790-5e92-40ac-839f-0a213779c182"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"],
  #uuid "6291b715-775d-4a4c-a5b3-82d1eff4b4d0"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"
   #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"
   #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"
   #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5"
   #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"
   #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84"],
  #uuid "43e19540-a5d9-4ece-9409-0b4ceec833ea"
  [#uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"]}}
=== entry id 187 ===
Function: :signal-ready
ZooKeeper Timestamp: 1455763918796
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d" #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5" #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84" #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"]
Jobs: [#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"
 {#uuid "90766790-5e92-40ac-839f-0a213779c182"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"],
  #uuid "6291b715-775d-4a4c-a5b3-82d1eff4b4d0"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"
   #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"
   #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"
   #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5"
   #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"
   #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84"],
  #uuid "43e19540-a5d9-4ece-9409-0b4ceec833ea"
  [#uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"]}}
=== entry id 188 ===
Function: :signal-ready
ZooKeeper Timestamp: 1455763918796
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d" #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5" #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84" #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"]
Jobs: [#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"
 {#uuid "90766790-5e92-40ac-839f-0a213779c182"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"],
  #uuid "6291b715-775d-4a4c-a5b3-82d1eff4b4d0"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"
   #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"
   #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"
   #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5"
   #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"
   #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84"],
  #uuid "43e19540-a5d9-4ece-9409-0b4ceec833ea"
  [#uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"]}}
=== entry id 189 ===
Function: :signal-ready
ZooKeeper Timestamp: 1455763918825
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d" #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5" #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84" #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"]
Jobs: [#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"
 {#uuid "90766790-5e92-40ac-839f-0a213779c182"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"],
  #uuid "6291b715-775d-4a4c-a5b3-82d1eff4b4d0"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"
   #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"
   #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"
   #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5"
   #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"
   #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84"],
  #uuid "43e19540-a5d9-4ece-9409-0b4ceec833ea"
  [#uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"]}}
=== entry id 190 ===
Function: :signal-ready
ZooKeeper Timestamp: 1455763918924
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d" #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5" #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84" #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"]
Jobs: [#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"
 {#uuid "90766790-5e92-40ac-839f-0a213779c182"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"],
  #uuid "6291b715-775d-4a4c-a5b3-82d1eff4b4d0"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"
   #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"
   #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"
   #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5"
   #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"
   #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84"],
  #uuid "43e19540-a5d9-4ece-9409-0b4ceec833ea"
  [#uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"]}}
=== entry id 191 ===
Function: :exhaust-input
ZooKeeper Timestamp: 1455763919319
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d" #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5" #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84" #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"]
Jobs: [#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"]
Allocations ...
{#uuid "b97240a0-b4d5-4b4b-853d-8d60dff56bba"
 {#uuid "90766790-5e92-40ac-839f-0a213779c182"
  [#uuid "35933a1c-a608-4b74-a792-ebc7adf7380d"],
  #uuid "6291b715-775d-4a4c-a5b3-82d1eff4b4d0"
  [#uuid "1102eda2-c6dc-496d-aee9-d35465364838"
   #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413"
   #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d"
   #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d"
   #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5"
   #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"
   #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd"
   #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84"],
  #uuid "43e19540-a5d9-4ece-9409-0b4ceec833ea"
  [#uuid "4256df45-cee7-47c9-99ed-b8b49747c93d"]}}
=== entry id 192 ===
Function: :seal-output
ZooKeeper Timestamp: 1455763919381
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "95f18abe-0d99-4ea4-aa7c-6e6dbdb0d413" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d" #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5" #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84" #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"]
Jobs: []
Allocations ...
{}
=== entry id 193 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763919415
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d" #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5" #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84" #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"]
Jobs: []
Allocations ...
{}
=== entry id 194 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763919415
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d" #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5" #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84" #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"]
Jobs: []
Allocations ...
{}
=== entry id 195 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763919416
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "f9d97df7-8b6c-45c4-b34c-20fb0c15f3fd" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d" #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5" #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84" #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"]
Jobs: []
Allocations ...
{}
=== entry id 196 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763919475
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d" #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5" #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84" #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"]
Jobs: []
Allocations ...
{}
=== entry id 197 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763919476
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d" #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5" #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84" #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"]
Jobs: []
Allocations ...
{}
=== entry id 198 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763919476
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d" #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5" #uuid "074bb95d-2da9-4ddf-9b34-60ff58d32d84" #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"]
Jobs: []
Allocations ...
{}
=== entry id 199 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763919491
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d" #uuid "52a7a0ff-7fa9-454a-bf33-b9cb33abd3f5" #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"]
Jobs: []
Allocations ...
{}
=== entry id 200 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763919507
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "47a9a2ad-9af8-4ae0-b3fa-cfc7f7dd638d" #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"]
Jobs: []
Allocations ...
{}
=== entry id 201 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763919540
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "9c9d17b6-84fc-481e-914e-332c05c2d00d" #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"]
Jobs: []
Allocations ...
{}
=== entry id 202 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763919558
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "35933a1c-a608-4b74-a792-ebc7adf7380d" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"]
Jobs: []
Allocations ...
{}
=== entry id 203 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763919577
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"]
Jobs: []
Allocations ...
{}
=== entry id 204 ===
Function: :leave-cluster
ZooKeeper Timestamp: 1455763919585
Peers: [#uuid "1102eda2-c6dc-496d-aee9-d35465364838" #uuid "4256df45-cee7-47c9-99ed-b8b49747c93d" #uuid "bf1809b7-9296-4dd0-8df4-0ed44000579d"]
Jobs: []
Allocations ...
{}
```

## License

Copyright © 2016 Distributed Masonry

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
