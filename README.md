# Instalação e Configuração do Java (Win)

**Este guia fornece instruções passo a passo para instalar e configurar o Java no seu sistema.**

### Passo 1: Baixar o JDK
Baixe a versão mais recente do JDK **(Java Development Kit)** a partir do site oficial da Oracle:
[Oracle JDK](https://www.oracle.com/java/technologies/downloads/#jdk22-windows)

### Passo 2: Instalar o JDK
- Execute o instalador do JDK que você baixou.
- Siga as instruções do instalador e anote o diretório de instalação (por exemplo, ```C:\Program Files\Java\jdk-22```).

### Passo 3: Configurar Variáveis de Ambiente
1. Abra o menu Iniciar e digite "**[variáveis de ambiente](https://kinsta.com/pt/base-de-conhecimento/o-que-sao-variaveis-de-ambiente/)**" e selecione "**Editar as variáveis de ambiente do sistema**".
2.  Na janela "**Propriedades do Sistema**", clique em "**Variáveis de Ambiente**".
3. Na seção "**Variáveis do sistema**", clique em "**Novo**" e adicione a variável JAVA_HOME: ```Nome da variável: JAVA_HOME```
4. Valor da variável (O diretório que você salvo anteriormente): **C:\Program Files\Java\jdk-22**
5. Encontre a variável Path na seção "**Variáveis do sistema**" e clique em "**Editar**".
6. Na janela "**Editar variável de ambiente**", clique em "**Novo**" e adicione ```%JAVA_HOME%\bin```.
7. Clique em "**OK**" para fechar todas as janelas.

### Passo 4: Verificar a Instalação
- Abra um novo terminal ou prompt de comando.
- Digite os seguintes comandos para verificar se o JDK está corretamente instalado:
``` sh
java -version
javac -version
```
Você deve ver a versão do Java instalada. Se tudo estiver correto, você configurou com sucesso o Java no seu sistema!



# Uso de container Java com Docker

1. Faça o download no site oficial do docker: [Docker](https://www.docker.com/products/docker-desktop/).

2. Compile o projeto usando (Substitua pelo nome dos seus arquivos):
``` sh
  javac -d bin Arquivo1.java Arquivo2.java pasta1/pasta2/*.java
```

3. Crie o arquivo jar:
``` sh
  mkdir -p target
  jar cvfe target/myapp.jar Main -C bin .
```

4. Crie um arquivo chamado ```Dockerfile```` e copie o seguinte código dentro dele:
``` docker
# Use a imagem base do OpenJDK 22
FROM openjdk:22-jdk-slim

# Defina o diretório de trabalho no contêiner
WORKDIR /app

# Copie o arquivo JAR da aplicação para o diretório de trabalho no contêiner
COPY target/myapp.jar /app/myapp.jar

# Comando para executar a aplicação Java
CMD ["java", "-jar", "/app/myapp.jar"]

```

5. Contrua a imagem docker:
``` sh
  docker build -t my-java-app .
```

6. Execute o container docker:
``` sh
  docker run --rm -it my-java-app
```

7. Forneça a entra ao container:
``` sh
  docker run --rm -it my-java-app
```
