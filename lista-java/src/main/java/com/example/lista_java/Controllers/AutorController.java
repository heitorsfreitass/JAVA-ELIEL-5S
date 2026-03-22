package com.example.lista_java.Controllers;

import com.example.lista_java.Entities.Autor;
import com.example.lista_java.Services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @PostMapping
    public ResponseEntity<Autor> addAutor(@RequestBody Autor autor) {
        Autor request = autorService.addAutor(autor);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
                .path("/{id}")
                .buildAndExpand(autor.getId())
                .toUri();

        return ResponseEntity.created().body(request);
    }

    @GetMapping
    public ResponseEntity<List<Autor>> findAllAutores() {
        List<Autor> request = autorService.findAllAutores();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping("/{id}")
    public Optional<Autor> findAutorById(@PathVariable Long id) {
        return autorService.findAutorById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAutor(@PathVariable Long id) {
        autorService.deleteAutor(id);
        return ResponseEntity.noContent().build();
    }
}
