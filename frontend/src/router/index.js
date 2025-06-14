import { createRouter, createWebHistory } from 'vue-router'
import HomeMovie from '@/views/HomeMovie.vue'
import MovieDetail from '@/views/MovieDetail.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeMovie,
    },
    {
      path: '/filme/:id',
      name: 'movieDetail',
      component: MovieDetail
    },
  ],
})

export default router