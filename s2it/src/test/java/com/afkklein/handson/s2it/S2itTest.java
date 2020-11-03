package com.afkklein.handson.s2it;

import com.afkklein.handson.s2it.model.Autor;
import com.afkklein.handson.s2it.model.Livro;
import com.afkklein.handson.s2it.repository.AutorRepository;
import com.afkklein.handson.s2it.repository.LivroRepository;
import com.afkklein.handson.s2it.service.RegrasService;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.when;

public class S2itTest {

    @InjectMocks
    RegrasService regrasService;

    @Mock
    AutorRepository autorRepository;

    @Mock
    LivroRepository livroRepository;

    Autor autor;

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);

        List<Livro> livrosExistentes = new ArrayList<>();

        livrosExistentes.add(new Livro(1L, "Teste 111"));
        livrosExistentes.add(new Livro(2L, "Teste 222"));

        autor = new Autor();
        autor.setId(1L);
        autor.setName("Testando da Silva");
        autor.setLivros(livrosExistentes);
    }

    @Test
    public void devePermitirAdicionarLivroQuandoAutorPossuirMenosQue4Livros() throws Exception {

        Livro novoLivro = new Livro(3L, "Testando 333");

        when(autorRepository.getOne(anyLong())).thenReturn(autor);

        when(regrasService.salvarLivro(autor, novoLivro)).thenReturn(novoLivro);

        adicionaLivroAoAutor(novoLivro);

        Assert.assertThat(autor.getLivros(), Matchers.hasItem(novoLivro));
    }

    @Test
    public void naoDevePermitirAdicionarLivroQuandoAutorPossuir4Livros() throws Exception {

        autor.getLivros().add(new Livro(3L, "Teste 444"));
        autor.getLivros().add(new Livro(4L, "Teste 555"));

        Livro novoLivro = new Livro(5L, "Testando 678");

        when(autorRepository.getOne(anyLong())).thenReturn(autor);

        when(regrasService.salvarLivro(autor, novoLivro)).thenReturn(novoLivro);

        Autor autorAlterado = adicionaLivroAoAutor(novoLivro);

        Assert.assertThat(this.autor.getLivros(), Matchers.hasItem(novoLivro));
    }

    private Autor adicionaLivroAoAutor(Livro novoLivro) {
        Autor autorAlterado = new Autor(autor.getId(), autor.getName(), autor.getLivros());
        autorAlterado.getLivros().add(novoLivro);
        return autorAlterado;
    }

}
