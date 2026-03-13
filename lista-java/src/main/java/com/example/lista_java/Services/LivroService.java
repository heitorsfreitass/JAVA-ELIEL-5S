package com.example.lista_java.Services;

import com.example.lista_java.Entities.Livro;
import com.example.lista_java.Repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public Livro addLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    public List<Livro> findAllLivros() {
        return livroRepository.findAll();
    }

    public void deleteLivro(Long id) {
        livroRepository.deleteById(id);
    }

    public Livro findLivroById(Long id) {
        return livroRepository.findById(id).get();
    }
}
