# Ejercicio propuesto: Aplicando el polimorfismo

En este ejercicio se va a aplicar el polimorfimo en la lectura de objetos.

## Enunciado:
Se quiere guardar información sobre animales para realizar un juego infantil. Los
animales a mostrar en el juego son perros o gatos.

La información que se quiere guardar es la del nombre del animal, su edad.
En el caso de los perros, se quiere saber si tienen el rabo largo o no, y en el caso de los gatos si tienen bigotes largos o no.
También se querrá saber la forma de expresarse de cada uno. Los gatos harán "MIAU"y los perros "GUAU".
Vamos a necesitar un método (getTipo) que nos indique que clase de animal es (perro
o gato), ya que habrá momentos en que trabajaremos con animales.


Una vez definidas las clases para guardar la información anterior, crea una clase de
nombre OperacionesAnimales.
Dicha clase podrá guardar información sobre cinco perros y cinco gatos. Debes hacer
uso de arrays estáticos de tamaño 5.
Dispondrá de un método addPerro(Perro perro) que permitirá añadir un perro (de los
cinco posibles). Necesitarás un contador que te indique en qué posición del array debes
de añadir el perro nuevo. Dicho método devolverá un boolean indicando si se añadió
correctamente el perro. Si intentamos añadir un nuevo perro y el array está ocupado,
devolverá false.
Lo mismo para el caso de los gatos (método addGato(Gato gato).


Dispondrá de un método guardarAnimalesADisco(String fichero) en el que se guardarán
todos los objetos que se encuentren en los dos arrays (perros / gatos). Como no
sabemos crear arrays dinámicos, escribiremos en el fichero, antes de los objetos, el
número de objetos total que vamos a escribir.


Dispondrá de un método leerAnimalesDisco(String fichero) que leerá de disco los
objetos guardados del paso anterior. Primero leeremos el número de animales
guardados en disco para dar memoria al array que debe devolver el método. Después
leeremos todos los animales que se irán guardando en el array que tenemos que
devolver. Se actualizarán los datos de la clase (los arrays que guardan los gatos y los
perros).


Crea una clase Principal con un método main que haga uso de la clase anterior.