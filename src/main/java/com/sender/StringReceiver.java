package com.sender;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author qbanxiaoli
 * @description
 * @create 2020-03-26 11:16
 */
@Slf4j
@Component
@RabbitListener(queues = "hello")
public class StringReceiver {

    @RabbitHandler
    public void process(String hello) {
        log.info("Receiver  : " + hello);
    }

}