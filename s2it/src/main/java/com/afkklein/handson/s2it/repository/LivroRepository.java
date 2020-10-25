package com.afkklein.handson.s2it.repository;

import com.afkklein.handson.s2it.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
