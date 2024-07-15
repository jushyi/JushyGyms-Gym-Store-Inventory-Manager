# Deployment Documentation
## Cloud Solution Provider
We chose Microsoft Azure to deploy the web app. The reasoning behind this choice was the popularity, ease of deployment, and price. Microsoft Azure is one of the largest cloud service providers, with a wide customer base. This gives me good reason to trust the cloud services it provides. The deployment process with Microsoft Azure is also very straightforward. This leads to faster deployment time for my customers. And finally the price, with Microsoft Azure's “pay-as-you-go” pricing model my client can scale their resources according to the traffic to the website. So as they expand and add more employees they can add resources as they need. And they will not be paying for resources they are not using.

### Deployment Steps
#### Here is how I implemented container images.
1. Create/Log in to an Azure account
2. Create the Docker image. Here are the steps to creating the docker image:
   2a. Package the project using Maven.

   2b. Copy the generated .jar file into a docker image.

   2c. Make sure the application is accessible on port 8080.

   2d. Run “docker image build -t demo:latest .” to create the docker image.

   2e. Run “docker tag demo spoods7/d424-deployment” to push the image into my public repository.
3. In Azure, I would navigate to “Create a resource” and search for “container app.”
4. Once I navigate to the “Container App” page I would click “Create.”
5. Here I fill out the project details like the Resource group and Container app name.
6. In “App Settings” I would select the image source as “Docker Hub” and select the
   “Public” image type.
7. I would then type in the image and tag of my repository.
8. Scroll down and enable ingress with traffic accepted from anywhere.
9. Finally, in “Target port” I would type in 8080.
10. Once finished I click “review and create”, review all of the details to ensure everything is
    accurate, and click “create.”
11. After a couple of moments, my app will be deployed and I can click “Go to resource” to
    find the application URL.
12. Clicking on the URL should take me to my application.
13. That is all the steps needed to deploy to Azure!


## Panopto Recording Link

https://wgu.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=6d0a7e5c-2db1-4c34-9bbf-b1ae00d0283c
