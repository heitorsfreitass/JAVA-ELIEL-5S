package com.example.lista_java.Controllers;

import com.example.lista_java.Entities.Cliente;
import com.example.lista_java.Services.ClienteService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Cliente> addCliente(@RequestBody Cliente cliente) {
        Cliente request = clienteService.addCliente(cliente);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
                .path("/{id}")
                .buildAndExpand(cliente.getId())
                .toUri();

        return ResponseEntity.created().body(request);
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> findAllClientes() {
        List<Cliente> request = clienteService.findAllClientes();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping("/{id}")
    public Optional<Cliente> findClienteById(@PathVariable Long id) {
        return clienteService.findClienteById(id);
    }

    @DeleteMapping("/{id}")
    public Optional<?> deleteCliente(@PathVariable Long id) {
        clienteService.deleteCliente(id);
        return ResponseEntity.noContent().build();
    }
}
