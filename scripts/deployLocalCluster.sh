#!/bin/sh

cd ../kubernetes
kubectl delete -f config-server-cluster.yml
kubectl apply -f config-server-cluster.yml
kubectl get all