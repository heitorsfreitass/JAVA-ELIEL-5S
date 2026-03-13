package com.example.lista_java.Controllers;

import com.example.lista_java.Entities.Livro;
import com.example.lista_java.Repositories.LivroRepository;
import com.example.lista_java.Services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @PostMapping
    public Livro addLivro(@RequestBody Livro livro) {
        return livroService.addLivro(livro);
    }

    @GetMapping
    public List<Livro> findAllLivros() {
        return livroService.findAllLivros();
    }

    @DeleteMapping("/{id}")
    public void deleteLivro(@PathVariable Long id) {
        livroService.deleteLivro(id);
    }

    @GetMapping("/{id}")
    public Livro findLivroById(@PathVariable Long id) {
        return livroService.findLivroById(id);
    }
}
