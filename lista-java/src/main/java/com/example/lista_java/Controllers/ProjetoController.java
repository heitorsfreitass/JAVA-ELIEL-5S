package com.example.lista_java.Controllers;

import com.example.lista_java.Entities.Projeto;
import com.example.lista_java.Services.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @PostMapping
    public ResponseEntity<Projeto> addProjeto(@RequestBody Projeto projeto) {
        Projeto request = projetoService.addProjeto(projeto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
                .path("/{id}")
                .buildAndExpand(projeto.getId())
                .toUri();

        return ResponseEntity.created().body(request);
    }

    @GetMapping
    public ResponseEntity<List<Projeto>> findAllProjetos() {
        List<Projeto> request = projetoService.findAllProjetos();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping("/{id}")
    public Optional<Projeto> findProjetoById(@PathVariable Long id) {
        return projetoService.findProjetoById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProjeto(@PathVariable Long id) {
        projetoService.deleteProjeto(id);
        return ResponseEntity.noContent().build();
    }
}

