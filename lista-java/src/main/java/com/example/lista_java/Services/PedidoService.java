package com.example.lista_java.Services;

import com.example.lista_java.Entities.Pedido;
import com.example.lista_java.Repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido addPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public List<Pedido> findAllPedidos() {
        return pedidoRepository.findAll();
    }

    public Pedido findPedidoById(Long id) {
        return pedidoRepository.findById(id).get();
    }

    public void deletePedido(Long id) {
        pedidoRepository.deleteById(id);
    }
}
