package com.ProjetoAPI.ProjetinhoAPI.Documento.model;

import com.ProjetoAPI.ProjetinhoAPI.Pais.model.Pais;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pais_id", nullable = false)
    private Pais pais;

    @Column(nullable = false)
    private String tipoDocumento;

    @Column(nullable = false)
    private String numeroDocumento;

    @Column(nullable = false)
    private String nomeTitular;

    @Column(nullable = false)
    private String informacoesAdicionais;
}