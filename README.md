## ProjetinhoAPI - Gerenciamento de Documentos

Este projeto é uma API REST desenvolvida com Spring Boot para gerenciar documentos associados a diferentes países. Utiliza PostgreSQL como banco de dados e fornece endpoints para consulta de documentos.

## Tecnologias Utilizadas

Java 17

Spring Boot 3.x

Spring Data JPA

PostgreSQL

Lombok

Maven

## Configuração do Projeto

Inclua as dependências no pom.xml e configure a conexão com o PostgreSQL no arquivo application.properties. Certifique-se de ajustar as credenciais do banco de dados corretamente.

## Estrutura do Projeto

O projeto contém entidades JPA para representar as tabelas do banco de dados, incluindo Pais e Documento. Repositórios JPA são utilizados para acessar os dados de maneira eficiente.

Um serviço (DocumentoService) encapsula a lógica de consulta, permitindo buscar documentos com base no país e tipo de documento. O controlador (DocumentoController) expõe endpoints REST para interagir com a API.

## Como Executar o Projeto

Certifique-se de ter o PostgreSQL instalado e rodando.

Crie um banco de dados chamado documentos_db.

Configure as credenciais no application.properties.

Execute o projeto via Maven ou diretamente na sua IDE.

Acesse o endpoint de consulta para buscar documentos.

## Melhorias Futuras

Implementação de mais endpoints para CRUD completo.

Melhor tratamento de erros e exceções.

Autenticação e autorização (JWT, OAuth).

Testes unitários e de integração.
