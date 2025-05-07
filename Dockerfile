# Usar una imagen base con Java 21
FROM openjdk:21-jdk-slim

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo .jar de la carpeta target al contenedor
COPY target/productos-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto 8080
EXPOSE 8080

# Ejecutar la aplicación con Java
ENTRYPOINT ["java", "-jar", "app.jar"]
