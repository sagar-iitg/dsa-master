#!/bin/sh
echo "running"
git add .
git commit -am "$1"
git push origin master
echo "completed"
