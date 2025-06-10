package com.catalogo.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catalogo.backend.model.Favoritos;

public interface FavoritosRepository extends JpaRepository<Favoritos, Long> {

    List<Favoritos> findByUsuarioId(Long usuarioId);

    void deleteByUsuarioIdAndFilmeId(Long usuarioId, Long filmeId);

    boolean existsByUsuarioIdAndFilmeId(Long usuarioId, Long filmeId);
}
