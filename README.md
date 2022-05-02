# Fazer o download da imagem do Nginx
`docker pull nginx`

# MS-CUSTOMER
`mvn clean install`

`mvn spring-boot:build-image`

### Caso queira correr apenas a imagem do serviço, utilizar os comando abaixo, se for correr tudo no docker-compose podes ignorar.
`docker run -d --name ms-customer -p 8081:8081 ms-customer:0.0.1-SNAPSHOT`

`curl.exe -X GET http://localhost:8081/product`

# MS-PARTNER
`mvn clean install`

`mvn spring-boot:build-image`

### Caso queira correr apenas a imagem do serviço, utilizar os comando abaixo, se for correr tudo no docker-compose podes ignorar.
`docker run -d --name ms-partner -p 8082:8082 ms-partner:0.0.1-SNAPSHOT`

`curl.exe -X GET http://localhost:8082/product`

# Docker 
### Na pasta aonde esta o arquivo docker-compose.yml correr
`docker-compose build`

`docker-compose up -d`

# Nginx
`curl.exe -X GET http://localhost:8000/ms-customer/customer`

`curl.exe -X GET http://localhost:8000/ms-partner/partner`