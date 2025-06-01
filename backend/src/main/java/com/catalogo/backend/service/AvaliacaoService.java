package com.catalogo.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalogo.backend.model.Avaliacao;
import com.catalogo.backend.repository.AvaliacaoRepository;

@Service
public class AvaliacaoService {

    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    public List<Avaliacao> getAllEvaluationsByMovieId(Long movieId) {
        return avaliacaoRepository.findByFilmeId(movieId);
    }

    public Avaliacao saveEvaluation(Avaliacao avaliacao) {
        return avaliacaoRepository.save(avaliacao);
    }
}
