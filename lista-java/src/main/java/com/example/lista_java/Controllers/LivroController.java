package com.example.lista_java.Controllers;

import com.example.lista_java.Entities.Livro;
import com.example.lista_java.Services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @PostMapping
    public ResponseEntity<Livro> addLivro(@RequestBody Livro livro) {
        Livro request = livroService.addLivro(livro);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
                .path("/{id}")
                .buildAndExpand(livro.getId())
                .toUri();

        return ResponseEntity.created().body(request);
    }

    @GetMapping
    public ResponseEntity<List<Livro>> findAllLivros() {
        List<Livro> request = livroService.findAllLivros();
        return ResponseEntity.ok().body(request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteLivro(@PathVariable Long id) {
        livroService.deleteLivro(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public Optional<Livro> findLivroById(@PathVariable Long id) {
        return livroService.findLivroById(id);
    }
}
