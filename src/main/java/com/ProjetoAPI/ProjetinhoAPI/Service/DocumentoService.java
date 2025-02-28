package com.ProjetoAPI.ProjetinhoAPI.Service;

import com.ProjetoAPI.ProjetinhoAPI.Documento.model.Documento;
import com.ProjetoAPI.ProjetinhoAPI.Documento.repository.DocumentoRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class DocumentoService {

    private final DocumentoRepository documentoRepository;

    public DocumentoService(DocumentoRepository documentoRepository) {
        this.documentoRepository = documentoRepository;
    }

    public Optional<Documento> buscarDocumento(String paisNome, String tipoDocumento) {
        return documentoRepository.findByPaisNomeAndTipoDocumento(paisNome, tipoDocumento);
    }
}
