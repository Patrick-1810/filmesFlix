<template>
  <div class="nav-wrapper">
    <div class="container">
      <div class="nav">
        <a href="#" class="logo">
          Filmes<span class="main-color">flix</span>
        </a>
        <ul class="nav-menu" :class="{ active: isMenuOpen }" id="nav-menu">
          <li><a href="#">Home</a></li>
          <li><a href="#">Movies</a></li>
          <li>
            <a href="#" class="btn btn-hover">
              <span>Sign in</span>
            </a>
          </li>
        </ul>
          <div class="hamburger-menu" :class="{ active: isMenuOpen }" @click="toggleMenu">
          <div class="hamburger"></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue'

const isMenuOpen = ref(false)

const toggleMenu = () => {
  isMenuOpen.value = !isMenuOpen.value
}

</script>

<style scoped>
* {
  padding: 0;
  margin: 0;
  box-sizing: border-box;
}

html {
  font-size: 16px;
}

a {
  text-decoration: none;
  color: unset;
}

img {
  max-width: 100%;
}

.main-color {
  color: #bb1a1a;
}

.container {
  max-width: 1920px;
  padding:  20px;
  margin: auto;
}

.nav-wrapper {
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  z-index: 99;
  background-color: #000000;
}

.nav {
  display: flex;
  align-items: center;
  justify-content: space-between;
  color: #ffffff;
  height: 60px;
}

.nav a {
  color: #ffffff;
}

.logo {
  font-size: 2rem;
  font-weight: 900;
}

.nav-menu {
  list-style-type: none;
  display: flex;
  align-items: center;
  padding: 0 20px;
  margin-right: 90px;
}

.nav-menu li ~ li {
 margin-left: 30px;
}

.nav-menu a {
  text-transform: uppercase;
  font-weight: 700;
}

.nav-menu a:hover {
  color:#bb1a1a;
}

.nav-menu a.btn:hover,
a.logo:hover,
a.movie-item:hover {
  color: unset;
}

.btn {
  color: #ffffff;
  padding: 0.25rem 1.5rem;
  text-transform: uppercase;
  font-size: 1.25rem;
  font-weight: 700;
  display: inline-flex;
  position: relative;
  align-items: center;
}

.btn-hover::before {
  z-index: 1;
  content: "";
  position: absolute;
  top: 0;
  left: 0;
  width: 0%;
  height: 100%;
  background-color: #bb1a1a;
  transition: 0.3s ease-in-out;
}

.btn-hover:hover::before {
  width: 100%;
}

.btn i,
.btn span {
  z-index: 1;
}

.btn i {
  margin-right: 1rem;
}

.hamburger-menu {
  --size: 30px;
  height: var(--size);
  width: var(--size);
  cursor: pointer;
  z-index: 101;
  position: relative;
  display: none;
  align-items: center;
}

.hamburger {
  position: relative;
}

.hamburger,
.hamburger::before,
.hamburger::after {
  width: var(--size);
  height: 3px;
  border-radius: 0.5rem;
  background-color: #ffffff;
  transition: 0.4s;
}

.hamburger::before,
.hamburger::after {
  content: "";
  position: absolute;
  left: 0;
}

.hamburger::before {
  top: -10px;
}

.hamburger::after {
  bottom: -10px;
}

.hamburger-menu.active .hamburger {
  background-color: transparent;
}

.hamburger-menu.active .hamburger::before {
  transform-origin: top left;
  transform: rotate(45deg);
  left: 6px;
}

.hamburger-menu.active .hamburger::after {
  transform-origin: bottom left;
  transform: rotate(-45deg);
  left: 6px;
}


@media screen and (max-width: 768px) {
  .nav-menu {
  position: fixed;
  top: 0;
  left: 0;
  height: 100vh;
  width: 100vw;
  background-color: rgba(0, 0, 0, 0.85);
  flex-direction: column;
  justify-content: center;
  align-items: center;
  gap: 30px;
  transform: translateY(-100%);
  transition: transform 0.3s ease-in-out, opacity 0.3s ease-in-out;
  opacity: 0;
  visibility: hidden;
  z-index: 98;
  }


 .nav-menu.active {
  transform: translateY(0);
  opacity: 1;
  visibility: visible;
  }


  .hamburger-menu {
    display: flex;
  }

  .nav-menu li ~ li {
    margin-left: 0;
  }
}


</style>
