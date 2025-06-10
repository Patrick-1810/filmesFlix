package com.catalogo.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalogo.backend.model.Favoritos;
import com.catalogo.backend.repository.FavoritosRepository;

@Service
public class FavoritosService {

    @Autowired
    private FavoritosRepository favoritosRepository;

    public List<Favoritos> getFavoritosByUsuarioId(Long usuarioId) {
        return favoritosRepository.findByUsuarioId(usuarioId);
    }

    public Favoritos addFavorito(Long usuarioId, Long filmeId) {
    if (!favoritosRepository.existsByUsuarioIdAndFilmeId(usuarioId, filmeId)) {
        Favoritos favorito = new Favoritos(usuarioId, filmeId);
        return favoritosRepository.save(favorito);
    }
    return null;
}


    public void removerFavorito(Long usuarioId, Long filmeId) {
        favoritosRepository.deleteByUsuarioIdAndFilmeId(usuarioId, filmeId);
    }
}
