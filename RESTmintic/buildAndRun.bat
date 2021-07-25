@echo off
call mvn clean package
call docker build -t com.roca12.learn.mintic/RESTmintic .
call docker rm -f RESTmintic
call docker run -d -p 9080:9080 -p 9443:9443 --name RESTmintic com.roca12.learn.mintic/RESTmintic