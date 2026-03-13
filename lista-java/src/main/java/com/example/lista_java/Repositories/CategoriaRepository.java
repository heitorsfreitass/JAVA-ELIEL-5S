package com.example.lista_java.Repositories;

import com.example.lista_java.Entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
