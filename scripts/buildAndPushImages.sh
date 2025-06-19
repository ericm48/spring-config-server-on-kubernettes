#!/bin/sh

cd ../config-consumer-service
m3mkpush # mvn clean package, build-img

docker push $MK_IMAGE_PUSH_TARGET_PREFIX/$MK_IMAGE_PUSH_TARGET


#cd ../config-consumer-service
#m3ast #mvn clean package

#docker image rm -f ericm24/config-service:k8.1
#docker image build -t ericm24/config-service:k8.1 .
#docker push ericm24/config-service:k8.1



# Gets messed up with .envrc  Send params...
#mkImagePush config-service:k8.1 ericm24

