import api from "./api";

const USUARIO_ID = 1;

export default {
    adicionarFavorito(filmeId) {
        return api.post(`/favoritos`, null, {
            params: {
                usuarioId: USUARIO_ID,
                filmeId: filmeId,
            },
        });
    },

    removerFavorito(filmeId) {
        return api.delete(`/favoritos`, {
            params: {
                usuarioId: USUARIO_ID,
                filmeId: filmeId
            },
        });
    },

    getFavoritos() {
        return api.get(`/favoritos/usuario/${USUARIO_ID}`);
    }
};
