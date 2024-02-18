package app.post;

public class PostEntity {//crea clase entidad

    private final long id;
    private final String content;

    public PostEntity(long id, String content) { //constructor indica como se construye?
        this.id = id;
        this.content = content;
    }

    public long getId() { //metodo getter
        return id;
    }

    public String getContent() { //metodo getter
        return content;
    }
}

// Este es un ejemplo de una clase de modelo en Java, específicamente una clase de entidad que podría ser utilizada para representar una publicación (post) en una aplicación de blog o similar.

// Aquí está lo que hace cada parte:

// - `private final long id;` y `private final String content;`: Estas son las variables de instancia para la clase `PostEntity`. Cada `PostEntity` tiene un `id` y un `content`. La palabra clave `final` significa que una vez que se asigna un valor a estas variables, no puede ser cambiado.

// - `public PostEntity(long id, String content)`: Este es el constructor de la clase. Cuando se crea una nueva instancia de `PostEntity`, se debe proporcionar un `id` y un `content`.

// - `this.id = id;` y `this.content = content;`: Estas líneas en el constructor asignan los valores proporcionados a las variables de instancia de la clase.

// - `public long getId()`: Este es un método getter para la variable `id`. Devuelve el valor de `id`.

// - `public String getContent()`: Este es un método getter para la variable `content`. Devuelve el valor de `content`.

// En resumen, esta clase define una entidad de publicación con un identificador único y contenido.