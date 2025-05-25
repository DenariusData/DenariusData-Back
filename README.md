
<h1 align="center">Serviço Backend Altime</h1>

Seja bem-vindo ao Backend do projeto **Altime**, uma solução voltada à gestão de horários e produtividade para ambientes acadêmicos ou corporativos. Seu propósito é fornecer suporte completo ao funcionamento do sistema, oferecendo endpoints para usuários, sessões, dados de agenda e afins.

> Aplicação desenvolvida por alunos do 3º semestre do tecnólogo em Banco de Dados, na FATEC Profº Jessen Vidal - São José dos Campos, SP.

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

> A documentação completa da API está disponível via Swagger após iniciar o servidor:  
> [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

<div align="center">


| Método | Rota                                 | Descrição                         |
|--------|-------------------------------------|----------------------------------|
| ![](https://img.shields.io/badge/GET-61b0ff?style=for-the-badge)    | /contratos                        | Listar todos os contratos        |
| ![](https://img.shields.io/badge/GET-61b0ff?style=for-the-badge)    | /contratos/{id}                  | Obter contrato por ID            |
| ![](https://img.shields.io/badge/POST-49cc91?style=for-the-badge)   | /contratos                      | Criar novo contrato              |
| ![](https://img.shields.io/badge/PUT-fca030?style=for-the-badge)    | /contratos/{id}                 | Atualizar contrato por ID        |
| ![](https://img.shields.io/badge/DELETE-fa3e3e?style=for-the-badge) | /contratos/{id}                 | Remover contrato por ID          |
| ![](https://img.shields.io/badge/GET-61b0ff?style=for-the-badge)    | /cargo                          | Listar todos os cargos           |
| ![](https://img.shields.io/badge/GET-61b0ff?style=for-the-badge)    | /cargo/{id}                    | Obter cargo por ID               |
| ![](https://img.shields.io/badge/POST-49cc91?style=for-the-badge)   | /cargo                         | Criar novo cargo                 |
| ![](https://img.shields.io/badge/PUT-fca030?style=for-the-badge)    | /cargo/{id}                    | Atualizar cargo por ID           |
| ![](https://img.shields.io/badge/DELETE-fa3e3e?style=for-the-badge) | /cargo/{id}                    | Remover cargo por ID             |
| ![](https://img.shields.io/badge/GET-61b0ff?style=for-the-badge)    | /api/registro                  | Listar todos os registros        |
| ![](https://img.shields.io/badge/GET-61b0ff?style=for-the-badge)    | /api/registro/{id}             | Obter registro por ID            |
| ![](https://img.shields.io/badge/POST-49cc91?style=for-the-badge)   | /api/registro                 | Criar novo registro              |
| ![](https://img.shields.io/badge/PUT-fca030?style=for-the-badge)    | /api/registro/{id}            | Atualizar registro por ID        |
| ![](https://img.shields.io/badge/DELETE-fa3e3e?style=for-the-badge) | /api/registro/{id}            | Remover registro por ID          |
| ![](https://img.shields.io/badge/GET-61b0ff?style=for-the-badge)    | /api/funcionarios             | Listar todos os funcionários     |
| ![](https://img.shields.io/badge/GET-61b0ff?style=for-the-badge)    | /api/funcionarios/{id}        | Obter funcionário por ID         |
| ![](https://img.shields.io/badge/POST-49cc91?style=for-the-badge)   | /api/funcionarios             | Criar novo funcionário           |
| ![](https://img.shields.io/badge/PUT-fca030?style=for-the-badge)    | /api/funcionarios/{id}        | Atualizar funcionário por ID     |
| ![](https://img.shields.io/badge/DELETE-fa3e3e?style=for-the-badge) | /api/funcionarios/{id}        | Remover funcionário por ID       |
| ![](https://img.shields.io/badge/GET-61b0ff?style=for-the-badge)    | /api/funcionarios/{id}/imagem | Obter imagem do funcionário      |
| ![](https://img.shields.io/badge/POST-49cc91?style=for-the-badge)   | /api/funcionarios/{id}/imagem | Enviar imagem para funcionário   |
| ![](https://img.shields.io/badge/GET-61b0ff?style=for-the-badge)    | /api/funcionarios/uploads/{filename} | Baixar imagem pelo nome     |
| ![](https://img.shields.io/badge/GET-61b0ff?style=for-the-badge)    | /api/funcionarios/por-empresa  | Listar funcionários por empresa  |
| ![](https://img.shields.io/badge/GET-61b0ff?style=for-the-badge)    | /api/empresa                  | Listar todas as empresas         |
| ![](https://img.shields.io/badge/GET-61b0ff?style=for-the-badge)    | /api/empresa/{cnpj}           | Obter empresa por CNPJ           |
| ![](https://img.shields.io/badge/POST-49cc91?style=for-the-badge)   | /api/empresa                  | Criar nova empresa               |
| ![](https://img.shields.io/badge/PUT-fca030?style=for-the-badge)    | /api/empresa/{cnpj}           | Atualizar empresa por CNPJ       |
| ![](https://img.shields.io/badge/DELETE-fa3e3e?style=for-the-badge) | /api/empresa/{cnpj}           | Remover empresa por CNPJ         |
| ![](https://img.shields.io/badge/GET-61b0ff?style=for-the-badge)    | /api/dashboard/horas-trabalhadas | Visualizar total de horas trabalhadas |
| ![](https://img.shields.io/badge/GET-61b0ff?style=for-the-badge)    | /api/dashboard/funcionarios   | Visualizar dados de funcionários |
| ![](https://img.shields.io/badge/GET-61b0ff?style=for-the-badge)    | /api/dashboard/funcionarios-por-empresa | Quantidade de funcionários por empresa |
| ![](https://img.shields.io/badge/GET-61b0ff?style=for-the-badge)    | /api/dashboard/empresas       | Dados consolidados de empresas   |

</div>

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
