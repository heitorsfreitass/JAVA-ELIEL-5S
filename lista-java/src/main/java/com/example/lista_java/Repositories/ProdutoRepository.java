package com.example.lista_java.Repositories;

import com.example.lista_java.Entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
