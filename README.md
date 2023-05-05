**SOBRE O QUE É O PROJETO?**
========================================================================
O objetivo do projeto é servir de base para o treinamento de "Formação Java/Angular para Jovens Profissionais", da Indra, unidade de João Pessoa, 
ministrado por Deynne de Andrade Silva(dandrades@minsait.com) e Augusto Henrique Oliveira dos Anjos (ahenriqueo@minsait.com)


**Conteúdo do Treinamento**

- Git
- Lombok 
- Criando um projeto Spring 
- Maven 
- Spring Boot 
- Api (Rest)
- Swagger 
- JPA (Hibernate) 
- Spring Data 
- MySQL

**REQUISITOS**
========================================================================
- git
    - download: https://git-scm.com/downloads

- java 11 
    - download: https://jdk.java.net/archive/

- IDE para desenvolvimento em java (recomendados Eclipse 2023-03 ou Spring Tools Suite)
    - eclipse: https://www.eclipse.org/downloads/
    - sts: https://spring.io/tools

- maven (recomendado: v3.8.8)
    - download: https://dlcdn.apache.org/maven/maven-3/3.8.8/binaries/

- lombok
    - download: https://projectlombok.org/download

- mysql (opcional)
    - download: https://dev.mysql.com/downloads/

**COMO CONSTRUIR O AMBIENTE**
========================================================================

* Instalar git
    - Seguir o processo de instação. 
    - No fim do processo é possível executar no terminal o comando git --version para verificar se a instação
      ocorreu corretamente.

* Instalar java
    - extrair os arquivos no diretório desejado (Recomendo a raiz do disco C:\ no windows ou /opt/ no linux)
    - Adicionar variável JAVA_HOME com a raiz do java (ex: JAVA_HOME=C:\openjdk-11)
    - Adicionar o caminho da pasta bin do java à variavel ambiente PATH (ex: PATH =$JAVA_HOME\bin;$PATH)

* Instalar maven
    - instalação depende do java
    - extrair arquivo em diretório desejado (Recomendo a raiz do disco C:\ no windows ou /opt/ no linux).
    - Adicionar a variável de ambiente M3_HOME com a raiz do maven (ex: M3_HOME=C:\apache-maven-3.8.8)
    - Adicionar o caminho da pasta bin do maven à variavel ambiente PATH (ex: PATH =$M3_HOME\bin;$PATH)
    - Testar em terminal com o comando mvn -v

* Instalar IDE
  - Seguir processo de instalação
  - no eclipse selecionar a opção Eclipse IDE for Java Developers

* Instalar Lombok
    - instalação depende do java
    - Baixar o Lombok 
    - Acessar o diretório onde o lombok.jar foi baixado e executar no terminal: java -jar lombok.jar.
    - Na janela de instalação, especificar o caminho onde se encontra sua IDE e concluir a instalação.
    - Caso não consiga instalar através da interface, copiar o lombok.jar para o diretório do eclipse e editar o 
      arquivo eclipse.ini e incluir a linha abaixo no final do arquivo:

* Configurar projeto
    - clonar projeto do repositório (git clone https://github.com/Deynne/treinamento-23-05.git)
    - no diretório do projeto executar o comando __mvn -U clean install__
    - importar projeto na ide como um projeto maven

* Executar projeto
    - executar o comando __java -jar treinamento-controller/target/treinamento.war__
    **É de suma importância aguardar a execução dos comandos acima citados.**


**Para acesso à sua API desenvolvida, utilize o endereço: http://localhost:8080/treinamento**


Banco de dados
==========================================================================
Um banco de dados foi disponibilizado para uso durante o treinamento. Ele é um banco mysql e pode ser acessado através da seguinte url: http://31.220.109.68/phpmyadmin/
    
JDBC URL: jdbc:mysql://31.220.109.68:3306/treinamentoindra
Usuário: treinamentoindra
Senha: treinamentoindra
