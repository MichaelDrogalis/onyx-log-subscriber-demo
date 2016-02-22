# onyx-log-subscriber-demo

Very quick demo of the Onyx log subscription feature. Reads off a Docker image with an Onyx log that has been preloaded. Pull the container (below), then see `core.clj` for more!

Make sure you're using Onyx version `0.8.11`, since that's what version of Onyx we used to load up the log to begin with. Core's version must match the subscriber's version.

Get and start the container:

```
$ docker run -d -p 2181 michaeldrogalis/onyx-log:0.1.1
```

Run `docker ps` to find which port `2181` is bound to. If you're on OS X and using docker-machine, obtain your VM's IP by running `docker-machine ip default`. That's the address you'll use to connect to ZooKeeper.

## License

Copyright © 2016 Distributed Masonry

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
