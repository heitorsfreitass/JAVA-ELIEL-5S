package com.example.lista_java.Services;

import com.example.lista_java.Entities.Cliente;
import com.example.lista_java.Entities.Fornecedor;
import com.example.lista_java.Repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public Fornecedor addFornecedor(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public List<Fornecedor> findAllFornecedores() {
        return fornecedorRepository.findAll();
    }

    public Fornecedor findFornecedorById(Long id) {
        return fornecedorRepository.findById(id).get();
    }

    public void deleteFornecedor(Long id) {
        fornecedorRepository.deleteById(id);
    }
}
