package com.afkklein.handson.invillia;
import static io.restassured.RestAssured.*;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class APITest {

    @Test
    public void naoDeveCadastrarAutorSemNome() {
        given()
            .contentType("application/json")
            .body("{}")
        .when()
            .post("http://localhost:8000/autores")
        .then()
            .log().all()
            .statusCode(400)
            .body("mensagemUsuario", Matchers.hasItem("O campo Name é obrigatório"));
    }

    @Test
    public void naoDeveCadastrarLivroSemAutor() {
        given()
            .contentType("application/json")
            .body("{\"title\": \"Testando 123\"}")
        .when()
            .post("http://localhost:8000/livros")
        .then()
            .log().all()
            .statusCode(400)
            .body("mensagemUsuario", Matchers.hasItem("O campo Autor é obrigatório"));
    }

    @Test
    public void naoDeveCadastrarLivroSemTitulo() {
        given()
            .contentType("application/json")
            .body("{\"autor\": {\"id\": 1}}")
        .when()
            .post("http://localhost:8000/livros")
        .then()
            .log().all()
            .statusCode(400)
            .body("mensagemUsuario", Matchers.hasItem("O campo Titulo é obrigatório"));
    }

    //{"title": "Testando 123", "autor": {"id": 1}}
    //{"title": "Testando 123"}
    //{"autor": {"id": 1}}

    @Test
    public void naoDeveCadastrarLivroSeAutorJaPossui4LivrosCadastrados() {
        given()
            .contentType("application/json")
            .body("{}")
        .when()
            .post("http://localhost:8000/livros")
        .then()
            .log().all()
            .statusCode(400)
            .body("mensagemUsuario", Matchers.hasItem("O campo Title é obrigatório"));
    }
}
