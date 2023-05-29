import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class notas {
    int notaMaxima=Integer.MIN_VALUE;
    int notaMinima=Integer.MAX_VALUE;
    int notaMedia=0;
    int filaNotaMinima=0;
    int filaNotaMaxima=0;
    String[][] alumnos=new String[10][3];

    public notas() {

    }

    public notas(int notaMaxima, int notaMinima, int filaNotaMinima, int filaNotaMaxima, String[][] alumnos) {
        this.notaMaxima = notaMaxima;
        this.notaMinima = notaMinima;
        this.filaNotaMinima = filaNotaMinima;
        this.filaNotaMaxima = filaNotaMaxima;
        this.alumnos = alumnos;
    }

    public void escribirNotas(){
        for (int i = 0; i < alumnos.length; i++) {
                System.out.println("Nota "+i+": "+ alumnos[i][0]+" "+alumnos[i][1]);
        }
     }
    public void añadirNota()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Boolean esPosible=false;
        String nombre="";
        String nota="";

        System.out.println("Nombre");
        nombre=br.readLine();
        System.out.println("Nota");
        nota=br.readLine();
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i][0].equals("*")){
                alumnos[i][0]=nombre;
                alumnos[i][1]=nota;
                esPosible=true;
                break;
            }
        }
        if (!esPosible){
            System.out.println("La tabla está llena borra un dato antes de introducir uno nuevo");
        }
        esPosible=false;
    }
    public void borrarNota()throws IOException {
        String nombreAlumno="";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("De que alumno desea borra la nota?");
        nombreAlumno=br.readLine();
        for (int i = 0; i < alumnos.length; i++) {
            if(alumnos[i][0].equals(nombreAlumno)){
                alumnos[i][1]="Nota Borrada";
            }
        }
        System.out.println("Nota borrada con exito");
    }
    public void estadisticas(){
        System.out.println("La nota media de la clase es "+notaMedia());
        System.out.println("La nota mas alta es un "+notaMaxima());
        System.out.println("La nota mas baja es un "+notaMinima());
    }

    public void verSuspensos(){
        for (int i = 0; i < alumnos.length; i++) {
            if(!(alumnos[i][1].equals("*"))){
                if (Integer.parseInt(alumnos[i][1])<5){
                    System.out.println(alumnos[i][0]+" ha suspendido con una nota de "+alumnos[i][1]);
                }
            }

        }
    }
    public int notaMedia() {
        int nMedia = 0;
        int numerodeNotas=0;
        for (int i = 0; i < alumnos.length; i++) {
            if (!(alumnos[i][1].equals("*"))) {
                notaMedia += Integer.parseInt(alumnos[i][1]);
                numerodeNotas++;
            }
            notaMedia=notaMedia/numerodeNotas;
        }
        return notaMedia;
    }
        public int notaMaxima (){
            for (int i = 0; i < alumnos.length; i++) {
                if (!(alumnos[i][1].equals("*"))) {
                    if ((Integer.parseInt(alumnos[i][1]) > notaMaxima)) {
                        notaMaxima = Integer.parseInt(alumnos[i][1]);
                        filaNotaMaxima=i;
                    }
                }
            }
            return (notaMaxima);

        }
        public int notaMinima (){
            for (int i = 0; i < alumnos.length; i++) {
                if (!(alumnos[i][1].equals("*"))) {
                    if ((Integer.parseInt(alumnos[i][1]) < notaMinima)) {
                        notaMinima = Integer.parseInt(alumnos[i][1]);
                        filaNotaMinima = i;
                    }
                }
            }
            return (notaMinima);
        }
    }

