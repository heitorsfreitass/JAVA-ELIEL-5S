package com.example.lista_java.Repositories;

import com.example.lista_java.Entities.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
