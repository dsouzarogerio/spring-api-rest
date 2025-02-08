# API REST com Spring Boot

## Introdução do Projeto

Este projeto é uma API REST desenvolvida em Java utilizando o framework Spring Boot. O objetivo é fornecer um conjunto de endpoints para manipulação de recursos, seguindo as melhores práticas de desenvolvimento RESTful.

## Tecnologias Utilizadas

![Java](https://img.icons8.com/color/48/000000/java-coffee-cup-logo.png)
![Spring Boot](https://img.icons8.com/color/48/000000/spring-logo.png)

As principais tecnologias utilizadas neste projeto são:

- **Java 1.8** - Linguagem de programação principal.
- **Spring Boot 2.5.14** - Framework para desenvolvimento de aplicações Java.
- **Spring Web** - Módulo do Spring Boot para criação de APIs REST.
- **Spring Data JPA** - Abstração para persistência de dados.
- **Spring Security** - Segurança e autenticação da API.
- **Spring Boot Actuator** - Monitoramento da aplicação.
- **H2 Database** - Banco de dados em memória para desenvolvimento e testes.
- **Springfox Swagger** - Documentação interativa da API.
- **JSON Web Token (JWT)** - Autenticação baseada em tokens.
- **Spring Boot Admin** - Monitoramento de aplicações Spring Boot.
- **Spring Boot DevTools** - Ferramentas auxiliares para desenvolvimento.
- **Spring Boot Cache** - Cache para otimização de desempenho.
- **Spring Boot Validation** - Validação de dados de entrada.
- **JUnit e Spring Boot Test** - Frameworks para testes.


## Dependências

| Dependência | Versão | Link |
|------------|--------|------|
| spring-boot-starter-parent | 2.5.14 | [Maven Repository](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-parent/2.5.14) |
| spring-boot-starter-web | - | [Maven Repository](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web) |
| spring-boot-devtools | - | [Maven Repository](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools) |
| spring-boot-starter-data-jpa | - | [Maven Repository](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa) |
| h2 | - | [Maven Repository](https://mvnrepository.com/artifact/com.h2database/h2) |
| spring-boot-starter-validation | - | [Maven Repository](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-validation) |
| spring-boot-starter-cache | - | [Maven Repository](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-cache) |
| spring-boot-starter-security | - | [Maven Repository](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-security) |
| spring-boot-starter-actuator | - | [Maven Repository](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-actuator) |
| spring-boot-admin-starter-client | 2.7.7 | [Maven Repository](https://mvnrepository.com/artifact/de.codecentric/spring-boot-admin-starter-client/2.7.7) |
| jjwt | 0.9.1 | [Maven Repository](https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt/0.9.1) |
| springfox-swagger2 | 2.9.2 | [Maven Repository](https://mvnrepository.com/artifact/io.springfox/springfox-swagger2/2.9.2) |
| springfox-swagger-ui | 2.9.2 | [Maven Repository](https://mvnrepository.com/artifact/io.springfox/springfox-swagger-ui/2.9.2) |
| spring-boot-starter-test | - | [Maven Repository](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test) |

## Endpoints

A API expõe os seguintes endpoints:

### Recursos Tópicos

| Método | Endpoint | Descrição |
|--------|---------|-----------|
| GET | `/topicos` | Lista todos os tópicos paginados |
| GET | `/topicos/detalhe/{nomeCurso}` | Busca tópicos por curso com paginação |
| POST | `/topicos` | Cadastra um novo tópico |
| GET | `/topicos/{id}` | Obtém os detalhes de um tópico específico |
| PUT | `/topicos/{id}` | Atualiza um tópico existente |
| DELETE | `/topicos/{id}` | Remove um tópico pelo ID |

Os endpoints estão documentados no Swagger e podem ser acessados através da URL:

```
http://localhost:8080/swagger-ui.html
```

## Estrutura do Projeto

A estrutura do projeto segue a seguinte organização:

```
src
├── 📂 controller      [Rotas para endpoints]
├── 📂 modelo           [Modelos de banco de dados]
├── 📂 service          [Regras de negócio]
├── 📂 repository     [Padrão de repositório]

```

## Sobre Mim
🌐 Rogerio de Souza: [GitHub](https://github.com/dsouzarogerio/)
