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


</style>
