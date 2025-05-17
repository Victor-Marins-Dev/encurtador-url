
<h1 align="center" style="font-weight: bold;">Encurtador de URL </h1>

<div style="text-align: center;">

</div>

<p align="center">
  <b>Implementação MUITO SIMPLES</b>
</p>

<h2>💻 O que você encontrará?</h2>
 
* Java
* Spring Boot
* MongoDB 
* Docker  
* Padrão MVC
* DTOs

#### OBS:
  - Implementei por pura curiosidade; não foi feito tratamento de exceções e, tampouco, validações. Estou deixando aqui só para registrar meus estudos.

#### OBS 2:
   - Não criei um arquivo .env e deixei as variáveis de ambiente expostas de propósito, com o intuito de facilitar para quem está clonando o projeto.

<h2>💡 O que foi feito?</h2>

A API possui somente dois endpoints:
<br>

1. **GET**
    
    Recebe o link encurtado e redireciona o usuário para o link original


2. **POST**

    Recebe um link original e retorna um link encurtado.

 
<h2 id="started">🚀 Como utilizar?</h2>

###  Pré-requisitos

1. **Instalar Docker Desktop**  
   Baixe e instale o Docker Desktop de acordo com o seu sistema operacional:  

   - [Docker Desktop para Windows/Mac](https://www.docker.com/products/docker-desktop)
   - 
2. **Verifique a instalação do Docker**  
   Após a instalação, execute os seguintes comandos no terminal para garantir que o Docker está instalado corretamente:
   ```bash
   docker --version
   docker-compose --version
   ```
   Isso deve exibir as versões instaladas do Docker e Docker Compose.



### 🛠️ Como rodar a aplicação

1. **Navegue até o diretório onde você deseja clonar o projeto.**  

2. **Abra o Terminal (ou o Git Bash, se estiver no Windows).**    

3. **Clonar o repositório**  
   Clone o projeto do GitHub:
   ```bash
   git clone https://github.com/Victor-Marins-Dev/encurtador-url.git
   ```
    Se estiver usando SSH:
    ```bash
   git clone git@github.com:Victor-Marins-Dev/encurtador-url.git
   ```

4. **Ir para o diretório do projeto**  
   Navegue até a pasta do projeto clonado:
   ```bash
   cd encurtador.url
   ```
5. **Construir e rodar os contêineres**  
   No diretório do projeto, execute o comando abaixo para construir as imagens e iniciar o container com o Docker Compose:
   ```bash
   docker-compose up --build
   ```
    O `--build` garante que as imagens sejam construídas a partir do Dockerfile.
    Se as imagem já foram construída e você não quiser reconstruí-las, pode rodar apenas:
    ```bash
    docker-compose up
    ```
6. **Verificar se tudo está rodando**  
   Após o comando acima, o Docker Compose deve iniciar os containers definidos no arquivo `docker-compose.yml`. Você pode verificar se os containers estão rodando corretamente com:
    ```bash
    docker ps
    ```

7. **Acessar a documentação**  
   Feita a verificação que os containers estão rodando perfeitamente, basta abrir o navegador e acessar a URL da documentação: [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html).

8. **Utilizando a aplicação**  
    Por fim, basta fazer as requisições de acordo com a documentação.



