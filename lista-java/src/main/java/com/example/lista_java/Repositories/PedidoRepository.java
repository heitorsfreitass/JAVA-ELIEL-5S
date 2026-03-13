package com.example.lista_java.Repositories;

import com.example.lista_java.Entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
