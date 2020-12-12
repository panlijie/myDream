package pljandsyx.top.messgaeservice;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MessgaeServiceApplicationTests {
    @Autowired
    RabbitTemplate rabbitTemplate;
    @Test
    void contextLoads() {
        String msg = "你好!";
        rabbitTemplate.convertAndSend("panlijie.mail",msg);
    }

}
