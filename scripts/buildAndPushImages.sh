#!/bin/sh

cd ../config-consumer-service
m3ast #mvn clean package

#docker image rm -f ericm24/config-consumer-service:k8.1
#docker image build -t ericm24/config-consumer-service:k8.1 .
#docker push ericm24/config-consumer-service:k8.1

docker push ericm24/config-consumer-service:0.0.5-SNAPSHOT

# Gets messed up with .envrc  Send params...
#mkImagePush config-consumer-service:k8.1 ericm24

cd ../config-consumer-service
m3ast #mvn clean package

docker image rm -f ericm24/config-service:k8.1
docker image build -t ericm24/config-service:k8.1 .
docker push ericm24/config-service:k8.1



# Gets messed up with .envrc  Send params...
#mkImagePush config-service:k8.1 ericm24

