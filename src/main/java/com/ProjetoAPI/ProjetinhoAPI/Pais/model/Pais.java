package com.ProjetoAPI.ProjetinhoAPI.Pais.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nome;
}
