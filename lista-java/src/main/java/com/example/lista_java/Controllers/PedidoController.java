package com.example.lista_java.Controllers;

import com.example.lista_java.Entities.Pedido;
import com.example.lista_java.Services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public ResponseEntity<Pedido> addPedido(@RequestBody Pedido pedido) {
        Pedido request = pedidoService.addPedido(pedido);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
                .path("/{id}")
                .buildAndExpand(pedido.getId())
                .toUri();

        return ResponseEntity.created().body(request);
    }

    @GetMapping
    public ResponseEntity<List<Pedido>> findAllPedidos() {
        List<Pedido> request = pedidoService.findAllPedidos();

        return ResponseEntity.ok().body(request);
    }

    @GetMapping("/{id}")
    public Optional<Pedido> findPedidoById(@PathVariable Long id) {
        return pedidoService.findPedidoById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePedido(@PathVariable Long id) {
        pedidoService.deletePedido(id);
        return ResponseEntity.noContent().build();
    }
}
