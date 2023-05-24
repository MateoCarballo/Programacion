package Pilas_Colas;

import java.util.Stack;

public class Pila {


    public static void main(String[] args) {
      Stack<Plato> PilaDePlatosAOrdenar = new Stack<>();
        Stack<Plato> PilaDePlatosBlue = new Stack<>();
        Stack<Plato> PilaDePlatosYellow = new Stack<>();
        Stack<Plato> PilaDePlatosRed = new Stack<>();
        Stack<Plato> PilaDePlatosBlack = new Stack<>();
        Stack<Plato> PilaDePlatosSucios = new Stack<>();


      PilaDePlatosAOrdenar.push(new Plato("blue",true));
      PilaDePlatosAOrdenar.push(new Plato("red",true));
      PilaDePlatosAOrdenar.push(new Plato("yellow",true));
      PilaDePlatosAOrdenar.push(new Plato("grey",true));
      PilaDePlatosAOrdenar.push(new Plato("black",false));
      PilaDePlatosAOrdenar.push(new Plato("blue",true));
      PilaDePlatosAOrdenar.push(new Plato("red",true));
      PilaDePlatosAOrdenar.push(new Plato("yellow",true));
      PilaDePlatosAOrdenar.push(new Plato("grey",true));
      PilaDePlatosAOrdenar.push(new Plato("black",true));
      PilaDePlatosAOrdenar.push(new Plato("blue",false));
      PilaDePlatosAOrdenar.push(new Plato("red",false));
      PilaDePlatosAOrdenar.push(new Plato("yellow",false));
      PilaDePlatosAOrdenar.push(new Plato("grey",true));
      PilaDePlatosAOrdenar.push(new Plato("black",true));
      
      
      
      
          for (Plato p: PilaDePlatosAOrdenar)
          {
          if (!p.isLimpio()) {PilaDePlatosSucios.push(p);

          } else if (p.getColor().equals("blue")) {
                                PilaDePlatosBlue.push(p);

            
          } else if (p.getColor().equals("red")) {
                                PilaDePlatosRed.push(p);


          } else if (p.getColor().equals("yellow")) {
                                    PilaDePlatosYellow.push(p);

          } else if (p.getColor().equals("black")) {
              PilaDePlatosBlack.push(p);

            }
          }
          PilaDePlatosAOrdenar.clear();



      System.out.println("Estado de la pila platos sucios");
      PrintStack(PilaDePlatosSucios);
      System.out.println("Estado de la pila platos blue");
      PrintStack(PilaDePlatosBlue);
      System.out.println("Estado de la pila platos yellow");
      PrintStack(PilaDePlatosYellow);
      System.out.println("Estado de la pila platos red");
      PrintStack(PilaDePlatosRed);
      System.out.println("Estado de la pila platos black");
      PrintStack(PilaDePlatosBlack);
      System.out.println("Estado de la pila de platos a ordenar");
      PrintStack(PilaDePlatosAOrdenar);
    }

    public static void PrintStack(Stack<Plato> stackToPrint){
      if (stackToPrint.empty()) {
        System.err.println("La pila esta vacia");
      } else {
        for (Plato p : stackToPrint
        )
          System.out.println(p);


      }

      }





}





