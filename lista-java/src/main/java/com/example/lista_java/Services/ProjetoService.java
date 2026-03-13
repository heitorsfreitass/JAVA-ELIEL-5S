package com.example.lista_java.Services;

import com.example.lista_java.Entities.Produto;
import com.example.lista_java.Entities.Projeto;
import com.example.lista_java.Repositories.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;

    public Projeto addProjeto(Projeto projeto) {
        return projetoRepository.save(projeto);
    }

    public List<Projeto> findAllProjetos() {
        return projetoRepository.findAll();
    }

    public Projeto findProjetoById(Long id) {
        return projetoRepository.findById(id).get();
    }

    public void deleteProjeto(Long id) {
        projetoRepository.deleteById(id);
    }
}
