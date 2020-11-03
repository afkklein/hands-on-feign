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

    public Livro salvarLivro(Autor autor, Livro livro) throws QuantidadeDeLivrosNaoPermitidaException {
        if(permiteAdicionarLivro(autor)) {
            return livroRepository.save(livro);
        } else {
            throw new QuantidadeDeLivrosNaoPermitidaException("Quantidade não permitida!");
        }
    }

    public boolean permiteAdicionarLivro(Autor autor) {
        Autor autorBuscado = autorRepository.getOne(autor.getId());
        return autorBuscado.getLivros().size() < 4;
    }
}
