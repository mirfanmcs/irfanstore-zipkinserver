irfanstore-zipkinserver
=========================
This is the sample Zipkin server written to run in the Pivital Cloud Foundry. Zipkin server collects and display the distributed tracing of the services emitting the tracing logs in the Rabbit Stream. This application uses Spring Cloud Sleuth.

This application uses following features / services in the Pivotal Cloud Foundry:

### Zipkin Autoconfigure UI 
This application uses Zipkin Autoconfigure UI whch provides Zipkin UI to display / search / filter the distributed traces.

### Spring Cloud Slueth 
This application uses the Spring Cloud Slueth which enable the distributed tracing.

### Spring Cloud Sleuth Zipkin Stream 
This application uses the Spring Cloud Sleuth Zipkin Stream which provides the enabled the tracing stream. 

### Spring Cloud Starter Stream Rabbit
This application uses Spring Cloud Starter Stream which enabled the streaming through RabbitMQ.

## Running application inside Pivotal Cloud Foundry
### Service Binding
Service binding is defined in the manifest.yml file. Create the following services inside the Cloud Foundry with the name provided as below:

* `CloudAMQP` service name: `ostore-rabbitmq`

### Push the application
After creating the services push the application using the `cf push` command. 

