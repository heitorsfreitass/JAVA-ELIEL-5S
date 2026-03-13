package com.example.lista_java.Repositories;

import com.example.lista_java.Entities.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
}
