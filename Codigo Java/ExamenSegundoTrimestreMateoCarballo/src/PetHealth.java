import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PetHealth {

    static Paciente pacienteAux= new Paciente();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean esUnNumero=false;
        boolean continuarMenuPpal = true;
        String seleccionMenu="";
        ArrayList<Persona> plantilla=new ArrayList<>();

        // introduzco un 0.8 en retencion porque nos quita un 20% del salario bruto

        plantilla.add(new Veterinario("11111111A","Veterinario1","111-111-111",(float)27000.28,(float)0.8,600));
        plantilla.add(new Veterinario("22222222B","Veterinario2","222-222-222",(float)37000.98,(float)0.7,1000));
        plantilla.add(new Veterinario("33333333C","Veterinario4","333-333-333",(float)18000.76,(float)0.9,600));



        plantilla.add(new Auxiliar("99999999-Z","Auxiliar1","111-111-111",(float)27000.28,(float)0.8));
        plantilla.add(new Auxiliar("88888888-Y","Auxiliar2","111-111-111",(float)27000.28,(float)0.8));
        plantilla.add(new Auxiliar("77777777-X","Auxiliar3","111-111-111",(float)27000.28,(float)0.8));

        // Como tengo elementos de tipo persona tengo que castearlo a veterinario para poder acceder a sus metodos


        //Pacientes del veterinario 1
        Paciente paciente11=new Paciente("dniDueño11","nombreDueño11","NombreAnimal11","razaAnimal11","tfnoPaciente11");
        Paciente paciente12=new Paciente("dniDueño12","nombreDueño12","NombreAnimal12","razaAnimal12","tfnoPaciente12");
        Paciente paciente13=new Paciente("dniDueño13","nombreDueño13","NombreAnimal13","razaAnimal13","tfnoPaciente13");
        //Pacientes del veterinario 2
        Paciente paciente21=new Paciente("dniDueño21","nombreDueño21","NombreAnimal21","razaAnimal21","tfnoPaciente21");
        Paciente paciente22=new Paciente("dniDueño22","nombreDueño22","NombreAnimal22","razaAnimal22","tfnoPaciente22");
        Paciente paciente23=new Paciente("dniDueño23","nombreDueño23","NombreAnimal23","razaAnimal23","tfnoPaciente23");

        Paciente paciente31=new Paciente("dniDueño31","nombreDueño31","NombreAnimal31","razaAnimal31","tfnoPaciente31");
        Paciente paciente32=new Paciente("dniDueño32","nombreDueño32","NombreAnimal32","razaAnimal32","tfnoPaciente32");
        Paciente paciente33=new Paciente("dniDueño33","nombreDueño33","NombreAnimal33","razaAnimal33","tfnoPaciente33");

        generarHistoriales(paciente11);
        generarHistoriales(paciente12);
        generarHistoriales(paciente13);

        generarHistoriales(paciente21);
        generarHistoriales(paciente22);
        generarHistoriales(paciente23);

        generarHistoriales(paciente31);
        generarHistoriales(paciente32);
        generarHistoriales(paciente33);

        ((Veterinario) plantilla.get(0)).addPaciente(paciente11);
        ((Veterinario) plantilla.get(0)).addPaciente(paciente12);
        ((Veterinario) plantilla.get(0)).addPaciente(paciente13);

        ((Veterinario) plantilla.get(1)).addPaciente(paciente21);
        ((Veterinario) plantilla.get(1)).addPaciente(paciente22);
        ((Veterinario) plantilla.get(1)).addPaciente(paciente23);

        ((Veterinario) plantilla.get(2)).addPaciente(paciente31);
        ((Veterinario) plantilla.get(2)).addPaciente(paciente32);
        ((Veterinario) plantilla.get(2)).addPaciente(paciente33);




        /* Esto era para meterlos en automatico


        for (int i = 0; i < 4; i++) {
            if (plantilla.get(i).getClass().getSimpleName().equalsIgnoreCase("Veterinario")){

                if((plantilla.get(i) instanceof Veterinario)){
                    ((Veterinario) plantilla.get(i)).addPaciente
                            (new Paciente());
                }
            }

        }

*/
/*MENU OBJETIVO
                    1.Visualizar Trabajos(Por DNI Cliente).
                    2.Añadir Empleado.
                    3.Añadir Cliente.
                    4.Eliminar Empleado.
                    5.Eliminar Cliente
                    0.Salir

 */

        do {
            while (!esUnNumero) {
                System.out.println("""
                    1.Visualizar Trabajos(Por DNI Cliente).
                    2.Baja Veterinario.
                    0.Salir               
                    """);

                seleccionMenu= br.readLine();

                if (seleccionMenu.matches("^[0-9]$")) {
                    System.out.println("El numero introducido es valido."+"\n");
                    esUnNumero = true;
                } else {
                    System.out.println("""
                        Has introducido un valor que no cumple las especificaciones
                        Introduce un digito entre 0-9""");
                    esUnNumero = false;
                }

            }
//
            switch (Integer.parseInt(seleccionMenu)) {
                case 1 -> {
                    //Buscar en cada veterinario al paciente que queremos distinguiendo que solo busque en los elementos de tipo paciente
                    //llamo al metodo y le paso la plantilla para que me diga dentro de que veterinario está


                    //Asi comprobaria que el formato es valido pero al probar para que sea mas facil de ver que está ok
                    // los valores de dni son "dnidueño11" para indicar que pertenece al veterinario 1 y es el paciente 1
                    /*
                    do{
                        System.out.println("Escribe el DNI del dueño y asi te mostrare el historial del paciente");
                        dniDueñoPaciente= br.readLine();

                    }while(!validaDNI_Exp(dniDueñoPaciente));

                     */
                    System.out.println("Escribe el DNI del duenho");
                    String dniDueñoPaciente= br.readLine();

                    buscarVeterinario(plantilla,dniDueñoPaciente);
                }
                case 2 -> {
                    String entradaTeclado = "";
                    do {
                        System.out.println("Vas a eliminar un veterinario, introduce su DNI");
                        entradaTeclado = br.readLine();
                        if (validaDNI(entradaTeclado)) {
                            eliminarVeterinario(plantilla, entradaTeclado);
                        }
                    }while(!validaDNI(entradaTeclado));
                }

                case 0 -> {
                    continuarMenuPpal = false;
                }
            }
            esUnNumero = false;

        } while (continuarMenuPpal);
    }
    public static void buscarVeterinario( ArrayList<Persona> milista,String dniDueñoPaciente){

        for (int i = 0; i < milista.size(); i++) {
            if((milista.get(i) instanceof Veterinario)){
                buscarPaciente((Veterinario) milista.get(i),dniDueñoPaciente);
            }
        }
    }

    public static void buscarPaciente( Veterinario miVeterinarioPreferido ,String dniDueñoPaciente){


        ArrayList <Paciente> listadoPacientesVeterinarioPreferido = new ArrayList<>();

        listadoPacientesVeterinarioPreferido=miVeterinarioPreferido.getListadoP();

        for (int i = 0; i < listadoPacientesVeterinarioPreferido.size(); i++) {
            pacienteAux=listadoPacientesVeterinarioPreferido.get(i);

            if(pacienteAux.getDniDueño().equalsIgnoreCase(dniDueñoPaciente)){
                pacienteAux.imprimirHistorial(pacienteAux.getHistorial(),miVeterinarioPreferido.getNombre());

            }
        }
    }




        private static int numeroAleatorio (){
        return ((int)Math.floor(Math.random()*1000));
    }

    public static void imprimirElementosArrayList (ArrayList<Persona> lista){
        for(Persona elemento :lista) {
            System.out.println(elemento);
        }
    }
    public static boolean validaDNI(String DNI){

        return DNI.matches("^[1-9]{8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]{1}$");

    }

    public static void generarHistoriales(Paciente miPaciente){
        miPaciente.historial.add(new Consulta("fechadeConsulta","tipodeTrabajo",123456,true));
    }

    public static void eliminarVeterinario(ArrayList<Persona> empleados,String dniVeterinario) throws IOException {
        boolean encontrado = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));{

        for (int i = 0; i < empleados.size(); i++) {

            if(empleados.get(i).getDni().equalsIgnoreCase(dniVeterinario)){
                encontrado=true;

                System.out.println("He encontrado un veterinario que tiene el dni que buscas"+"\n"
                +" Quieres eliminarlo? (Y/N)");

                System.out.println(empleados.get(i).toString());
                ((Veterinario) (empleados.get(i).printear));

                if (br.readLine().equalsIgnoreCase("y")){
                    empleados.remove(i);
                    System.out.println("Veterinario "+empleados.get(i).getDni()+" "
                            +empleados.get(i).getNombre()+ " borrado con exito");

                }else{
                    System.out.println("Has cancelado la operacion de borrado");
                }

            }


        }

            if (!encontrado){
                System.out.println("No se han encontrado veterinarios que coincida con el dni introducido");
            }
    }

}}