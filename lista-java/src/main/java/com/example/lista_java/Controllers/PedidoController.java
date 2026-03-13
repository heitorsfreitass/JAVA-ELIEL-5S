package com.example.lista_java.Controllers;

import com.example.lista_java.Entities.Pedido;
import com.example.lista_java.Repositories.PedidoRepository;
import com.example.lista_java.Services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public Pedido addPedido(@RequestBody Pedido pedido) {
        return pedidoService.addPedido(pedido);
    }

    @GetMapping
    public List<Pedido> findAllPedidos() {
        return pedidoService.findAllPedidos();
    }

    @GetMapping("/{id}")
    public Pedido findPedidoById(@PathVariable Long id) {
        return pedidoService.findPedidoById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePedido(@PathVariable Long id) {
        pedidoService.deletePedido(id);
    }
}
