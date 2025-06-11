#!/bin/sh


kubectl delete -f ../kubernetes/deployment-both-config-consumer-service.yaml
kubectl apply -f ../kubernetes/deployment-both-config-consumer-service.yaml

kubectl get all