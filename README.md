# Livraria — Listagem de livros

Primeiro exercício de Spring MVC: exibir uma lista de livros em uma página Thymeleaf.

Projeto de estudo desenvolvido durante o curso de **Análise e Desenvolvimento de Sistemas** (SENAI-SP Vila Leopoldina), na disciplina de desenvolvimento web com Spring Boot.

## Stack

- Java 21
- Spring Boot (Spring Web + Thymeleaf)
- Bean Validation (Jakarta)
- Lombok
- Maven

Os dados ficam **em memória** (uma `List` dentro do repositório). Não há banco de dados — ao reiniciar a aplicação, os registros são perdidos.

## Como rodar

```bash
./mvnw spring-boot:run
```

Ou abra o projeto no IntelliJ e execute a classe `LivrariaApplication`.

Depois acesse: **http://localhost:8080/livro**

## Rotas

| Método | Rota | O que faz |
|---|---|---|
| GET | `/livro` | Lista todos os livros cadastrados |

## Estrutura

```
src/main/java/org/example/livraria/
├── models/Livro.java
├── service/LivroService.java
└── controllers/LivrosController.java
src/main/resources/templates/
└── livro.html
```

## O que esse projeto exercita

- `@Controller` e `@GetMapping`
- Passagem de dados para a view com `Model` + `addAttribute`
- Iteração de listas no Thymeleaf com `th:each`
- Separação em camadas (model / service / controller)
- Lombok (`@Getter`, `@Setter`)
