package com.sender;

import com.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author qbanxiaoli
 * @description
 * @create 2020-03-26 16:17
 */
@Slf4j
@Component
@RabbitListener(queues = "object")
public class ObjectReceiver {

    @RabbitHandler
    public void process(User user) {
        log.info("Receiver object : " + user);
        log.info("username:" + user.getUsername());
        log.info("password:" + user.getPassword());
    }

}