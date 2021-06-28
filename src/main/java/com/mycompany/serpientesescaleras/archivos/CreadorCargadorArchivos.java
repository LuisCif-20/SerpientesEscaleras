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
    private static String DIRECTORIO;

    public static void AlmacenarInfoJugador(int id, Jugador datos) throws FileNotFoundException, IOException {
        ID = id + ".ply";
        try ( ObjectOutputStream archivoguardar = new ObjectOutputStream(new FileOutputStream(DIRECTORIO + ID))) {
                archivoguardar.writeObject(datos);
                archivoguardar.flush();
            }

    }

    public static Object CargarInfo(int numero) throws FileNotFoundException, IOException, ClassNotFoundException {
        ID = numero + ".ply";
        File archivocargar = new File(DIRECTORIO + ID);
            if (archivocargar.exists()) {
                FileInputStream archivoacargar = new FileInputStream(archivocargar);
                ObjectInputStream infocargada = new ObjectInputStream(archivoacargar);
                return infocargada.readObject();
            } else {
                return null;
            }

    }
    
    //Getters y Setter

    public static String getID() {
        return ID;
    }

    public static void setID(String ID) {
        CreadorCargadorArchivos.ID = ID;
    }

    public static String getDIRECTORIO() {
        return DIRECTORIO;
    }

    public static void setDIRECTORIO(String DIRECTORIO) {
        CreadorCargadorArchivos.DIRECTORIO = DIRECTORIO;
    }
    

}
