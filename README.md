<h1 align="center">Serviço Backend Altime</h1>

Esta API foi desenvolvida como parte do projeto **Altime**, uma solução voltada à gestão de horários e produtividade para ambientes acadêmicos ou corporativos. Seu propósito é fornecer suporte completo ao funcionamento do sistema, oferecendo endpoints para usuários, sessões, dados de agenda e afins.

> Aplicação desenvolvida por alunos do 3º semestre do tecnólogo em Banco de Dados, na FATEC Profº Jessen Vidal - São José dos Campos, SP.

### :hammer_and_wrench: Tecnologias

As seguintes tecnologias e ferramentas foram utilizadas neste projeto:


<div align="center">

![Java](https://img.shields.io/badge/Java-orange?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Swagger](https://img.shields.io/badge/Swagger-85EA2D?style=for-the-badge&logo=swagger&logoColor=black)
![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)
![Jira](https://img.shields.io/badge/Jira-0052CC?style=for-the-badge&logo=jira&logoColor=white)

</div>

### :gear: Como utilizar

Siga os passos abaixo para executar o projeto localmente:

```bash
# Clone este repositório
$ git clone https://github.com/DenariusData/DenariusData-Back.git

# Execute a aplicação (usando Maven ou sua IDE)
$ ./mvnw spring-boot:run
```

O servidor será iniciado localmente na porta configurada no arquivo `.env` ou `application.properties`. Utilize ferramentas como Swagger ou Postman para realizar requisições à API.

## :railway_track: Rotas disponíveis

> A documentação das rotas está disponível via Swagger no endpoint `/swagger-ui.html`, após o servidor ser iniciado.

### Explicação da estrutura das pastas

<div align="center">

| Pasta / Arquivo                                   | Definição                                                                          |
| ------------------------------------------------- | ---------------------------------------------------------------------------------- |
| :open\_file\_folder: src/main/java/               | Código fonte principal do backend                                                  |
| :open\_file\_folder: src/main/java/.../config     | Configurações globais da aplicação (segurança, CORS, Swagger...)                   |
| :open\_file\_folder: src/main/java/.../controller | Controladores responsáveis por mapear e tratar as requisições                      |
| :open\_file\_folder: src/main/java/.../model      | Entidades e modelos que representam as tabelas do banco de dados                   |
| :open\_file\_folder: src/main/java/.../repository | Interfaces para manipulação dos dados com Spring Data JPA                          |
| :open\_file\_folder: src/main/java/.../service    | Serviços responsáveis pela lógica de negócio                                       |
| :open\_file\_folder: src/main/resources/          | Arquivos de configuração como `application.properties`, `schema.sql`, entre outros |
| :page\_facing\_up: pom.xml                        | Arquivo de configuração do Maven, com as dependências e plugins utilizados         |
| :page\_facing\_up: docker-compose.yml             | Arquivo para iniciar o ambiente de banco de dados via Docker                       |

</div>
