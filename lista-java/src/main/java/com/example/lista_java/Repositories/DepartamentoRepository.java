package com.example.lista_java.Repositories;

import com.example.lista_java.Entities.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
}
