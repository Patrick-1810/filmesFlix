import { createRouter, createWebHistory } from 'vue-router'
import MovieDetail from '@/views/MovieDetail.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/filme/:id',
      name: 'movieDetail',
      component: MovieDetail
    },
  ],
})

export default router