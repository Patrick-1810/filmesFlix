import { createRouter, createWebHistory } from 'vue-router'
import HomeMovie from '@/views/HomeMovie.vue'
import MovieDetail from '@/views/MovieDetail.vue'
import FavoritosView from '@/views/FavoritosView.vue'

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
    {
      path: '/favoritos',
      name: 'favoritos',
      component: FavoritosView
    }
  ],
})

export default router