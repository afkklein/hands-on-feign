package com.afkklein.handson.s2it.resource;

import com.afkklein.handson.s2it.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageResource {

    @Autowired
    MessageService messageService;

}
