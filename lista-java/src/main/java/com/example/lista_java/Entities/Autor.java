package com.example.lista_java.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_autor")
    private String nome;

    @Column(name = "nacionalidade_autor")
    private String nacionalidade;

    private LocalDate dataNascimento;
}
