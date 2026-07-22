# 🎮 Loja de Games

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-red?style=for-the-badge&logo=openjdk">
  <img src="https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=springboot">
  <img src="https://img.shields.io/badge/MySQL-8.0-4479A1?style=for-the-badge&logo=mysql">
  <img src="https://img.shields.io/badge/JPA-Hibernate-orange?style=for-the-badge">
  <img src="https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge">
</p>

## 📖 Sobre o projeto

A **Loja de Games** é uma aplicação desenvolvida em **Java com Spring Boot** para gerenciamento de uma loja de jogos digitais.

A API permite realizar o cadastro e gerenciamento de produtos, organizando-os por categorias através de um relacionamento **One-to-Many** entre as entidades.

O projeto foi desenvolvido utilizando a arquitetura em camadas (**Model, Repository e Controller**), seguindo as boas práticas de desenvolvimento com Spring Boot.

---

## 🚀 Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Jakarta Validation
- Insomnia
- Git & GitHub

---

## 📂 Estrutura do projeto

```
src
├── controller
│   ├── CategoriaController.java
│   └── ProdutoController.java
│
├── model
│   ├── Categoria.java
│   └── Produto.java
│
├── repository
│   ├── CategoriaRepository.java
│   └── ProdutoRepository.java
│
└── LojaDeGamesApplication.java
```

---

# 📊 Modelo de Dados

## Categoria

| Campo | Tipo |
|--------|------|
| id | Long |
| tipo | String |

### Relacionamento

Uma categoria pode possuir vários produtos.

---

## Produto

| Campo | Tipo |
|--------|------|
| id | Long |
| titulo | String |
| descricao | String |
| preco | BigDecimal |
| estoque | Integer |
| foto | String |
| categoria | Categoria |

---

# 🔗 Relacionamento

```
Categoria (1)
      │
      │
      │
Produto (N)
```

Uma **Categoria** pode conter diversos **Produtos**, enquanto cada Produto pertence a apenas uma Categoria.

---

# ⚙️ Funcionalidades

## Categorias

- ✅ Listar todas as categorias
- ✅ Buscar categoria por ID
- ✅ Buscar categoria por tipo
- ✅ Cadastrar categoria
- ✅ Atualizar categoria
- ✅ Excluir categoria

---

## Produtos

- ✅ Listar todos os produtos
- ✅ Buscar produto por ID
- ✅ Buscar produto por título
- ✅ Buscar produtos com preço maior que um valor
- ✅ Buscar produtos com preço menor que um valor
- ✅ Cadastrar produto
- ✅ Atualizar produto
- ✅ Excluir produto

---

# 📌 Endpoints

## Categoria

| Método | Endpoint |
|---------|----------|
| GET | /categorias |
| GET | /categorias/{id} |
| GET | /categorias/tipo/{tipo} |
| POST | /categorias |
| PUT | /categorias |
| DELETE | /categorias/{id} |

---

## Produto

| Método | Endpoint |
|---------|----------|
| GET | /produtos |
| GET | /produtos/{id} |
| GET | /produtos/titulo/{titulo} |
| GET | /produtos/maior/{preco} |
| GET | /produtos/menor/{preco} |
| POST | /produtos |
| PUT | /produtos |
| DELETE | /produtos/{id} |

---

# 💻 Como executar

Clone o repositório

```bash
git clone https://github.com/marypraxedes/lojadegames.git
```

Entre na pasta

```bash
cd lojadegames
```

Configure o banco de dados MySQL no arquivo

```properties
application.properties
```

Execute a aplicação pelo Spring Boot.

A API ficará disponível em:

```
http://localhost:8080
```

---

# 🧪 Testes

Todos os endpoints foram testados utilizando o **Insomnia**, validando as operações de CRUD para as entidades **Categoria** e **Produto**.

---

# 👩‍💻 Desenvolvedora

**Maryane Praxedes**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=flat-square&logo=linkedin)](https://linkedin.com/in/marypraxedes)

[![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat-square&logo=github)](https://github.com/marypraxedes)

---

<p align="center">
Desenvolvido utilizando Java, Spring Boot e MySQL.
</p>
