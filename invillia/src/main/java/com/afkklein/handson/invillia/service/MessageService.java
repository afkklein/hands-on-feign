package com.afkklein.handson.invillia.service;

import com.afkklein.handson.invillia.clients.S2itClient;
import com.afkklein.handson.invillia.dto.ResponseMessageDto;
import com.afkklein.handson.invillia.dto.ResponseMessageS2itDto;
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
        ResponseMessageS2itDto s2itAutores = s2itClient.getS2itAutores();
        return new ResponseMessageDto(s2itAutores.getResponse(),
                                      Integer.valueOf(environment.getProperty("local.server.port")),
                                      s2itAutores.getS2itport());
    }

    public ResponseMessageDto listaLivros() {
        ResponseMessageS2itDto s2itLivros = s2itClient.getS2itLivros();
        return new ResponseMessageDto(s2itLivros.getResponse(),
                                      Integer.valueOf(environment.getProperty("local.server.port")),
                                      s2itLivros.getS2itport());
    }

}
