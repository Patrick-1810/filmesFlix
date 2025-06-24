<template>
  <div class="layout">
    <Header />

    <div class="main-content">
      <div class="favoritos-page">
        <h1>Meus Favoritos ❤️</h1>
        <div v-if="favoritos.length === 0">Nenhum filme favoritado.</div>
        <div class="movie-grid">
          <MovieCard
            v-for="(filme, index) in favoritosFilmes"
            :key="index"
            :movie="filme"
          />
        </div>
      </div>
    </div>

    <Footer />
  </div>
</template>

<script setup>
import Header from "@/components/Header.vue";
import Footer from "@/components/Footer.vue";
import MovieCard from "@/components/MovieCard.vue";
import { ref, onMounted } from "vue";
import api from "@/services/api";
import favoritosApi from "@/services/favoritosApi";

const favoritos = ref([]);
const favoritosFilmes = ref([]);


const carregarFavoritos = async () => {
  try {
    const res = await favoritosApi.getFavoritos();
    favoritos.value = res.data;

    const filmesRes = await api.get("filmes");
    favoritosFilmes.value = filmesRes.data.filter((filme) =>
      favoritos.value.some((fav) => fav.filmeId === filme.id)
    );
  } catch (error) {
    console.error("Erro ao carregar favoritos: ", error);
  }
};

onMounted(carregarFavoritos);
</script>

<style scoped>
.layout {
  display: flex;
  flex-direction: column;
  min-height: 100vh;
}

.main-content {
  flex: 1;
}

.movie-grid {
  display: flex;
  flex-wrap: wrap;
  gap: 20px;
  justify-content: center;
}

.favoritos-page {
  padding: 2rem 1rem;
}
</style>
