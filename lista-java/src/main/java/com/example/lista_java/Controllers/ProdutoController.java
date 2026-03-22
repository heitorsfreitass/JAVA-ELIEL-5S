package com.example.lista_java.Controllers;

import com.example.lista_java.Entities.Produto;
import com.example.lista_java.Services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<Produto> addProduto(@RequestBody Produto produto) {
        Produto request = produtoService.addProduto(produto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
                .path("/{id}")
                .buildAndExpand(produto.getId())
                .toUri();

        return ResponseEntity.created().body(request);
    }

    @GetMapping
    public ResponseEntity<List<Produto>> findAllProdutos() {
        List<Produto> request = produtoService.findAllProdutos();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping("/{id}")
    public Optional<Produto> findProdutoById(@PathVariable Long id) {
        return produtoService.findProdutoById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduto(@PathVariable Long id) {
        produtoService.deleteProduto(id);
        return ResponseEntity.noContent().build();
    }
}
