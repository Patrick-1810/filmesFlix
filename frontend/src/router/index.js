import { createRouter, createWebHistory } from 'vue-router'
import HomeMovie from '@/views/HomeMovie.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeMovie,
    },
    
  ],
})

export default router