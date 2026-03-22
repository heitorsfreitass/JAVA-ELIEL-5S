package com.example.lista_java.Controllers;

import com.example.lista_java.Entities.Fornecedor;
import com.example.lista_java.Services.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/fornecedores")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @PostMapping
    public ResponseEntity<Fornecedor> addFornecedor(@RequestBody Fornecedor fornecedor) {
        Fornecedor request = fornecedorService.addFornecedor(fornecedor);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
                .path("/{id}")
                .buildAndExpand(fornecedor.getId())
                .toUri();

        return ResponseEntity.created().body(request);
    }

    @GetMapping
    public ResponseEntity<List<Fornecedor>> findAllFornecedores() {
        List<Fornecedor> request = fornecedorService.findAllFornecedores();

        return ResponseEntity.ok().body(request);
    }

    @GetMapping("/{id}")
    public Optional<Fornecedor> findFornecedoresById(@PathVariable Long id) {
        return fornecedorService.findFornecedorById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteFornecedor(@PathVariable Long id) {
        fornecedorService.deleteFornecedor(id);
        return ResponseEntity.noContent().build();
    }
}
