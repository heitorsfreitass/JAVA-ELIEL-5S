package com.example.lista_java.Services;

import com.example.lista_java.Entities.Projeto;
import com.example.lista_java.Entities.Tarefa;
import com.example.lista_java.Repositories.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public Tarefa addTarefa(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public List<Tarefa> findAllTarefas() {
        return tarefaRepository.findAll();
    }

    public Tarefa findTarefaById(Long id) {
        return tarefaRepository.findById(id).get();
    }

    public void deleteTarefa(Long id) {
        tarefaRepository.deleteById(id);
    }
}
