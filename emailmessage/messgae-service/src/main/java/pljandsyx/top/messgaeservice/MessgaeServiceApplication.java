package pljandsyx.top.messgaeservice;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessgaeServiceApplication {


    public static void main(String[] args) {
        SpringApplication.run(MessgaeServiceApplication.class, args);
    }



}
