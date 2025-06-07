# Spring Boot MyBatis + PostgreSQL

Este proyecto es una aplicación de ejemplo usando Spring Boot, MyBatis y PostgreSQL, preparada para ejecutarse fácilmente con Docker Compose y variables de entorno.

## Requisitos
- Java 17+
- Maven
- Docker y Docker Compose

## Configuración de variables de entorno
Las credenciales de la base de datos se gestionan mediante variables de entorno y no deben pasarse de forma estática en los archivos de configuración.

Crea un archivo `.env` en la raíz del proyecto con el siguiente contenido (puedes cambiar los valores según tus necesidades):

```
POSTGRES_DB=
POSTGRES_USER=
POSTGRES_PASSWORD=
```

> **Importante:** Nunca subas tus credenciales reales a un repositorio público.

## Ejecución con Docker Compose
Para levantar la base de datos PostgreSQL con Docker Compose:

```bash
docker-compose up -d
```

Esto creará un contenedor con la base de datos configurada según las variables del archivo `.env`.

## Configuración de la aplicación
La aplicación Spring Boot utiliza el archivo `application.yml` para leer las variables de entorno y conectarse a la base de datos:

```
spring:
  datasource:
    url: jdbc:postgresql://${DB_HOST:localhost}:${DB_PORT:5432}/${POSTGRES_DB}
    username: ${POSTGRES_USER}
    password: ${POSTGRES_PASSWORD}
```

## Ejecución de la aplicación
Puedes ejecutar la aplicación localmente con:

```bash
./mvnw spring-boot:run
```

O compilar el JAR y ejecutarlo:

```bash
./mvnw clean package
java -jar target/springboot-mybatis-0.0.1-SNAPSHOT.jar
```

## Endpoints principales
- `/products` - Listar productos
- `/products/{id}` - Consultar producto por ID
- `/products` (POST) - Crear producto
- `/products/{id}` (DELETE) - Eliminar producto
- `/products` (PUT) - Actualizar producto

## Notas
- El esquema y datos iniciales se cargan automáticamente desde `schema.sql` y `data.sql`.
- Puedes modificar los scripts SQL según tus necesidades.

---

Desarrollado por Softrami
