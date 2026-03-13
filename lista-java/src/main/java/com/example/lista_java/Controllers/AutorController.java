package com.example.lista_java.Controllers;

import com.example.lista_java.Entities.Autor;
import com.example.lista_java.Repositories.AutorRepository;
import com.example.lista_java.Services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @PostMapping
    public Autor addAutor(@RequestBody Autor autor) {
        return autorService.addAutor(autor);
    }

    @GetMapping
    public List<Autor> findAllAutores() {
        return autorService.findAllAutores();
    }

    @GetMapping("/{id}")
    public Autor findAutorById(@PathVariable Long id) {
        return autorService.findAutorById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAutor(@PathVariable Long id) {
        autorService.deleteAutor(id);
    }
}
