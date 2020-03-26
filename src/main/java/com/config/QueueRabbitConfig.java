package com.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author qbanxiaoli
 * @description
 * @create 2020-03-26 11:12
 */
@Configuration
public class QueueRabbitConfig {

    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }

    @Bean
    public Queue objectQueue() {
        return new Queue("object");
    }

}