<template>
    <Header />

      <div class="container">
        <div class="movie-grid">
          <MovieCard v-for="(movie, index) in movies" :key="index" :movie="movie" />
        </div>
      </div>

    <Footer />
  
</template>

<script setup>
import Header from "@/components/Header.vue";
import MovieCard from "@/components/MovieCard.vue";
import Footer from "@/components/Footer.vue";
import { ref, onMounted } from "vue";
import api from "@/services/api";

const movies = ref([]);

onMounted(async () => {
  try {
    const response = await api.get("/filmes");
    movies.value = response.data;
  } catch (error) {
    console.error("Erro ao buscar filmes da API:", error);
  }
});

</script>

<style scoped>
:global(body) {
  padding: 0;
  margin: 0;
  box-sizing: border-box;
  font-family: "Cairo", sans-serif;
  background-color: rgb(27, 25, 25);
  min-height: 100vh;
}



.container {
  width: 100%;
}

.movie-grid {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
  gap: 16px;
}
</style>
