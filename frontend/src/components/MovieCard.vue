<template>
  <div class="movie-card" @mouseover="hover = true" @mouseleave="hover = false">
    <img :src="getImageUrl(movie.image)" :alt="movie.title" />
    <div class="info">
      <h3>{{ movie.title }}</h3>
      <p>⭐ {{ movie.rating }} | {{ movie.genre }} | {{ movie.year }}</p>
    </div>
    <div class="synopsis" v-if="hover">
      <p>{{ movie.synopsis }}</p>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue'

defineProps({
  movie: Object
})

const hover = ref(false)


const getImageUrl = (filename) => {
  return new URL(`../assets/movies/${filename}`, import.meta.url).href
}

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
  top: 220px;
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
</style>
