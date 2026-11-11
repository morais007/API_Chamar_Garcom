# API Chamar Garçom

API backend desenvolvida em **Java (Spring Boot)** para o gerenciamento de mesas, comandas e chamados de atendimento em estabelecimentos gastronômicos. O sistema foi estruturado seguindo os conceitos de arquitetura limpa e separação de camadas, oferecendo suporte a multi-tenancy e controle operacional para o aplicativo dos garçons.

---

## 🚀 Tecnologias Utilizadas

* **Java 17**
* **Spring Boot**
* **Spring Data JPA / Hibernate**
* **Maven** (Gerenciamento de dependências e build)
* **Docker & Docker Compose** (Containerização do ambiente)

---

## ⚙️ Como Subir a Aplicação com 1 Comando

Para executar a aplicação junto com o banco de dados e os serviços configurados utilizando o Docker, certifique-se de ter o [Docker](https://www.docker.com/) instalado e rodando na sua máquina, execute o comando abaixo na raiz do repositório:

```bash
docker compose up --build