package org.northernjay.sfgjms.listener;

import org.northernjay.sfgjms.config.JmsConfig;
import org.northernjay.sfgjms.model.HelloWorldMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;


@Component
public class HelloMessageListener {

    @JmsListener(destination = JmsConfig.MY_QUEUE)
    public void listen(@Payload HelloWorldMessage helloWorldMessage, @Headers MessageHeaders headers, Message message) {

        System.out.println("I Got Message!!!");

        System.out.println(helloWorldMessage);

        throw new RuntimeException("foo");
    }
}
