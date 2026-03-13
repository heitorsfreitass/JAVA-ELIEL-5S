package com.example.lista_java.Controllers;

import com.example.lista_java.Entities.Projeto;
import com.example.lista_java.Services.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @PostMapping
    public Projeto addProjeto(@RequestBody Projeto projeto) {
        return projetoService.addProjeto(projeto);
    }

    @GetMapping
    public List<Projeto> findAllProjetos() {
        return projetoService.findAllProjetos();
    }

    @GetMapping("/{id}")
    public Projeto findProjetoById(@PathVariable Long id) {
        return projetoService.findProjetoById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProjeto(@PathVariable Long id) {
        projetoService.deleteProjeto(id);
    }
}

