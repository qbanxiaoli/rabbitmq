package com;

import com.entity.User;
import com.receiver.ObjectSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.receiver.StringSender;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqApplicationTests {

    @Autowired
    private StringSender stringSender;

    @Autowired
    private ObjectSender objectSender;

    // 发送单条消息
    @Test
    public void sendString() {
        stringSender.send();
    }

    // 发送对象
    @Test
    public void sendObj() {
        User user = new User();
        user.setId(1L);
        user.setUsername("admin");
        user.setPassword("1234");
        objectSender.send(user);
    }

}