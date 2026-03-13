package com.example.lista_java.Repositories;

import com.example.lista_java.Entities.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}
