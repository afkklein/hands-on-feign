package com.afkklein.handson.s2it.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private Environment environment;
}
