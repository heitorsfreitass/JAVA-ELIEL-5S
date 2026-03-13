package com.example.lista_java.Services;

import com.example.lista_java.Entities.Autor;
import com.example.lista_java.Entities.Pedido;
import com.example.lista_java.Repositories.AutorRepository;
import com.example.lista_java.Repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public Autor addAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    public List<Autor> findAllAutores() {
        return autorRepository.findAll();
    }

    public Autor findAutorById(Long id) {
        return autorRepository.findById(id).get();
    }

    public void deleteAutor(Long id) {
        autorRepository.deleteById(id);
    }
}
