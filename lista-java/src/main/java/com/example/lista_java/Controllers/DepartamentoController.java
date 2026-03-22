package com.example.lista_java.Controllers;

import com.example.lista_java.Entities.Departamento;
import com.example.lista_java.Services.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/departamentos")
public class DepartamentoController {

    @Autowired
    private DepartamentoService departamentoService;

    @PostMapping
    public ResponseEntity<Departamento> addDepartamento(@RequestBody Departamento departamento) {
        Departamento request = departamentoService.addDepartamento(departamento);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
                .path("/{id}")
                .buildAndExpand(departamento.getId())
                .toUri();

        return ResponseEntity.created().body(request);
    }

    @GetMapping
    public ResponseEntity<List<Departamento>> findAllDepartamentos() {
        List<Departamento> request = departamentoService.findAllDepartamentos();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping("/{id}")
    public Optional<Departamento> findDepartamentoById(@PathVariable Long id) {
        return departamentoService.findDepartamentoById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteDepartamento(@PathVariable Long id) {
        departamentoService.deleteDepartamento(id);
        return ResponseEntity.noContent().build();
    }
}
