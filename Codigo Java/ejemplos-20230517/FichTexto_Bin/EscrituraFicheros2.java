/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDFicheros.FichSecuenciales.LecturaEscrtitura.Main;

import java.io.FileWriter;

/**
 *
 * @author mrnov
 */
public class EscrituraFicheros2 {
    public static void main(String[] args) {

		String[] lineas = { "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "..." };

		/** FORMA 1 DE ESCRITURA **/
		FileWriter fichero = null;
		try {

			fichero = new FileWriter("fichero_escritura2.txt");

			// Escribimos linea a linea en el fichero
			for (String linea : lineas) {
				fichero.write(linea + "\n");
                                System.out.println("se escribió: "+linea);
                                
			}

			fichero.close();

		} catch (Exception ex) {
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}
	}
}
