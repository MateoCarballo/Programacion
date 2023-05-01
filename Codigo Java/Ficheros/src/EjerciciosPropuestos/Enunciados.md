Ficheros Texto/Datos/Objetos
Ejercicios de completar implementación de los ejemplos del AulaVirtual da sección de Teoría.

Copia ficheros Flujos Bytes
Copia ficheros Flujo Caracteres (Texto)
Copia Ficheros con Buffers
Copia Ficheros Datos
Ejemplo Objetos
TEXTO

1) Crea un fichero de texto con el nombre y contenido que tu quieras.
   Ahora crea una aplicación que lea este fichero de texto carácter a carácter y muestre su contenido por pantalla  sin espacios.

   Por ejemplo, si un fichero tiene el siguiente texto “Esto es una prueba”,
   deberá mostrar “Estoesunaprueba”.

   Captura las excepciones que veas necesario.
   Variante. Convirtiendo lo que lee de fichero en mayúsculas.

//Lectura FicheroTexto con caracteres ASCII


2)  Crea una aplicación que pida la ruta de dos ficheros de texto y de una ruta de destino (solo la ruta, sin fichero al final).
    Debes copiar el contenido de los dos ficheros en uno,
    este tendrá el nombre de los dos ficheros separados por un guion bajo,
    este se guardara en la ruta donde le hayamos indicado por teclado.

    Para unir los ficheros en uno, crea un método donde le pases como parámetro todas las rutas. 
En este método, aparte de copiar debe comprobar que si existe el fichero de destino, nos muestre un mensaje informándonos de si queremos sobrescribir el fichero.
Te recomiendo usar la clase File y JOptionPane.
Por ejemplo,
si tengo un fichero A.txt con “ABC” como contenido,
un fichero B.txt con “DEF” y una ruta de destino D:\,
el resultado sera un fichero llamado A_B.txt en la ruta D:\ o la actual con el contenido “ABCDEF”.

//BINARIOS

/*BYTES
3)Crea una aplicación que copie un fichero binario a otra localización.
En lugar de leer y escribir byte a byte, crea un array de bytes con el tamaño del fichero de origen (utiliza el método available()),
copia el contenido del fichero a este array y escribe a partir de este array.

    Recuerda que debes controlar las excepciones que puedan aparecer.
    En caso de error, mostrar una ventana de dialogo con información del error.
    */

/*DATOS

    4)Crea una aplicación que almacene los datos básicos de un vehículo como: 
    la matricula(String), marca (String), tamaño de deposito (double) y modelo (String) 
    en ese orden y de uno en uno usando la clase DataInputStream.

    Los datos anteriores datos se pedirán por teclado y se irán añadiendo al fichero (no se sobrescriben los datos) cada vez que ejecutemos la aplicación.

    El fichero siempre sera el mismo, en todos los casos.

    Muestra todos los datos de cada coche en un cuadro de dialogo, es decir, si tenemos 3 vehículos mostrara 3 cuadros de dialogo con sus respectivos datos. 
    
    Un ejemplo de salida de información puede ser este:
    
    El vehiculo tiene una matrícula 6691PJ, su marca es Opel, el tamaño depósito 
    es de 45.0 litros y su modelo es Astra.
    */
BECARIO
Realizar un programa que lea de teclado (la entrada estandar) los siguientes datos:
. Nombre y apellido de un supuesto becario.
. Edad (18-70)
. Numero de suspensos del curso anterior (0-4).
. Residencia familiar (SI|NO)
. Ingresos anuales de la familia.
. Los datos se almacenan en un fichero binario llamado "datosbeca.bin"
CÁLCULO BECA
Realizar un programa que, partiendo del fichero binario “datosbeca.bin”, calcule la cuantía de la beca (en caso de que la haya). El total de la beca se calcula como sigue:
• Base fija de 1500€
• Si los ingresos anuales de la familia son menores o iguales a la media (12.000€), la beca se incrementa en 500€, en caso contrario no lleva complementos.
• Si la edad de la persona es inferior a 23 años, 200€ de gratificación, si es mayor no hay gratificación.
• Si no hay suspensos en el curso anterior, hay una gratificación de 500€, 1 suspenso 200€, si hay 2 suspensos o más no hay beca.
• Si vive de alquiler (no residencia familiar), 1000€ más de gratificación.
• Visualizar el nombre de cada uno de los becarios y su cuantía total (sólo los que tienen beca).

