package com.example.lista_java.Controllers;

import com.example.lista_java.Entities.Categoria;
import com.example.lista_java.Services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public Categoria addCategoria(@RequestBody Categoria categoria) {
        return categoriaService.addCategoria(categoria);
    }

    @GetMapping
    public List<Categoria> findAllCategorias() {
        return categoriaService.findAllCategorias();
    }

    @DeleteMapping("/{id}")
    public void deleteCategoria(@PathVariable Long id) {
        categoriaService.deleteCategoria(id);
    }

    @GetMapping("/{id}")
    public Categoria findCategoriaById(@PathVariable Long id) {
        return categoriaService.findCategoriaById(id);
    }
}
