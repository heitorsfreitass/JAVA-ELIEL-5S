package com.example.prova.services;

import com.example.prova.models.Estudante;
import com.example.prova.repositories.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudanteService {

    @Autowired
    EstudanteRepository estudanteRepository;

    public Estudante criarEstudante(Estudante estudante) {
        return estudanteRepository.save(estudante);
    }

    public List<Estudante> buscarTodosEstudantes() {
        return estudanteRepository.findAll();
    }

    public void deletarEstudante(Long id) {
        estudanteRepository.deleteById(id);
    }
}
