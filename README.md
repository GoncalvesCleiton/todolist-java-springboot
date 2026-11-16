
# To-Do List – Gerenciador de Tarefas

Aplicação web para gerenciamento de tarefas, desenvolvida com Java e Spring Boot. O projeto permite cadastrar, consultar, atualizar e excluir tarefas, além de acompanhar seu status de conclusão.

## Tecnologias utilizadas

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- Banco de dados H2
- Maven
- HTML
- CSS
- JavaScript

## Funcionalidades

- Cadastro de tarefas.
- Listagem de tarefas.
- Atualização de tarefas.
- Exclusão de tarefas.
- Definição de prioridade (ALTA ou BAIXA).
- Marcação de tarefas como concluídas.
- Validação dos dados informados.
- Tratamento global de exceções.
- Interface web integrada à API REST.

## Estrutura do projeto

O projeto está organizado em camadas:

- **Controller:** recebe e gerencia as requisições HTTP.
- **Entity:** representa a entidade Tarefa.
- **Repository:** realiza a comunicação com o banco de dados.
- **Service:** concentra as regras de negócio.
- **Exception:** contém o tratamento de exceções.

## Como executar o projeto

1. Clone este repositório:

   `git clone https://github.com/GoncalvesCleiton/todolist-java-springboot.git`

2. Entre na pasta do projeto:

   `cd todolist-java-springboot`

3. Execute a aplicação pelo terminal:

   `.\mvnw.cmd spring-boot:run`

4. Acesse a interface web pelo navegador:

   `http://localhost:8080`

## Objetivo do projeto

Este projeto foi desenvolvido com o objetivo de praticar e consolidar conhecimentos em desenvolvimento Backend com Java e Spring Boot, trabalhando com APIs REST, operações CRUD, persistência de dados, validações e integração com uma interface web.

---

**Desenvolvido por Cleiton Gonçalves**

[GitHub](https://github.com/GoncalvesCleiton)
