package com.example.lista_java.Repositories;

import com.example.lista_java.Entities.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
