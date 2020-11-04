package com.afkklein.handson.s2it;

import com.afkklein.handson.s2it.model.Autor;
import com.afkklein.handson.s2it.model.Livro;
import com.afkklein.handson.s2it.repository.AutorRepository;
import com.afkklein.handson.s2it.service.RegrasService;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

public class UnitTest {

    @InjectMocks
    RegrasService regrasService;

    @Mock
    AutorRepository autorRepository;

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void devePermitirSalvarQuandoAutorPossuirMenosQue4Livros() {
        List<Livro> livrosExistentes = new ArrayList<>();

        livrosExistentes.add(new Livro(1L, "Teste 111"));
        livrosExistentes.add(new Livro(2L, "Teste 222"));

        Autor autor = new Autor();
        autor.setId(1L);
        autor.setName("Testando da Silva");
        autor.setLivros(livrosExistentes);

        Mockito.when(autorRepository.getOne(Mockito.anyLong())).thenReturn(autor);

        Assert.assertEquals(true, regrasService.permiteAdicionarLivro(autor));
    }

    @Test
    public void naoDevePermitirSalvarQuandoAutorPossuir4Livros() {
        List<Livro> livrosExistentes = new ArrayList<>();

        livrosExistentes.add(new Livro(1L, "Teste 111"));
        livrosExistentes.add(new Livro(2L, "Teste 222"));
        livrosExistentes.add(new Livro(3L, "Teste 333"));
        livrosExistentes.add(new Livro(4L, "Teste 444"));

        Autor autor = new Autor();
        autor.setId(1L);
        autor.setName("Testando da Silva");
        autor.setLivros(livrosExistentes);

        Mockito.when(autorRepository.getOne(Mockito.anyLong())).thenReturn(autor);

        Assert.assertEquals(false, regrasService.permiteAdicionarLivro(autor));
    }
}
