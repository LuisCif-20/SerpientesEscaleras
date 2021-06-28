/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.serpientesescaleras.archivos;

import com.mycompany.serpientesescaleras.jugadores.Jugador;
import java.io.*;

/**
 *
 * @author nroda
 */
public class CreadorCargadorArchivos implements Serializable {
    
    private static String ID;
    private static String path = System.getProperty("user.dir");

    public static void AlmacenarInfoJugador(int id, Jugador datos) throws FileNotFoundException, IOException {
        ID = id + ".pst";
        try ( ObjectOutputStream archivoguardar = new ObjectOutputStream(new FileOutputStream(path + "\\" + ID))) {
            archivoguardar.writeObject(datos);
            archivoguardar.flush();
        }
    }
    
    
    
}
