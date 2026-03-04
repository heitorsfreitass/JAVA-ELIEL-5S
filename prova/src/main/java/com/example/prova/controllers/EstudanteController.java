package com.example.prova.controllers;

import com.example.prova.models.Estudante;
import com.example.prova.repositories.EstudanteRepository;
import com.example.prova.services.EstudanteService;
import jakarta.persistence.PostUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// no controller sempre chama service

@RestController
@RequestMapping(path ="estudantes")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @PostMapping
    public Estudante criarEstudante(@RequestBody Estudante estudante) {
        return estudanteService.criarEstudante(estudante);
    }

    @GetMapping
    public List<Estudante> buscarTodosEstudantes() {
        return estudanteService.buscarTodosEstudantes();
    }

    @GetMapping("/{id}")
    public Optional <Estudante> buscarId(@PathVariable Long id) {
        return estudanteService.buscarId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarEstudante(@PathVariable Long id) {
        estudanteService.deletarEstudante(id);
    }

    @PutMapping("/{id}")
    public Estudante atualizarEstudante(@PathVariable Long id, @RequestBody Estudante estudante) {
        return estudanteService.atualizarEstudante(id, estudante);
    }
}
