# springboot-jms-rabbitmq

Spring Boot sample to demonstrate usage of JMS with RabbitMQ. Used both Queue and PubSub

This sample is inspired from [adzubla's example on ibm-mq-pubsub](https://github.com/adzubla/ibm-mq-pubsub)

## JMS with RabbitMQ

RabbitMQ was originally developed to support AMQP protocol. JMS is messaging standard for Java ecosystem. Hence direct support of JMS is not available on RabbitMQ

Hence, If you want to use JMS with RabbitMQ, first we need to enable the following plugin

```
> rabbitmq-server start
> rabbitmq-plugins enable rabbitmq_jms_topic_exchange
```

To check whether jms_topic plugin is enabled, run 

```
> rabbitmq-plugins list

[ E ] rabbitmq_jms_topic_exchange       3.8.9
```
E represents the feature is Explicitly enabled by us

### References :

* AMQP vs JMS - https://chatrabazar.wordpress.com/java-basics/jms/
* JMS with RabbitMQ - https://www.rabbitmq.com/jms-client.html
* JMS with Spring Boot - https://spring.io/guides/gs/messaging-jms/

