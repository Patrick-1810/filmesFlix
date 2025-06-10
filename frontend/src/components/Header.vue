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


</style>
