package com.example.lista_java.Controllers;

import com.example.lista_java.Entities.Tarefa;
import com.example.lista_java.Services.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @PostMapping
    public ResponseEntity<Tarefa> addTarefa(@RequestBody Tarefa tarefa) {
        Tarefa request = tarefaService.addTarefa(tarefa);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
                .path("/{id}")
                .buildAndExpand(tarefa.getId())
                .toUri();

        return ResponseEntity.created().body(request);
    }

    @GetMapping
    public ResponseEntity<List<Tarefa>> findAllTarefas() {
        List<Tarefa> request = tarefaService.findAllTarefas();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping("/{id}")
    public Optional<Tarefa> findTarefaById(@PathVariable Long id) {
        return tarefaService.findTarefaById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTarefa(@PathVariable Long id) {
        tarefaService.deleteTarefa(id);
        return ResponseEntity.noContent().build();
    }
}
