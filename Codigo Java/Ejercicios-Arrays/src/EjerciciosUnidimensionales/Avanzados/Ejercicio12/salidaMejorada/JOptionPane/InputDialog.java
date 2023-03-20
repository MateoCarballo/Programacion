/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosUnidimensionales.Avanzados.Ejercicio12.salidaMejorada.JOptionPane;

import javax.swing.JOptionPane;

/**
 *
 * @author mrnov
 */
public class InputDialog {
    public static void main(String[] args) {
        //String respuesta = salidaMejorada.JOptionPane.showInputDialog("Escribe tu nombre");
 //----------------------------------------------------------------       
//        salidaMejorada.JOptionPane.showInputDialog(Componente padre, Mensaje, Texto Inicial);
//        String respuesta = salidaMejorada.JOptionPane.showInputDialog("¿Cual es su nombre?", "atxy2k");
 //-----------------------------------------------------------------------       
//        salidaMejorada.JOptionPane.showInputDialog(Componente padre, Mensaje, Titulo, Tipo De Mensaje (WARNING) );
        String respuesta = JOptionPane.showInputDialog(null, 
                "Escriba nuevamente su nombre", "Error!", JOptionPane.ERROR_MESSAGE);
 //------------------------------------------------------------------       
//        salidaMejorada.JOptionPane.showInputDialog(Componente padre, Mensaje, Titulo,
//        Tipo De Mensaje, Icono, Array de opciones, Seleccion por defecto );
    

//        String[] carreras = {
//            "Ingeniería en sistemas computacionales",
//            "Ingeniería industrial",
//            "Ingeniería en mecatrónica",
//            "Ingeniería en informatica",
//            "Ingeniería petroquímica"
//        };
//        
//        MyIcon icon = new MyIcon();
//        
//        String resp = (String) salidaMejorada.JOptionPane.showInputDialog(null, "Seleccione una carrera a cursar", "Carrera",
//                salidaMejorada.JOptionPane.DEFAULT_OPTION, icon, carreras, carreras[0]);
//        
//        salidaMejorada.JOptionPane.showMessageDialog(null, resp);
//------------------------------------------------------------------
            JOptionPane.showMessageDialog(null, respuesta);


    }

}
