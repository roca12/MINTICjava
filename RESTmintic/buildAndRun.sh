#!/bin/sh
mvn clean package && docker build -t com.roca12.learn.mintic/RESTmintic .
docker rm -f RESTmintic || true && docker run -d -p 9080:9080 -p 9443:9443 --name RESTmintic com.roca12.learn.mintic/RESTmintic