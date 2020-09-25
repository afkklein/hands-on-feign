package com.afkklein.handson.invillia.service;

import com.afkklein.handson.invillia.clients.S2itClient;
import com.afkklein.handson.invillia.dto.MessageDTO;
import com.afkklein.handson.invillia.dto.MessageS2itDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class MessageService {

    @Autowired
    private Environment environment;

    @Autowired
    private S2itClient s2itClient;

    public MessageDTO getMessage() {

        MessageS2itDTO s2itMessage = s2itClient.getS2itMessage();

        return new MessageDTO(s2itMessage.getMessage() + " Agora vamos conquistar o mundo como Invillia",
                                      s2itMessage.getS2itport(),
                                      Integer.valueOf(environment.getProperty("local.server.port")));
    }
}
