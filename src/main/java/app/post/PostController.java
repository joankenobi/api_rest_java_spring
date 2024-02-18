package app.post;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    private static final String template = "hello, %s!";

    private final AtomicLong counter=new AtomicLong();

    @RequestMapping("/post")
    public PostEntity post(@RequestParam(
            value="name", defaultValue="Post") String name) {
        return new PostEntity(counter.incrementAndGet(),
                String.format(template, name));
    }

}

// @RestController: Esta anotación indica que la clase es un controlador REST. Esto significa que puede manejar solicitudes HTTP.

// private static final String template = "hello, %s!";: Esta es una constante de cadena que se utiliza como plantilla para un mensaje. El %s es un marcador de posición que se reemplaza con un valor más adelante.

// private final AtomicLong counter=new AtomicLong();: Este es un contador que se incrementa cada vez que se llama al método post(). AtomicLong es una clase en Java que proporciona operaciones atómicas en long, es decir, operaciones que se completan en un solo paso sin la posibilidad de interrupción.

// @RequestMapping("/post"): Esta anotación mapea las solicitudes HTTP a métodos de manejo en controladores específicos. En este caso, el método post() se llama cuando se realiza una solicitud HTTP a la ruta /post.

// public PostEntity post(@RequestParam(value="name", defaultValue="Post") String name): Este es el método que se llama cuando se realiza una solicitud a /post. Toma un parámetro de la solicitud HTTP, name, que tiene un valor predeterminado de "Post" si no se proporciona.

// return new PostEntity(counter.incrementAndGet(), String.format(template, name));: Este es el cuerpo del método post(). Crea una nueva instancia de PostEntity, incrementa el contador y formatea el mensaje utilizando la plantilla y el nombre proporcionado. Luego devuelve esta nueva entidad.