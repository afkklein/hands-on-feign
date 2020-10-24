package com.afkklein.handson.invillia.service;

import com.afkklein.handson.invillia.clients.S2itClient;
import com.afkklein.handson.invillia.dto.ResponseMessageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private Environment environment;

    @Autowired
    private S2itClient s2itClient;

    public ResponseMessageDto listaAutores() {
        return new ResponseMessageDto(s2itClient.getS2itAutores().getResponse(),
                                      s2itClient.getS2itAutores().getS2itport(),
                                      Integer.valueOf(environment.getProperty("local.server.port")));
    }

//    public MessageDTO getMessage() {
//
//        MessageS2itDTO s2itMessage = s2itClient.getS2itMessage();
//
//        return new MessageDTO(s2itMessage.getMessage() + " Agora vamos conquistar o mundo como Invillia",
//                                      s2itMessage.getS2itport(),
//                                      Integer.valueOf(environment.getProperty("local.server.port")));
//    }


}
