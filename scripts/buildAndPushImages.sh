#!/bin/sh

cd ../config-consumer-service/
m3ast #mvn clean package

docker image rm -f ericm24/config-consumer-service:k8
docker image build -t ericm24/config-consumer-service:k8 .
docker push ericm24/config-consumer-service:k8


cd ../config-service/
m3ast #mvn clean package

docker image rm -f ericm24/config-service:k8
docker image build -t ericm24/config-service:k8 .
docker push ericm24/config-service:k8