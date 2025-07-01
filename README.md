[JAVASCRIPT__BADGE]: https://img.shields.io/badge/Javascript-000?style=for-the-badge&logo=javascript
[VUE__BADGE]: https://img.shields.io/badge/VueJS-fff?style=for-the-badge&logo=vue
[JAVA_BADGE]:https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white
[SPRING_BADGE]: https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white
[MYSQL_BADGE]:https://img.shields.io/badge/MySQL-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white

<h1 align="center" style="font-weight: bold;">🎬 Filmesflix </h1>

![vue][VUE__BADGE]
![javascript][JAVASCRIPT__BADGE]
![java][JAVA_BADGE]
![spring][SPRING_BADGE]
![mysql][MYSQL_BADGE]


<p align="center">
 <a href="#about">Sobre</a> • 
 <a href="#started">Como começar</a> • 
 <a href="#routes">Rotas da aplicação</a> •
 <a href="#contribute">Contribuições</a>
</p>


## 📌 Sobre

Aplicação Full Stack desenvolvida para catalogar filmes. Os usuários podem visualizar detalhes, adicionar aos favoritos e avaliar os filmes disponíveis. O projeto utiliza **Vue.js** no front-end e **Spring Boot** no back-end, com **MySQL** como banco de dados.

---

## 🚀 Como começar

### Pré-requisitos

Certifique-se de ter instalado:

- [Node.js](https://nodejs.org/)
- [Java 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [MySQL](https://dev.mysql.com/downloads/)
- [Git](https://git-scm.com/)

---

### 🔽 Clonando o projeto

```bash
git clone https://github.com/Patrick-1810/filmesFlix
```
## 📂 Frontend
```bash

cd frontend
npm install
npm run serve
```
## 📂 Backend
Configure o arquivo application.properties com suas credenciais do MySQL:
```bash

spring.datasource.url=jdbc:mysql://localhost:3306/catalogo_filmes
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
server.port=8080
```
Inicie o back-end com:
```bash
cd backend
./mvnw spring-boot:run
```

## 📍 Rotas da aplicação

### 🌐 Frontend

| Rota              | Descrição                          |
|-------------------|------------------------------------|
| `/`               | Página inicial com os filmes       |
| `/detalhes/:id`   | Página de detalhes de um filme     |
| `/favoritos`      | Lista de filmes favoritos          |

---

### 🔙 Backend

| Método e Rota        | Descrição                              |
|----------------------|----------------------------------------|
| `GET /filmes`        | Lista todos os filmes                  |
| `GET /filmes/{id}`   | Detalha um filme específico            |
| `POST /avaliacoes`   | Envia uma avaliação de um filme        |
| `GET /favoritos`     | Lista os filmes favoritos              |
| `POST /favoritos`    | Adiciona um filme aos favoritos        |


## 📫 Contribuições
Quer contribuir?

```bash
git clone https://github.com/Patrick-1810/filmesFlix
git checkout -b feature/sua-feature
```
- Siga um padrão de commits semânticos
- Abra um Pull Request explicando o que foi feito
- Se possível, adicione prints das alterações visuais
