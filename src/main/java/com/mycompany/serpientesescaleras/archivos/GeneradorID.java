/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.serpientesescaleras.archivos;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author nroda
 */
public class GeneradorID {
    
    //Atributos
    private static final String NUMEROS = "012345";
    private static Random ale = new Random();
    //Constructor
    
    //Metodos
    public static int brindarIdCreado() throws IOException, FileNotFoundException, ClassNotFoundException{
        int id;
        do { 
            id = darID();   
        } while (id == CreadorCargadorArchivos.CargarInfo(id).getIdJugador());        
        return id;
    }
    
    public static int darID(){
        int id;
        String seleccion = "";
        String[] caracteres = NUMEROS.split("");
        for (int i = 0; i < 3; i++) {
            id = ale.nextInt(6);
            seleccion = seleccion + caracteres[id];
        }
        id = Integer.parseInt(seleccion);
        
        return id;
        
    }
}
