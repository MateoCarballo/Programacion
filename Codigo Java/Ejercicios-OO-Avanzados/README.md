# Ejercicios-OO-Avanzados



## Tareas OO Avanzada

Ampliar el código sumistrado sobre Fútbol-selección, para ilustrar el uso de herencia, clases abstractas e interfaces. Puntos a contemplar en la ampliación:
Hacer un recorrido por el ArrayList genérico de integrantes (uso de diferentes métodos - for, foreach, iterator)
uso de la partícula instanceof para localizar el tipo de subclase que se está tratando y que lo indique en un mensaje por pantalla.

### Ejercicio 01.

Realizar un proyecto en java AUTORES-LIBROS , utilizando el paso por valor del array contenedor  CAutores, que partiendo de:
dos clases con una relación de agregación, donde:

· La clase contenedor es CAutores 
y la continente es Clibros realice los métodos que se incluyen dentro del menú.. 

        CAutores:

        atributos:

        String dni.

        String NombreAutor.

        String  ciudadAutor.

        ArrayList<CLibros> libro

        CLibros:

        atributos:

        String isbn.

        String títuloLibro.

        float precioLibro.

       MENÚ
        1_Altas de autores con sus libros, utilizando una colección dinámica ArrayList<CAutores>, 
        tendremos que validar el dni que tenga una longitud de 9 caracteres y el último sea una letra de la A_Z.

        2_Modificaciones ,introduciendo el isbn de un libro primero  visualice todos sus datos , pida conformidad y luego cambie su precio.

        3_Bajas,introduciendo el nombre de un libro lo visualice y luego lo elimine del array de libros  dentro de autores.

        4_Consultas,introduciendo el nombre de un autor, visualice todos sus libros.

        5_Fin.
        
        
### Ejercicio 02.        

ASTROS

Define una jerarquía de clases que permita almacenar datos sobre los planetas y satélites (lunas)

que forman parte del sistema solar.

        Algunos atributos que necesitaremos almacenar son:

        • Masa del cuerpo.

        • Diámetro medio.

        • Período de rotación sobre su propio eje.

        • Período de traslación alrededor del cuerpo que orbitan.

        • Distancia media a ese cuerpo.

        • etc.

Define las clases necesarias conteniendo:

        • Constructores.

        • Métodos para recuperar y almacenas atributos.

        • Método para mostrar la información del objeto.

Define un método, que dado un objeto del sistema solar (planeta o satélite), imprima toda la información que se dispone sobre el mismo (además de su lista de satélites si los tuviera).

El diagrama UML sería:


Una posible solución sería crear una lista de objetos, insertar los planetas y satélites (directamente mediante código o solicitándolos por pantalla) y luego mostrar un pequeño menú que permita al usuario imprimir la información del astro que elija.

MASCOTAS

Implementa una clase llamada Inventario que utilizaremos para almacenar referencias a todos los animales existentes en una tienda de mascotas.

Esta clase debe cumplir con los siguientes requisitos:

        • En la tienda existirán 4 tipos de animales: perros, gatos, loros y canarios.

        • Los animales deben almacenarse en un ArrayList privado dentro de la clase Inventario.

        • La clase debe permitir realizar las siguientes acciones:

        ◦ Mostrar la lista de animales (solo tipo y nombre, 1 línea por animal).

        ◦ Mostrar todos los datos de un animal concreto.

        ◦ Mostrar todos los datos de todos los animales.

        ◦ Insertar animales en el inventario.

        ◦ Eliminar animales del inventario.

        ◦ Vaciar el inventario.

Implementa las demás clases necesarias para la clase Inventario.

El diagrama UML sería:


