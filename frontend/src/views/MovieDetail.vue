<template>
  <Header />
  <div v-if="filme" class="filmes-details">
    <div class="details-container">
      <div class="imagem">
        <img :src="filme.imagem" alt="Imagem do filme" />
      </div>

      <div class="infos">
        <h2>{{ filme.nome }}</h2>
        <p>{{ filme.genero }}</p>
        <p>{{ filme.sinopse }}</p>
        <p>{{ filme.anoDeLancamento }} | ⭐ {{ filme.avaliacao }}</p>
      </div>
    </div>
  </div>

  <div class="coments-container">
    <h3>Comentários</h3>

    <ul class="coments-list">
      <li
        v-for="comentario in comentarios"
        :key="comentario.id"
        class="coments-item"
      >
        <strong>{{ comentario.autor }}:</strong> {{ comentario.comentario }}
        <br />
        <em>Nota: {{ comentario.avaliacao }}/5</em>
      </li>
    </ul>

    <div class="form-wrapper">
      <form @submit.prevent="enviarComentario" class="coments-form">
        <input v-model="novoComentario.autor" placeholder="Seu nome" required />
        <textarea
          v-model="novoComentario.comentario"
          placeholder="Comentário"
          required
        ></textarea>
        <input
          type="number"
          v-model.number="novoComentario.avaliacao"
          placeholder="Nota (1-5)"
          min="1"
          max="5"
          required
        />
        <button type="submit">Enviar comentário</button>
      </form>
    </div>
  </div>
  <Footer />
</template>

<script setup>
import Header from "@/components/Header.vue";
import Footer from "@/components/Footer.vue";
import { onMounted, reactive, ref } from "vue";
import { useRoute } from "vue-router";
import api from "@/services/api";

const route = useRoute();
const filmeId = route.params.id;

const filme = ref(null);
const comentarios = ref([]);

const novoComentario = reactive({
  autor: "",
  comentario: "",
  avaliacao: null,
});

const buscarFilme = async () => {
  try {
    const res = await api.get(`/filmes/${filmeId}`);
    filme.value = res.data;
  } catch (erro) {
    console.error("Erro ao buscar o filme:", erro);
  }
};

const buscarComentarios = async () => {
  try {
    const res = await api.get(`/avaliacoes/filme/${filmeId}`);
    comentarios.value = res.data;
  } catch (erro) {
    console.error("Erro ao buscar comentarios:", erro);
  }
};

const enviarComentario = async () => {
  try {
    await api.post("/avaliacoes", {
      ...novoComentario,
      filme: { id: Number(filmeId) },
    });

    novoComentario.autor = "";
    novoComentario.comentario = "";
    novoComentario.avaliacao = null;

    await buscarComentarios();
  } catch (erro) {
    console.error("Erro ao enviar comentário:", erro);
  }
};

onMounted(() => {
  buscarFilme();
  buscarComentarios();
});
</script>

<style scoped>
:global(body) {
  padding: 0;
  margin: 0;
  box-sizing: border-box;
  font-family: "Cairo", sans-serif;
  background-color: rgb(27, 25, 25);
  color: aliceblue;
}

.filmes-details {
  padding-top: 6rem;
  margin: 20px;
}

.details-container {
  display: flex;
  align-items: flex-start;
  gap: 20px;
}

.imagem img {
  width: 200px;
  height: auto;
  border-radius: 8px;
}

.infos {
  display: flex;
  flex-direction: column;
}

.infos p {
  margin-bottom: 5px;
}

.coments-container {
  margin-top: 8px;
  padding: 20px;
}

.coments-container h3 {
  text-align: center;
}

.coments-list {
  list-style: none;
  padding: 0;
  margin-bottom: 20px;
}

.coments-item {
  margin-bottom: 15px;
  padding: 10px;
  background: transparent;
  border-radius: 6px;
  border: 1px solid #000000;
}

.form-wrapper {
  display: flex;
  justify-content: center;
}

.coments-form {
  width: 300px;
  display: flex;
  flex-direction: column;
  gap: 20px;
}

.coments-form input,
.coments-form textarea {
  background-color: transparent;
  color: #ffffff;
  padding: 10px;
  border: 1px solid black;
  border-radius: 6px;
}

.coments-form button {
  padding: 10px;
  background-color: #bb1a1a;
  color: #ffffff;
  border: none;
  border-radius: 6px;
  cursor: pointer;
}

@media screen and (max-width: 520px) {
  .details-container {
    display: flex;
    flex-direction: column;
    align-items: center;
    text-align: center;
  }

  .infos h2 {
    margin: 0;
  }

  .infos p {
    margin-bottom: 2px;
  }
}
</style>
