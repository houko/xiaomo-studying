#!/bin/bash
ps -ef |grep build_modle |awk '{print $2}'|xargs kill -9

ps -ef |grep build_main |awk '{print $2}'|xargs kill -9

cd /data/game/s1/client/code/client/swclib
svn update
cd /data/game/s1/client/code/uiresource
svn update
cd /data/game/s1/client/code/client/GameMainUI
svn update
cd /data/game/s1/client/code/client/sctjMain
svn update
cd /data/game/s1/client/code/sctjZoneNew
svn update
cd /data/game/s1/client/code
nohup ant  -buildfile "build_main.xml" > Main.log &

nohup ant  -buildfile "build_modle.xml" > GameMainUI.log &

nohup ant  -buildfile "build_zone.xml" > Zone.log &

exit 0
