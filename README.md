# e-commerce Microservice - Apache Kafka e Spring Boot

Como desenvolver um e-commerce utilizando a arquitetura de microserviços

## Objetivos
Desenvolver uma solução de e-commerce com a arquitetura de microsserviços e aplicar a integração entre eles orientada a eventos com Apache Kafka e garantir a compatibilidade entre da comunicação dos microsserviços com Schema Registry. Para isso, programaremos em Java utilizando a stack do Spring (Spring Boot, Spring Cloud Streams).
## Tecnologias utilizadas
 + Java 11
 + Spring Boot 2.4.5
 + Kafka
 + Avro
 + PostgreSQL
 + Github
## Como testar
Para testar essa API é preciso executar o `docker/docker-compose-sample.yml`, após passar as variáveis entre <>
Com os serviços sendo executados, executar esta API numa IDE e fazer os requests com Postman ou similar.
## Endpoints & Payloads
### Endpoints
#### Cadastrar checkout
**Ação** | **Endpoint** | **Método**
---------- | ------------ | ----------
Cadastrar checkout | _api/v1/checkout_ | POST
