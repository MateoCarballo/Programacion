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
public class ConfirmDialog {
    public static void main(String[] args) {
        //salidaMejorada.JOptionPane.showConfirmDialog(Componente padre, "Mensaje");
        //int resp = salidaMejorada.JOptionPane.showConfirmDialog(null, "¿Está seguro?");
    //-----------------------------------------------------------------    
        //salidaMejorada.JOptionPane.showConfirmDialog(Componente padre, "Mensaje", "Titulo","Tipo de seleccion");
        //int resp = salidaMejorada.JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", salidaMejorada.JOptionPane.YES_NO_OPTION);
    //----------------------------------------------------------------    
        //salidaMejorada.JOptionPane.showConfirmDialog(Componente padre, "Mensaje", "titulo", "tipo de seleccion", "tipo de mensaje");
        
      //  int resp = salidaMejorada.JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", salidaMejorada.JOptionPane.YES_NO_OPTION, salidaMejorada.JOptionPane.ERROR_MESSAGE);
    //---------------------------------------------------------------------   
        MyIcon icon = new MyIcon();
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, icon);

    
        if(resp==0){//resp 0 -> si
            JOptionPane.showMessageDialog(null, "Ha dicho que si");
        }
        else{//resp 1 -> no
            JOptionPane.showMessageDialog(null, "Ha dicho que no");
        }
        
    }
}
