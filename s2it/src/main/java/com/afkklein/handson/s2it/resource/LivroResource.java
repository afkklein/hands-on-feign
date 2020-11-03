package com.afkklein.handson.s2it.resource;

import com.afkklein.handson.s2it.dto.ResponseMessageDto;
import com.afkklein.handson.s2it.model.Livro;
import com.afkklein.handson.s2it.repository.LivroRepository;
import com.afkklein.handson.s2it.service.MessageService;
import com.afkklein.handson.s2it.service.RegrasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroResource {

    @Autowired
    MessageService messageService;

    @Autowired
    LivroRepository livroRepository;

    @Autowired
    RegrasService regrasService;

    @GetMapping
    public ResponseMessageDto<List<Livro>> listaAutores() {
        return new ResponseMessageDto<>(livroRepository.findAll(), messageService.retornaPorta());
    }

    @PostMapping
    public ResponseEntity<Livro> cadastrarLivro(@Valid @RequestBody Livro livro) throws Exception {
        return ResponseEntity.status(HttpStatus.CREATED).body(regrasService.salvarLivro(livro.getAutor(), livro));
    }

}
