package com.example.lista_java.Controllers;

import com.example.lista_java.Entities.Cliente;
import com.example.lista_java.Services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public Cliente addCliente(@RequestBody Cliente cliente) {
        return clienteService.addCliente(cliente);
    }

    @GetMapping
    public List<Cliente> findAllClientes() {
        return clienteService.findAllClientes();
    }

    @GetMapping("/{id}")
    public Cliente findClienteById(@PathVariable Long id) {
        return clienteService.findClienteById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Long id) {
        clienteService.deleteCliente(id);
    }
}
