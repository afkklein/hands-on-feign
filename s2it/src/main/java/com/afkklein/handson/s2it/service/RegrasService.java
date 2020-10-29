package com.afkklein.handson.s2it.service;

import com.afkklein.handson.s2it.exception.QuantidadeDeLivrosNaoPermitidaException;
import com.afkklein.handson.s2it.model.Autor;
import com.afkklein.handson.s2it.model.Livro;
import com.afkklein.handson.s2it.repository.AutorRepository;
import com.afkklein.handson.s2it.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegrasService {

    @Autowired
    AutorRepository autorRepository;

    @Autowired
    LivroRepository livroRepository;

    public Livro verificaLivrosPorAutor(Autor autor, Livro livro) throws Exception {
        Autor autorBuscado = autorRepository.getOne(autor.getId());
        if (autorBuscado.getLivros().size() == 4) {
            throw new QuantidadeDeLivrosNaoPermitidaException("Quantidade não permitida!");
        } else {
            return livroRepository.save(livro);
        }
    }
}
