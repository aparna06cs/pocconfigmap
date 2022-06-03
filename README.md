# 
Create roles and role bindings for the user running in the cluster 
**Imp Commands:**
 ./mvnw com.google.cloud.tools:jib-maven-plugin:build -Dimage=gcr.io/t-operative-348503/configmap-poc:v11 - build the imaage and pushing the docker image to the container registry 

**cluster login**
gcloud container clusters get-credentials configmap4-cluster-1 --zone us-central1

**Create the load balancer:**
kubectl expose deployment configmap-poc --port=8080 --target-port=8080 \
--name=configmap-service --type=LoadBalancer![image](https://user-images.githubusercontent.com/48531454/171909256-698464e1-fba0-40eb-80ad-75b3afc5e4a4.png)
