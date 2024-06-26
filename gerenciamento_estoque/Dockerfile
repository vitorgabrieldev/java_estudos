# Use a imagem base do OpenJDK 17
FROM openjdk:22-jdk-slim

# Defina o diretório de trabalho no contêiner
WORKDIR /app

# Copie o arquivo JAR da aplicação para o diretório de trabalho no contêiner
COPY target/myapp.jar /app/myapp.jar

# Comando para executar a aplicação Java
CMD ["java", "-jar", "/app/myapp.jar"]
