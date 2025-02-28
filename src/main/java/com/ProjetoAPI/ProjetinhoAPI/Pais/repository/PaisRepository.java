package com.ProjetoAPI.ProjetinhoAPI.Pais.repository;

import com.ProjetoAPI.ProjetinhoAPI.Pais.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface PaisRepository extends JpaRepository<Pais, Long> {
    Optional<Pais> findByNome(String nome);
}