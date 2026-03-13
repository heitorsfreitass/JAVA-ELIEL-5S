package com.example.lista_java.Controllers;

import com.example.lista_java.Entities.Produto;
import com.example.lista_java.Repositories.ProdutoRepository;
import com.example.lista_java.Services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public Produto addProduto(@RequestBody Produto produto) {
        return produtoService.addProduto(produto);
    }

    @GetMapping
    public List<Produto> findAllProdutos() {
        return produtoService.findAllProdutos();
    }

    @GetMapping("/{id}")
    public Produto findProdutoById(@PathVariable Long id) {
        return produtoService.findProdutoById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProduto(@PathVariable Long id) {
        produtoService.deleteProduto(id);
    }
}
