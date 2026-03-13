package com.example.lista_java.Controllers;

import com.example.lista_java.Entities.Departamento;
import com.example.lista_java.Services.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/departamentos")
public class DepartamentoController {

    @Autowired
    private DepartamentoService departamentoService;

    public Departamento addDepartamento(Departamento departamento) {
        return departamentoService.addDepartamento(departamento);
    }

    public List<Departamento> findAllDepartamentos() {
        return departamentoService.findAllDepartamentos();
    }

    public Departamento findDepartamentoById(Long id) {
        return departamentoService.findDepartamentoById(id);
    }

    public void deleteDepartamento(Long id) {
        departamentoService.deleteDepartamento(id);
    }
}
