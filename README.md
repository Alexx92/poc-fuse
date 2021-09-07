# Spring-Boot Camel API-Rest

This example demonstrates how you can use Apache Camel XML with Spring Boot

The quickstart uses Spring Boot to configure a little application that includes a Camel route that receive json and that query a stored procedure.

### Building

To run this quickstart as a standalone project on your local machine:


    mvn clean package

    ----

    mvn spring-boot:run

### Running the example in OpenShift (test)

It is assumed that:
- OpenShift platform is already running.
- Your system is configured for Fabric8 Maven Workflow

The example can be built and run on OpenShift using a single goal:

    mvn fabric8:deploy

When the example runs in OpenShift, you can use the OpenShift client tool to inspect the status

To list all the running pods:

    oc get pods

Then find the name of the pod that runs this quickstart, and output the logs from the running pods with:

    oc logs <name of pod>

### Enviar codigo a repositorio Git

Ir al directorio del proyecto y ejecutar:

    git add *

Esto añade codigo al contexto de git local

Realizar gravado de instancia actual para versionar

    git commit -m "Texto descriptivo sobre cambios realizados"

Enviar codigo a rama principal o Master:

    git push origin master