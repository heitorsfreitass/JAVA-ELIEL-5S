package com.example.lista_java.Services;

import com.example.lista_java.Entities.Produto;
import com.example.lista_java.Repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto addProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public List<Produto> findAllProdutos() {
        return produtoRepository.findAll();
    }

    public Produto findProdutoById(Long id) {
        return produtoRepository.findById(id).get();
    }

    public void deleteProduto(Long id) {
        produtoRepository.deleteById(id);
    }
}
