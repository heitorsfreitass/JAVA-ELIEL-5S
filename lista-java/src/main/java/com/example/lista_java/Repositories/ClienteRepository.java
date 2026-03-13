package com.example.lista_java.Repositories;

import com.example.lista_java.Entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
