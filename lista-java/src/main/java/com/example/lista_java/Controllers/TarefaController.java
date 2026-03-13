package com.example.lista_java.Controllers;

import com.example.lista_java.Entities.Tarefa;
import com.example.lista_java.Repositories.TarefaRepository;
import com.example.lista_java.Services.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @PostMapping
    public Tarefa addTarefa(@RequestBody Tarefa tarefa) {
        return tarefaService.addTarefa(tarefa);
    }

    @GetMapping
    public List<Tarefa> findAllTarefas() {
        return tarefaService.findAllTarefas();
    }

    @GetMapping("/{id}")
    public Tarefa findTarefaById(@PathVariable Long id) {
        return tarefaService.findTarefaById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTarefa(@PathVariable Long id) {
        tarefaService.deleteTarefa(id);
    }
}
