import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class alumnos {
    static int numerodeAlumnos = 10;
    String[] nombres = new String[numerodeAlumnos];
    int[] notas = new int[numerodeAlumnos];
    int posicionNotaMaxima = Integer.MIN_VALUE;
    int posicionNotaMinima = Integer.MAX_VALUE;

    public String[] getNombres() {
        return nombres;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public void setPosicionNotaMaxima(int posicionNotaMaxima) {
        this.posicionNotaMaxima = posicionNotaMaxima;
    }

    public void setPosicionNotaMinima(int posicionNotaMinima) {
        this.posicionNotaMinima = posicionNotaMinima;
    }

    public int getPosicionNotaMaxima() {
        return posicionNotaMaxima;
    }

    public int getPosicionNotaMinima() {
        return posicionNotaMinima;
    }

    public alumnos()  {
        rellenarCampos();
    }
    private void rellenarCampos(){

    String[] nombresGuardados = {"Andres", "Brais", "Carlos", "Daniel", "Francisco", "Elena", "Alba", "Marta","Jorge","Marcos"};
    int[] numerosAleatorios=utilidadesMatematicas.numAleatorioEntero(0,10,numerodeAlumnos);
/*
TODO me corta mi matriz a siete no entiendo bien que es lo que pasa antes lo tenia así
setNombres(nombresGuardados);
setNotas(numerosAleatorios);

*/


        for (int i = 0; i < notas.length; i++) {
            nombres[i]=nombresGuardados[utilidadesMatematicas.numAleatorioEntero(0,10)];
            setNotas(numerosAleatorios);
        }

/*TODO asi es como lo hacia antes de divirlo en dos clases diferentes (v2)
        //
        for (int i = 0; i < 7; i++) {
            nombres[i]=nombresGuardados[utilidadesMatematicas.numAleatorioEntero(0,7)];
        }
        for (int i = 0; i < 7 ; i++) {
            notas[i]=utilidadesMatematicas.numAleatorioEntero(0,10);
        }
    }
*/
    }
    public void borrarNota()throws IOException{
            String nombreAlumno="";
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("De que alumno desea borra la nota?");
            nombreAlumno=br.readLine();
            for (int i = 0; i < nombres.length; i++) {
                if(nombres[i].equals(nombreAlumno)){
                    nombres[i]="*";
                    notas[i]=-1;
                }
            }
            System.out.println("Nota borrada con exito");
    }
    public void añadirNota()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Boolean añadido=false;
        String nombre="";
        String nota="";

        System.out.println("Nombre");
        nombre = br.readLine();
        System.out.println("Nota");
        nota = br.readLine();
        for (int i = 0; i < nombres.length; i++) {
            if ((nombres[i].equals("*")) & (!añadido)) {
                nombres[i] = nombre;
                notas[i] = Integer.parseInt(nota);
                añadido=true;
            }
        }
        if (!añadido){
            System.out.println("No quedan posiciones libres borra un alumno y su nota y vuelve a intentarlo");
        }
    }
    public void verSuspensos(){
        for (int i = 0; i < nombres.length; i++) {

            if(notas[i]<5){
                System.out.println(nombres[i]+" ha suspendido con una nota de "+notas[i]);
            }

        }
    }
    }

