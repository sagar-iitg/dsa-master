#!/bin/sh
echo "running"
git add .
git commit -am "updating $1"
git push origin master
echo "completed"
