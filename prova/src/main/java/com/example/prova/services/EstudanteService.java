package com.example.prova.services;

import com.example.prova.models.Estudante;
import com.example.prova.repositories.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// na service sempre chama repository

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

    public Optional <Estudante> buscarId(Long id) {
        return  estudanteRepository.findById(id);
    }

    public void deletarEstudante(Long id) {
        estudanteRepository.deleteById(id);
    }

//    nao passa o id pq o id eh so pra buscar, estudante q vai salvar.
    public Estudante atualizarEstudante(Long id, Estudante estudante) {
//      vai no banco e ve se tem o id ou nao
        Estudante newEstudante = estudanteRepository.findById(id).get();
        newEstudante.setNome(estudante.getNome());
        newEstudante.setEmail(estudante.getEmail());
        newEstudante.setIdade(estudante.getIdade());

        return estudanteRepository.save(estudante);
    }
}
