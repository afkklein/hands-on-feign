package com.afkklein.handson.s2it.resource;

import com.afkklein.handson.s2it.dto.ResponseMessageDto;
import com.afkklein.handson.s2it.model.Livro;
import com.afkklein.handson.s2it.repository.LivroRepository;
import com.afkklein.handson.s2it.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroResource {

    @Autowired
    MessageService messageService;

    @Autowired
    LivroRepository livroRepository;

    @GetMapping
    public ResponseMessageDto<List<Livro>> listaAutores() {
        return new ResponseMessageDto<>(livroRepository.findAll(), messageService.retornaPorta());
    }

}
