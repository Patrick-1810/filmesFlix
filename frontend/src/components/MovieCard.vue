<template>
  <div class="movie-card" @mouseover="hover = true" @mouseleave="hover = false">
    <img :src="movie.imagem" :alt="movie.nome" />
    <div class="info">
      <h3>{{ movie.nome }}</h3>
      <p>⭐ {{ movie.avaliacao }} | {{ movie.genero }} | {{ movie.anoDeLancamento }}</p> 
    </div>
    <div class="synopsis" v-if="hover">
      <div class="synopsis-header">
      <p>{{ movie.sinopse }}</p>
      <i class='bx bx-heart save-icon' @click="saveMovie"></i>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref } from "vue";

defineProps({
  movie: Object,
});

const hover = ref(false);

</script>

<style scoped>
* {
  padding: 0;
  margin: 0;
  box-sizing: border-box;
  font-family: "Cairo", sans-serif;
  color: #ffffff;
}

.movie-card {
  position: relative;
  width: 200px;
  height: 350px;
  margin: 10px;
  top: 8rem;
  border-radius: 10px;
  overflow: hidden;
  background: #111;
  box-shadow: 0 2px 10px rgba(0, 0, 0, 0.7);
  transition: transform 0.3s ease;
  cursor: pointer;
}
.movie-card:hover {
  transform: scale(1.05);
}

.movie-card img {
  width: 100%;
  height: 100%;
  object-fit: cover;
  position: absolute;
  top: 0;
  left: 0;
  z-index: 0;
}

.info {
  position: absolute;
  bottom: 0;
  left: 0;
  width: 100%;
  padding: 10px;
  background: rgba(0, 0, 0, 0.2);
  color: #fff;
  z-index: 1;
}

.synopsis {
  position: absolute;
  bottom: 0;
  background: rgba(0, 0, 0, 0.7);
  color: white;
  padding: 10px;
  font-size: 0.85rem;
  font-weight: bold;
  height: 100%;
  width: 100%;
  overflow-y: auto;
  transition: opacity 0.3s ease;
}

.synopsis-header {
  display: flex;
  justify-content: space-between;
  align-items: flex-start;
  gap: 10px;
}

.save-icon {
  font-size: 24px;
  color: #ffffff;
  cursor: pointer;
  transition: transform 0.2s ease;
}

.save-icon:hover {
  transform: scale(1.2);
  color: #bb1a1a;
}
</style>
