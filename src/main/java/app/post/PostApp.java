package app.post;

// importa los elementos de spring

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // indica el inicio de la app?
public class PostApp {
    public static void main(String[] arg) {
        SpringApplication.run(
                PostApp.class, arg
        );
    }
}
// Este es un código básico de una aplicación Spring Boot en Java. Aquí está lo que hace cada parte:
//
//- `package app.post;`: Define el paquete en el que se encuentra esta clase.
//
//- `import org.springframework.boot.SpringApplication;` y `import org.springframework.boot.autoconfigure.SpringBootApplication;`: Estas líneas importan las clases necesarias de Spring Boot.
//
//- `@SpringBootApplication`: Esta anotación indica que esta es una aplicación Spring Boot. Habilita la autoconfiguración y el escaneo de componentes, entre otras cosas.
//
//- `public class PostApp { ... }`: Esta es la definición de la clase principal de la aplicación.
//
//- `public static void main(String[] arg) { ... }`: Este es el método principal que se ejecuta cuando se inicia la aplicación.
//
//- `SpringApplication.run(PostApp.class, arg);`: Esta línea inicia la aplicación Spring Boot. `PostApp.class` es la clase principal de la aplicación y `arg` son los argumentos de la línea de comandos.
//
//En resumen, este código define una aplicación Spring Boot y proporciona el método para iniciarla.