package com.example.prova.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_aluno")
public class Estudante {
    public Estudante() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_aluno")
    private String nome;

    @Column(name = "email_aluno")
    private String email;

    private Integer idade;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

}
