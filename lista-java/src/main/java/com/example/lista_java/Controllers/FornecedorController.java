package com.example.lista_java.Controllers;

import com.example.lista_java.Entities.Fornecedor;
import com.example.lista_java.Repositories.FornecedorRepository;
import com.example.lista_java.Services.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/fornecedores")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    public Fornecedor addFornecedor(Fornecedor fornecedor) {
        return fornecedorService.addFornecedor(fornecedor);
    }

    public List<Fornecedor> findAllFornecedores() {
        return fornecedorService.findAllFornecedores();
    }

    public Fornecedor findFornecedoresById(Long id) {
        return fornecedorService.findFornecedorById(id);
    }

    public void deleteFornecedor(Long id) {
        fornecedorService.deleteFornecedor(id);
    }
}
