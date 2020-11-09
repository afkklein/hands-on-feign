package com.afkklein.handson.s2it.resource;

import com.afkklein.handson.s2it.dto.ResponseMessageDto;
import com.afkklein.handson.s2it.model.Autor;
import com.afkklein.handson.s2it.repository.AutorRepository;
import com.afkklein.handson.s2it.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @PostMapping
    public ResponseEntity<Autor> cadastrarAutor(@Valid @RequestBody Autor autor) {
        return ResponseEntity.status(HttpStatus.CREATED).body(autorRepository.save(autor));
    }

}