DATOS USUARIO
Realiza un programa en JAVA en el que muestres un menu que te permita 3 opciones:
1. Creacion de un fichero binario (con el nombre que tu quieras) en el que indiques en cada linea:
   Nombre.
   Edad.
   Ciudad de Nacimiento.
2. Mostrar por pantalla el contenido del fichero binario creado.
3. Salir del Programa.
   VALIDACIÓN DNI
   Realiza un programa en JAVA en el que le pidas al usuario su DNI y:
   . En caso de que el DNI sea correcto lo introduciras en un fichero llamado dni.bin.
   . En caso de que el DNI sea incorrecto avisaras al usuario del error y no lo meteras en el fichero.
   . Cuando vuelvas a ejecutar el programa no se sobreescribira el fichero, sino que se seguiran anadiendo DNIs validos al final del fichero dni.bin.
   Ejemplos de ejecución:
   74
   Introduzca un DNI: 12345678Z
   DNI valido e introducido en el fichero.
   FIN DEL PROGRAMA
   Introduzca un DNI: 12345678A
   DNI invalido
   FIN DEL PROGRAMA
    * */

OBJETOS
//SERIALIZACION
/*5)

    Mismo ejercicio que Fich. Binarios - flujo Datos Vehículo pero con serialización, 
    para ello, crea una simple clase Vehiculo
    con los atributos matricula, marca, tamaño del deposito y modelo, 
    con sus respectivos métodos get y el constructor se invocara con todos los atributos.

    El atributo tamañoDeposito no se incluirá en el fichero (aun así debemos pedirlo), 
    debemos indicarlo en la clase (recuerda el uso de transient).

    Recuerda que al usar la clase ObjectOutputStream, si vamos a añadir varios objetos 
    en distintas ejecuciones, debemos crear nuestra propia versión de ObjectOutputStream. 
    */

/*6)

    La serialización de objetos consiste en transformar los atributos de un objeto
    a datos para un fichero binario, esto nos hace ahorrar tiempo a la hora de programar.

    Las clases para realizar una serializacion de objetos son
        ObjectInputStream para leer 
        y ObjectOutputStream para escribir.

    Para crear estos objetos deben pasarle como parámetro 
        un FileInputStream para ObjectInputStream 
        y FileOutputStream para ObjectOutputStream.

    También debemos hacer que la clase que cree el objeto sea serializable, 
    para ello implementaremos una interfaz llamada Serializable, 
    debemos importarla desde el paquete java.io.

    Usaremos en este ejemplo la clase Empleado. Implementando la interfaz 
    que hemos comentado anteriormente.
    
    Ahora escribiremos en un fichero binario, los datos de un objeto de 
    la clase Empleado con ObjectOutputStream, 
    usaremos el método writeObject(objeto_serializable).
    */
Otros sobre Objetos
Crea y escribe en un fichero 10 objetos de la clase Persona. Luego los lee y los muestra por pantalla. (ficheros adjuntos en este listado ejercicios)
Gestión Notas
Realiza un programa en JAVA en el que le pidas al usuario las notas de las 6 asignaturas del Ciclo de DAW y las guarde
en un fichero. Posteriormente leerá el fichero y te calculará la nota media del curso.
Nota 1: Cada una de las asignaturas serán un objeto que se encuentran en un array de 6 posiciones, y cuyos atributos serán el nombre y la nota.
Nota 2: Con el constructor podrás asignar directamente el nombre de la asignatura al crear el objeto. En cambio, el atributo nota, será el usuario quien lo introduzca mediante un método que controle que la nota tenga un valor entre 0 y 10.

Ejemplo de ejecución:
105
Por favor, introduzca la nota de Programación: 6,5
Introduzca la nota de Lenguajes de Marcas: 7,5
Introduzca la nota de Bases de Datos: 7,5
Introduzca la nota de Entornos de Desarrollo: 8
Introduzca la nota de Sistemas Informáticos: 6,5
Por último, introduzca la nota de FOL: 6
***** Notas almacenadas en el array *****
……… Volcando el array al fichero ………
***** Volcado finalizado con éxito *****
………Leyendo el fichero y calculando media………
Su nota media del curso es de: 7

Serialización Objetos con polimorfismo(fichero enunciado adjunto)
Ficheros 'Especiales' (XML/JSON)