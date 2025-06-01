package com.catalogo.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catalogo.backend.model.Avaliacao;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
    
    List<Avaliacao> findByFilmeId(Long filmeId);
}
