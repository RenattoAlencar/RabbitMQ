package com.microservice.rabbitmq.consumers;

import com.microservice.rabbitmq.domain.User;
import com.microservice.rabbitmq.request.UserRequest;
import com.microservice.rabbitmq.service.RabbitmqService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class UserConsumer {

    @Autowired
     RabbitmqService rabbitmqService;

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void listen(@Payload UserRequest userRequest){
        User user = new User();
        BeanUtils.copyProperties(userRequest, user);
        rabbitmqService.saveUser(userRequest);
        System.out.println("USER STATUS: " + userRequest.getName().toString());
    }

}
