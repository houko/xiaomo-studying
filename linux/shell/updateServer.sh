#!/bin/bash
cd /data/game/s1/dev_control/servercode
svn up

cd /data/game/s1/dev_control/scripts
sh stopServer.sh

cd /data/game/s1/dev_control/servercode/release
ant

cp -f /data/game/s1/dev_control/servercode/release/bin/* /data/game/s1/server/core/1.0.1.0

cd /data/game/s1/dev_control/scripts
sh startServer.sh
