package com.catalogo.backend.repository;

import com.catalogo.backend.model.Filmes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmeRepository extends JpaRepository<Filmes, Long> {
    List<Filmes> findByNome(String nome);
    List<Filmes> findByGenero(String genero);
}
