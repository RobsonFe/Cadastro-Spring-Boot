# Cadastro API com Spring Boot

Este é um projeto de exemplo que demonstra como criar uma API Spring Boot simples para geração de cadastros. A API permite a criação de registros de cadastro com informações de nome, idade e ocupação. Cada registro de cadastro gerado é associado a um ID único. Futuramente pretendo desenvolver um projeto completo fazendo entregação com front e banco de dados. 


## Pré-requisitos

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) - Certifique-se de que você tenha o JDK instalado em sua máquina.
- [Maven](https://maven.apache.org/download.cgi) - Certifique-se de que você tenha o Maven instalado em sua máquina.

## Como Executar

Siga as etapas abaixo para executar a aplicação:

1. Clone este repositório para a sua máquina local:

   ```bash
   git clone https://github.com/RobsonFe/Cadastro-Spring-Boot.git
   ```

2. Navegue até o diretório do projeto:

   ```bash
   cd Cadastro-Spring-Boot
   ```

3. Compile o projeto usando o Maven:

   ```bash
   mvn clean package
   ```

4. Execute a aplicação Spring Boot:

   ```bash
   java -jar target/Cadastro-Spring-Boot-1.0.jar
   ```

A aplicação será iniciada e estará disponível em [http://localhost:8080](http://localhost:8080).

## Uso da API

A API possui os seguintes endpoints:

- `POST /cadastro`: Crie um novo registro de cadastro fornecendo um JSON com os campos `name`, `age` e `job`. Um ID único será gerado automaticamente para o registro.

  Exemplo de JSON para criação de cadastro:
  ```json
  {
    "name": "Robson",
    "age": 29,
    "job": "Desenvolvedor"
  }
  ```

- `GET /cadastro/{id}`: Recupere um registro de cadastro específico pelo ID.

- `GET /cadastros`: Recupere todos os registros de cadastro existentes.

- `PUT /cadastro/{id}`: Atualize um registro de cadastro específico pelo ID, fornecendo um JSON com os campos a serem atualizados.

  Exemplo de JSON para atualização de cadastro:
  ```json
  {
    "name": "Novo Nome",
    "age": 30,
    "job": "Gerente"
  }
  ```

- `DELETE /cadastro/{id}`: Exclua um registro de cadastro específico pelo ID.

## Estrutura do Projeto

- `Cadastro.java`: Uma classe de modelo que representa um registro de cadastro com campos `id`, `name`, `age` e `job`.
- `CadastroController.java`: Um controlador Spring que define os endpoints da API para criação, leitura, atualização e exclusão de registros de cadastro.
- `CadastroRepository.java`: Uma interface que define métodos para acessar e gerenciar registros de cadastro em um banco de dados (não incluído neste projeto).

## Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).
