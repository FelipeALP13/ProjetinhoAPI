package com.ProjetoAPI.ProjetinhoAPI.Documento.repository;

import com.ProjetoAPI.ProjetinhoAPI.Documento.model.Documento;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface DocumentoRepository extends JpaRepository<Documento, Long> {
    Optional<Documento> findByPaisNomeAndTipoDocumento(String paisNome, String tipoDocumento);
}
