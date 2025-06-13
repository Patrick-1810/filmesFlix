<template>
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
</template>

<script setup>
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
