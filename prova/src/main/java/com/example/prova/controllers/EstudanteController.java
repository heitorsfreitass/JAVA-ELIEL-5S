package com.example.prova.controllers;

import com.example.prova.models.Estudante;
import com.example.prova.repositories.EstudanteRepository;
import com.example.prova.services.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @DeleteMapping("/{id}")
    public void deletarEstudante(@PathVariable Long id) {
        estudanteService.deletarEstudante(id);
    }
}
