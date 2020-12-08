# Spring Boot com RabbitMQ - Consumer
>Integração de dados

Projeto voltado para integração de dados utilizando o RabbitMQ como gerenciador da fila. 

## Instalação
- [JDK 11: Necessário para executar o projeto Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven 3.6.3: Necessário para realizar o build do projeto Java](https://maven.apache.org/docs/3.6.3/release-notes.html)
- [Spring Tools 4 for Eclipse: Para desenvolvimento do projeto](https://spring.io/tools)
- [Docker: Necessário para gerar e rodar a imagem dos projetos (Opcional)](https://docs.docker.com/get-docker/)
- [RabbitMQ: Deve ser gerado pelo docker](https://www.rabbitmq.com/)
- [MongoDB: Deve ser gerado pelo docker](https://www.mongodb.com/)

### Comando para executar no Docker antes de rodar o projeto

*Instalação do RabbitMQ*

Obs: Só deve rodar esse comando caso não tenha executado no projeto producer 
```d
  docker run -d -p 15672:15672 -p 5672:5672 --name rabbitmq rabbitmq:3-management
```
*Instalação do MongoDB*
```d
  docker pull mongo
  docker images
  docker run --name mongo_local -p 27017:27017 -d mongo
  docker ps
```

## Documentação

Basta acessar a url: http://localhost:8082/swagger-ui.html#/ na máquina que esteja executando o projeto e terá a documentação da api pelo Swagger.

![spring-rabbitmq-consumer](https://user-images.githubusercontent.com/23174611/101516675-8706a200-395e-11eb-9ee2-8325f5c97405.png)

## Meta

Rogério Silva - rogerioSilva60@gmail.com

[https://github.com/rogerioSilva60/spring-rabbitmq-producer](https://github.com/rogerioSilva60)
