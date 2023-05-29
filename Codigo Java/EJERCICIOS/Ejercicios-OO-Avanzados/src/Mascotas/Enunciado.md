# MASCOTAS

Crea una clase llamada Inventario que almacene referencias a todos los animales existentes en una tienda de mascotas. La clase debe cumplir con los siguientes requisitos:

- Debe existir un ArrayList privado dentro de la clase Inventario para almacenar los animales.
- La tienda de mascotas tendrá cuatro tipos de animales: perros, gatos, loros y canarios.
- La clase Inventario debe permitir realizar las siguientes acciones:
    - Mostrar la lista de animales (tipo y nombre, 1 línea por animal).
    - Mostrar todos los datos de un animal concreto.
    - Mostrar todos los datos de todos los animales.
    - Insertar animales en el inventario.
    - Eliminar animales del inventario.
    - Vaciar el inventario.
- Crea las clases necesarias para la clase Inventario.

Además, hay algunas modificaciones a realizar:

- Utilizar la clase no abstracta Animal en lugar de Mascotas sin sobreescribirla.
- Crear una interfaz para declarar el atributo para la gestión de entrada de datos por teclado.
- Agregar un ArrayList de Historial en la clase Perro para gestionar sus revisiones y vacunas. Crea la clase correspondiente para ello.
- Agregar validaciones para dar de alta los animales. Los métodos de validación pueden utilizarse desde los setters o el constructor correspondiente.
- Incluir gestión de excepciones en las operaciones de gestión de animales.
