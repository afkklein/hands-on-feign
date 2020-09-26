package com.afkklein.handson.s2it.resource;

import com.afkklein.handson.s2it.dto.MessageDTO;
import com.afkklein.handson.s2it.service.MessageService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageResource {

    @Autowired
    MessageService messageService;

    @HystrixCommand(fallbackMethod = "fallback")
    @GetMapping("/messages")
    public MessageDTO getMessage() {
        throw new RuntimeException("Some error");
//        return messageService.getMessage();
    }

    public MessageDTO fallback() {
        return messageService.getMessage();
    }
}
