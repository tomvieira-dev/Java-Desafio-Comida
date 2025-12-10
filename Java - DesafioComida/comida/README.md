#  Projeto Jantar em Java

Este é um projeto simples em **Java** que simula uma pessoa comendo diferentes tipos de comida e tendo seu peso alterado conforme o consumo.

O objetivo do projeto é praticar conceitos básicos de **Programação Orientada a Objetos (POO)**, como:
- Classes
- Atributos
- Métodos
- Construtores
- Encapsulamento básico

---

## 📂 Estrutura do Projeto

src/
└── desafio/
├── Comida.java
├── Pessoa.java
└── Jantar.java



### 📌 Classes

**Comida**
- Representa um alimento.
- Possui:
  - `String nome`
  - `double peso`

**Pessoa**
- Representa uma pessoa.
- Possui:
  - `String nome`
  - `double peso`
- Métodos:
  - `comer(Comida comida)` → adiciona o peso da comida ao peso da pessoa.
  - `apresentar()` → retorna uma frase com o nome e o peso atual.

**Jantar**
- Classe principal (`main`).
- Cria uma pessoa e vários objetos do tipo `Comida`, simulando um jantar.

---

## ▶️ Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/nome-do-repositorio.git



