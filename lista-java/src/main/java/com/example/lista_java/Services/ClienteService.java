package com.example.lista_java.Services;

import com.example.lista_java.Entities.Cliente;
import com.example.lista_java.Repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente addCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> findAllClientes() {
        return clienteRepository.findAll();
    }

    public Cliente findClienteById(Long id) {
        return clienteRepository.findById(id).get();
    }

    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
