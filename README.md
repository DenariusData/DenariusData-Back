<h1 align="center">Serviço Backend Altime</h1>

Seja bem-vindo ao Backend do projeto **Altime**, uma solução voltada à gestão de horários e produtividade para ambientes acadêmicos ou corporativos. Seu propósito é fornecer suporte completo ao funcionamento do sistema, oferecendo endpoints para usuários, sessões, dados de agenda e afins.

> Aplicação desenvolvida por alunos do 3º semestre do tecnólogo em Banco de Dados, na FATEC Profº Jessen Vidal - São José dos Campos, SP.

<span id="tecnologias">

## 🛠️ Tecnologias

As seguintes ferramentas, linguagens, bibliotecas e tecnologias foram usadas na construção do projeto:

![Figma](https://img.shields.io/badge/Figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white)
![Java](https://img.shields.io/badge/Java-orange?style=for-the-badge&logo=openjdk&logoColor=white)
![Nuxt.js](https://img.shields.io/badge/Nuxt.js-00DC82?style=for-the-badge&logo=nuxtdotjs&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
<br>
![VS_Code](https://img.shields.io/badge/VS_Code-CED4DA?style=for-the-badge&logo=visual-studio-code&logoColor=0078D4)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)
![Jira](https://img.shields.io/badge/Jira-0052CC?style=for-the-badge&logo=jira&logoColor=white)
![Google_Docs](https://img.shields.io/badge/Google%20Docs-CED4DA?style=for-the-badge&logo=google-docs&logoColor=0D96F6)
![Swagger](https://img.shields.io/badge/Swagger-85EA2D?style=for-the-badge&logo=swagger&logoColor=black)

</span>

## :railway_track: Rotas disponíveis

> A documentação das rotas está disponível via Swagger no endpoint `/swagger-ui.html`, após o servidor ser iniciado.

## :file_folder: Explicação da estrutura das pastas

<div align="center">

| Pasta / Arquivo                                   | Definição                                                                          |
| ------------------------------------------------- | ---------------------------------------------------------------------------------- |
| :open_file_folder: src/main/java/                 | Código fonte principal do backend                                                  |
| :open_file_folder: src/main/java/.../config       | Configurações globais da aplicação (segurança, CORS, Swagger...)                   |
| :open_file_folder: src/main/java/.../controller   | Controladores responsáveis por mapear e tratar as requisições                      |
| :open_file_folder: src/main/java/.../model        | Entidades e modelos que representam as tabelas do banco de dados                   |
| :open_file_folder: src/main/java/.../repository   | Interfaces para manipulação dos dados com Spring Data JPA                          |
| :open_file_folder: src/main/java/.../service      | Serviços responsáveis pela lógica de negócio                                       |
| :open_file_folder: src/main/resources/            | Arquivos de configuração como `application.properties`, `schema.sql`, entre outros |
| :page_facing_up: pom.xml                          | Arquivo de configuração do Maven, com as dependências e plugins utilizados         |
| :page_facing_up: docker-compose.yml               | Arquivo para iniciar o ambiente de banco de dados via Docker                       |

</div>
