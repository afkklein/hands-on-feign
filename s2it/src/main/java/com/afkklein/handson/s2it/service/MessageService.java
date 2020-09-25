package com.afkklein.handson.s2it.service;

import com.afkklein.handson.s2it.dto.MessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class MessageService {

    @Autowired
    private Environment environment;

    public MessageDTO getMessage() {
        return new MessageDTO("Já conquistamos o Brasil como s2it.",
                                Integer.parseInt(Objects.requireNonNull(environment.getProperty("local.server.port"))));
    }
}
