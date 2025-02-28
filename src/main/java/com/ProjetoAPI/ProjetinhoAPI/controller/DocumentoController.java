package com.ProjetoAPI.ProjetinhoAPI.controller;

import com.ProjetoAPI.ProjetinhoAPI.Documento.model.Documento;
import com.ProjetoAPI.ProjetinhoAPI.Service.DocumentoService;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/documentos")
public class DocumentoController {

    private final DocumentoService documentoService;

    public DocumentoController(DocumentoService documentoService) {
        this.documentoService = documentoService;
    }

    @GetMapping
    public String buscarDocumento(@RequestParam String pais, @RequestParam String documento) {
        Optional<Documento> documentoOpt = documentoService.buscarDocumento(pais, documento);
        return documentoOpt.map(Documento::toString).orElse("Documento não encontrado");
    }
}
