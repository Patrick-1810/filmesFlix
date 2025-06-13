<template>
  <footer class="footer">
    <div class="container">
      <div class="footer-content">
        <a href="#" class="footer-logo">
          Filmes<span class="main-color">flix</span>
        </a>
        <p class="footer-text">© 2025 Filmesflix. Todos os direitos reservados.</p>
        <div class="social-icons">
          <a href="#" target="_blank"><i class='bx bxl-facebook'></i></a>
          <a href="#" target="_blank"><i class='bx bxl-instagram'></i></a>
          <a href="#" target="_blank"><i class='bx bxl-twitter'></i></a>
          <a href="#" target="_blank"><i class='bx bxl-youtube'></i></a>
        </div>
      </div>
    </div>
  </footer>
</template>

<style scoped>
.container {
  max-width: 1920px;
  padding: 0 20px; 
  margin: 0 auto;
   
}


.footer {
  background-color: #000;
  color: #fff;
  padding: 2rem 1rem;
  margin-top: 120px;
  
}

.footer-content {
  display: flex;
  flex-direction: column;
  align-items: center;
  text-align: center;
  gap: 1rem;
  
}

.footer-logo {
  font-size: 1.8rem;
  font-weight: 900;
  color: #fff;
  margin-bottom: 1rem;  
}

a {
    text-decoration: none;
}

.main-color{
   color: #bb1a1a; 
}

.footer-text {
  font-size: 0.9rem;
  margin-bottom: 1.5rem;
  color: #ccc;
}

.social-icons {
  display: flex;
  gap: 1rem;
}

.social-icons a {
  font-size: 1.5rem;
  color: #fff;
  transition: color 0.3s;
}

.social-icons a:hover {
  color: #bb1a1a;
}

@media (min-width: 768px) {
  .footer-content {
    flex-direction: row;
    justify-content: space-between;
    text-align: left;
  }

  .footer-logo {
    margin-bottom: 0;
  }

  .footer-text {
    margin: 0;
  }
}
</style>
