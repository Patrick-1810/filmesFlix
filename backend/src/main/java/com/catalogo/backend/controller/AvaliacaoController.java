package com.catalogo.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.catalogo.backend.model.Avaliacao;
import com.catalogo.backend.service.AvaliacaoService;

@RestController
@RequestMapping("/api/avaliacoes")
public class AvaliacaoController {

    @Autowired
    private AvaliacaoService avaliacaoService;

    
    @GetMapping("/filme/{filmeId}")
    public List<Avaliacao> getAllEvaluationsByMovieId(@PathVariable Long filmeId) {
        return avaliacaoService.getAllEvaluationsByMovieId(filmeId);
    }

    
    @PostMapping
    public Avaliacao createEvaluation(@RequestBody Avaliacao avaliacao) {
        return avaliacaoService.saveEvaluation(avaliacao);
    }
}
