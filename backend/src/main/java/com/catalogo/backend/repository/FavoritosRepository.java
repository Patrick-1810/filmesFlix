package com.catalogo.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catalogo.backend.model.Favoritos;

public interface FavoritosRepository extends JpaRepository<Favoritos, Long> {

    void deleteByUsuarioIdAndFilmeId( Long filmeId);

    boolean existsByUsuarioIdAndFilmeId( Long filmeId);
}
