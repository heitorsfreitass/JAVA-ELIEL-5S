package com.example.lista_java.Services;

import com.example.lista_java.Entities.Categoria;
import com.example.lista_java.Repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria addCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public List<Categoria> findAllCategorias() {
        return categoriaRepository.findAll();
    }

    public void deleteCategoria(Long id) {
        categoriaRepository.deleteById(id);
    }

    public Categoria findCategoriaById(Long id) {
        return categoriaRepository.findById(id).get();
    }
}
