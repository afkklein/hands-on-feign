package com.afkklein.handson.s2it.repository;

import com.afkklein.handson.s2it.model.Autor;
import com.afkklein.handson.s2it.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
