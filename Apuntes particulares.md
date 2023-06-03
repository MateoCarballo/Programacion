# Patron singleton:

El patrón Singleton es un patrón de diseño de software que 
garantiza que una clase tenga una única instancia y proporciona un punto global de acceso a esa instancia.

En términos más simples, el patrón Singleton se utiliza cuando quieres asegurarte de que solo haya una instancia 
de una clase en todo el programa. Imagina que tienes una clase que representa una configuración de la aplicación 
y quieres asegurarte de que solo haya una instancia de esa configuración en todo el sistema.

El patrón Singleton te permite crear una clase de configuración y asegurarte de que solo haya una instancia de ella. 
Esto se logra definiendo un constructor privado en la clase, lo que impide que otras clases puedan crear nuevas instancias directamente. 
En su lugar, la clase Singleton proporciona un método estático que devuelve la única instancia existente, creándola si aún no existe.

De esta manera, cuando necesites acceder a la instancia de la clase Singleton desde cualquier parte del programa, 
simplemente llamas a ese método estático y obtienes la misma instancia en todos los casos. Esto garantiza que todos los componentes 
del sistema compartan y utilicen la misma instancia única de la clase, lo que puede ser útil en situaciones donde necesitas 
controlar la creación y el acceso a una única instancia de una clase en todo el programa.

Ejemplo, absurdo pero funcional para entender este patron.

## CLASE PERSONA
    public class Persona {
    private static Persona instancia;

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String correo;

    private Persona(String nombre, String apellido1, String apellido2, String correo) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.correo = correo;
    }

    public static Persona getInstancia(String nombre, String apellido1, String apellido2, String correo) {
        if (instancia == null) {
            instancia = new Persona(nombre, apellido1, apellido2, correo);
        }
        return instancia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getCorreo() {
        return correo;
    }


    }

## CLASE MAIN

    public static void main(String[] args) {
        Persona miPersona = Persona.getInstancia("Juan", "Pérez", "Gómez", "juan@example.com");

        System.out.println(miPersona.getNombre());
        System.out.println(miPersona.getApellido1());
        System.out.println(miPersona.getApellido2());
        System.out.println(miPersona.getCorreo());
    }

