<template>
  <Header />

<div class="container">
  <div class="movie-grid">
     <MovieCard
      v-for="(movie, index) in movies"
      :key="index"
      :movie="movie"
     />
   </div>
</div>
</template>

<script setup>
import { ref } from 'vue'
import Header from '@/components/Header.vue'
import MovieCard from '@/components/MovieCard.vue'

const movies = ref([
  {
    title: "Captain Marvel",
    image: "captain-marvel.png",
    rating: "6.9",
    genre: "Ação",
    year: 2019,
    synopsis:
      "Carol Danvers se torna uma das heroínas mais poderosas do universo quando a Terra se vê no meio de uma guerra galáctica entre duas raças alienígenas.",
  },
  {
    title: "Bloodshot",
    image: "blood-shot.jpg",
    rating: "5.7",
    genre: "Ação",
    year: 2020,
    synopsis:
      "Ray Garrison é ressuscitado por uma corporação com nanotecnologia, tornando-se o super-herói Bloodshot com poderes de regeneração e força sobre-humana.",
  },
  {
    title: "Love, Rosie",
    image: "love-roise.jpg",
    rating: "7.2",
    genre: "Romance",
    year: 2014,
    synopsis:
      "Melhores amigos desde a infância, Rosie e Alex enfrentam amores perdidos e desencontros ao longo dos anos até perceberem o que sentem um pelo outro.",
  },
  {
    title: "Captain Marvel",
    image: "captain-marvel.png",
    rating: "6.9",
    genre: "Ação",
    year: 2019,
    synopsis:
      "Carol Danvers se torna uma das heroínas mais poderosas do universo quando a Terra se vê no meio de uma guerra galáctica entre duas raças alienígenas.",
  },
  {
    title: "Bloodshot",
    image: "blood-shot.jpg",
    rating: "5.7",
    genre: "Ação",
    year: 2020,
    synopsis:
      "Ray Garrison é ressuscitado por uma corporação com nanotecnologia, tornando-se o super-herói Bloodshot com poderes de regeneração e força sobre-humana.",
  },
  {
    title: "Love, Rosie",
    image: "love-roise.jpg",
    rating: "7.2",
    genre: "Romance",
    year: 2014,
    synopsis:
      "Melhores amigos desde a infância, Rosie e Alex enfrentam amores perdidos e desencontros ao longo dos anos até perceberem o que sentem um pelo outro.",
  },
  {
    title: "Captain Marvel",
    image: "captain-marvel.png",
    rating: "6.9",
    genre: "Ação",
    year: 2019,
    synopsis:
      "Carol Danvers se torna uma das heroínas mais poderosas do universo quando a Terra se vê no meio de uma guerra galáctica entre duas raças alienígenas.",
  },
  {
    title: "Bloodshot",
    image: "blood-shot.jpg",
    rating: "5.7",
    genre: "Ação",
    year: 2020,
    synopsis:
      "Ray Garrison é ressuscitado por uma corporação com nanotecnologia, tornando-se o super-herói Bloodshot com poderes de regeneração e força sobre-humana.",
  },
  {
    title: "Love, Rosie",
    image: "love-roise.jpg",
    rating: "7.2",
    genre: "Romance",
    year: 2014,
    synopsis:
      "Melhores amigos desde a infância, Rosie e Alex enfrentam amores perdidos e desencontros ao longo dos anos até perceberem o que sentem um pelo outro.",
  },
])
</script>

<style scoped>
* {
  padding: 0;
  margin: 0;
  box-sizing: border-box;
  font-family: "Cairo", sans-serif;
  
}

.container{
  width: 100%;
  height: auto;
  background:rgb(27, 25, 25);
}

.movie-grid {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
  gap: 16px;

}
</style>  