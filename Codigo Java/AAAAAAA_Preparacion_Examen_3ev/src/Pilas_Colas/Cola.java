package Pilas_Colas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Cola {

    public static void main(String[] args) {
        Queue<Persona>  ColaDelCine = new LinkedList<>();

        ColaDelCine.add(new Persona("manolo",123));
        ColaDelCine.add(new Persona("juan",11111));
        ColaDelCine.add(new Persona("pepe",11223));
        ColaDelCine.add(new Persona("antonio",123124));

        /** Peek se utiliza para coger el primer elemento de la cola(El primero en entrear
         * */
        System.out.println(ColaDelCine.peek());
        /** Poll Se borra el primer elemento de la cola en este caso despues del Poll
         *  Despues de ejecutar el poll el peek entregara otro valor.
         */
        ColaDelCine.poll();
        System.out.println(ColaDelCine.peek());
        /**
         * "For" para verificar que en una cola existe una persona con un dni especifico.
         */
        int dniAbuscar = 12312;
        boolean personaEncontrada = false;
        for (Persona persona: ColaDelCine
             ) {
            if (persona.getDni()==dniAbuscar) {
                personaEncontrada=true;
                break;
            }

        }
        if (personaEncontrada) {
            System.out.println("La persona que buscas esta en la cola");
        }else System.err.println("Los siento esa persona que buscas no esta en la cola");

    }



}
