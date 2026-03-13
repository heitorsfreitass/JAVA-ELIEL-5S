package com.example.lista_java.Services;

import com.example.lista_java.Entities.Departamento;
import com.example.lista_java.Repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    public Departamento addDepartamento(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    public List<Departamento> findAllDepartamentos() {
        return departamentoRepository.findAll();
    }

    public Departamento findDepartamentoById(Long id) {
        return departamentoRepository.findById(id).get();
    }

    public void deleteDepartamento(Long id) {
        departamentoRepository.deleteById(id);
    }
}
