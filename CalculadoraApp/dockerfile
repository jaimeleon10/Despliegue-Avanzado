# Etapa de compilación, un docker especifico, que se etiqueta como build
FROM gradle:jdk21 AS build

# Directorio de trabajo
WORKDIR /app

COPY . /app

# Compila y construye el proyecto, podemos evitar los test evitando con -x test
RUN ./gradlew build
RUN ./gradlew javadoc

# Etapa de ejecución, un docker especifico, que se etiqueta como run
# Con una imagen de java
FROM eclipse-temurin:21-jre AS run

# Directorio de trabajo
WORKDIR /app

# Copia el jar de la aplicación, ojo que esta en la etapa de compilación, etiquetado como build
# Cuidado con la ruta definida cuando has copiado las cosas en la etapa de compilación
# Para copiar un archivo de una etapa a otra, se usa la instrucción COPY --from=etapaOrigen
COPY --from=build /app/build/libs/*.jar /app/my-app.jar
COPY --from=build /app/build/docs/javadoc/ /app/files/documentation
COPY --from=build /app/build/reports/jacoco/test/html/ /app/files/coverage
COPY --from=build /app/build/reports/tests/test/ /app/files/tests

# Expone el puerto 8080, pero en esta imagen no es necesario
# EXPOSE 8080
# Ejecuta el jar
ENTRYPOINT ["java","-jar","/app/my-app.jar"]