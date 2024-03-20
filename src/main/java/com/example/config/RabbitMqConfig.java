package com.example.config;//package com.example.demo.config;
//
//import org.springframework.amqp.core.*;
//import org.springframework.amqp.rabbit.annotation.EnableRabbit;
//import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
//import org.springframework.amqp.rabbit.connection.ConnectionFactory;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
//import org.springframework.amqp.support.converter.MessageConverter;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@EnableRabbit
//public class RabbitMqConfig {
//
//    @Value("${spring.rabbitmq.host}")
//    private String host;
//
//    @Value("${spring.rabbitmq.port}")
//    private int port;
//
//    @Value("${spring.rabbitmq.username}")
//    private String username;
//
//    @Value("${spring.rabbitmq.password}")
//    private String password;
//
//    @Value("${rabbitmq.queue.queue1.name}")
//    private String queue1;
//
//    @Bean
//    Queue queue1() {
//        return new Queue(queue1,false);
//    }
//
//    @Value("${rabbitmq.queue.queue1.exchange}")
//    private String exchange1;
//
//    @Bean
//    DirectExchange directExchange1() {
//        return new DirectExchange(exchange1);
//    }
//
////    @Bean
////    TopicExchange topicExchange1(){ return new TopicExchange(exchange1,false,false);}
//
//
//    @Value("${rabbitmq.queue.routing.key.queue1}")
//    private String routingKey1;
//
//    @Bean
//    public Binding binding1() {
//        return BindingBuilder.bind(queue1()).to(directExchange1()).with(routingKey1);
//    }
////    public Binding binding1() {
////        return BindingBuilder.bind(queue1()).to(topicExchange1()).with(routingKey1);
////    }
//
//    @Bean
//    MessageConverter messageConverter() {
//        return new Jackson2JsonMessageConverter();
//    }
//
//    @Bean
//    RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory, MessageConverter messageConverter) {
//        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
//        rabbitTemplate.setMessageConverter(messageConverter);
//        return rabbitTemplate;
//    }
//
//    @Bean
//    CachingConnectionFactory connectionFactory() {
//        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
//        connectionFactory.setHost(host);
//        connectionFactory.setPort(port);
//        connectionFactory.setUsername(username);
//        connectionFactory.setPassword(password);
//        return connectionFactory;
//    }
//}
