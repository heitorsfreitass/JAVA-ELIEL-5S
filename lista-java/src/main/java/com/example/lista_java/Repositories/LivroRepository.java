package com.example.lista_java.Repositories;

import com.example.lista_java.Entities.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
