package com.afkklein.handson.invillia.resource;

import com.afkklein.handson.invillia.dto.MessageDTO;
import com.afkklein.handson.invillia.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageResource {

    @Autowired
    MessageService messageService;

    @GetMapping("/messages")
    public MessageDTO getMessage() {
        return messageService.getMessage();
    }
}