Realiza un programa en JAVA en el que le pidas al usuario las notas de las asignaturas del Ciclo de DAW y calcule la nota media del

    Nota 1: Cada una de las asignaturas serán un objeto que se encuentran en un array de 6 posiciones, y cuyos atributos serán el nombre y la nota.
    Nota 2: Con el constructor podrás asignar directamente el nombre dela asignatura al crear el objeto. En cambio, el atributo nota, será el usuario quien lo              introduzca mediante un método al que se le pase la nota como argumento.
    Nota 3: Crea otro método que reciba el array con las 6 notas y devuelva la nota media (return)

Ejemplo de ejecución:
Por favor, introduzca la nota de Programación: 6,5
Introduzca la nota de Lenguajes de Marcas: 7,5
Introduzca la nota de Bases de Datos: 7,5
Introduzca la nota de Entornos de Desarrollo: 8
Introduzca la nota de Sistemas Informáticos: 6,5
Por último, introduzca la nota de Formación y Orientación Laboral: 6
Su nota media del curso es de: 7

Realiza un programa en JAVA en el que se creen los objetos que desee el usuario. Cada objeto los meterá en un array y contiene como atributos el nombre de un producto de una tienda de deportes, su precio y su
• Nota 1: Modifica el constructor por defecto de tal forma que llame a 3 métodos: 

        uno le pedirá al usuario el nombre de cada producto, 
        otro método su precio 
        y otro su stock.

• Nota 2: Realiza un método en el que le muestre al usuario un menú para que elija que producto comprar y luego le pregunte cuantas unidades desea de él. Luego se le preguntará si desea comprar otro producto o salir. Por
último se le mostrará el importe total de la compra.
• Nota 3: Realiza otro método para actualizar el valor del stock de un producto cuando el usuario lo compre. En caso de que el usuario pida más unidades de las que quedan se le avisará por pantalla del error, se le comunicarán las unidades restantes y le preguntará si desea comprar otro

        Pista 1: Necesitarás otros 3 métodos para devolver el nombre de cada producto, otro para devolver su precio y otro para devolver su stock.
        Pista 2: Ejemplo de ejecución:

        -- Bienvenido a mi Tienda de Deportes –
        Acceso al menú de Administración:
        ¿Cuántos productos desea dar de alta?
        - PRODUCTO 1 -

        Introduzca el nombre del producto: Raquetas

        Introduzca el precio del producto: 80

        Introduzca el stock del producto: 10

        PRODUCTO 1 ALMACENADO CON ÉXITO –

        Introduzca el nombre del producto: Canastas

        Introduzca el precio del producto: 140

        Introduzca el stock del producto: 3

        - PRODUCTO 2 ALMACENADO CON ÉXITO -

        Acceso al menú de Ventas:

        2

        - PRODUCTO 2 -

        Pulse 1 para comprar Raquetas cuyo precio es de 80 euros y el stock es de 10 unidades.

        Pulse 2 para comprar Canastas cuyo precio es de 140 euros y el stock es de 3 unidades.

        Ha elegido comprar Raquetas

        ¿Cuántas unidades desea?

        Venta Realizada con éxito

        ¿Desea comprar otro producto?

        Pulse 1 para comprar Raquetas cuyo precio es de 80 euros y el stock es de 2 unidades.

        Pulse 2 para comprar Canastas cuyo precio es de 140 euros y el stock es de 3 unidades.

        Ha elegido comprar Canastas

        ¿Cuántas unidades desea?

        Lo sentimos, solo tenemos disponibles 3 unidades

        ¿Desea comprar otro producto?

        Pulse 1 para comprar Raquetas cuyo precio es de 80 euros y el stock es de 2 unidades.

        Pulse 2 para comprar Canastas cuyo precio es de 140 euros y el stock es de 3 unidades.

        Ha elegido comprar Canastas

        ¿Cuántas unidades desea?

        Venta Realizada con éxito

        ¿Desea comprar otro producto?

        El total de su compra asciende a 1060 Euros

        Muchas gracias. Vuelva cuando quiera.

        1

        8

        si

        2

        5

        si

        2

        3

        no
