package com.afkklein.handson.s2it.repository;

import com.afkklein.handson.s2it.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
