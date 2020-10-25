package com.afkklein.handson.s2it.resource;

import com.afkklein.handson.s2it.dto.ResponseMessageDto;
import com.afkklein.handson.s2it.model.Autor;
import com.afkklein.handson.s2it.repository.AutorRepository;
import com.afkklein.handson.s2it.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorResource {

    @Autowired
    MessageService messageService;

    @Autowired
    AutorRepository autorRepository;

    @GetMapping
    public ResponseMessageDto<List<Autor>> listaAutores() {
        return new ResponseMessageDto<>(autorRepository.findAll(), messageService.retornaPorta());
    }

}
