package com.receiver;

import com.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

/**
 * @author qbanxiaoli
 * @description
 * @create 2020-03-26 16:16
 */
@Slf4j
@Component
public class ObjectSender {

    private final AmqpTemplate rabbitTemplate;

    public ObjectSender(AmqpTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void send(User user) {
        log.info("Sender object: " + user.toString());
        rabbitTemplate.convertAndSend("object", user);
    }

}
