package com.catalogo.backend.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalogo.backend.model.Favoritos;
import com.catalogo.backend.repository.FavoritosRepository;

@Service
public class FavoritosService {

    @Autowired
    private FavoritosRepository favoritosRepository;


    public Favoritos addFavorito( Long filmeId) {
    if (!favoritosRepository.existsByUsuarioIdAndFilmeId( filmeId)) {
        Favoritos favorito = new Favoritos();
        favorito.setFilmeId(filmeId);
        return favoritosRepository.save(favorito);
    }
    return null;
}


    public void removerFavorito(Long filmeId) {
        favoritosRepository.deleteByUsuarioIdAndFilmeId(filmeId);
    }
}
