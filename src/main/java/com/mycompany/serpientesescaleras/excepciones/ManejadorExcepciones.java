/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.serpientesescaleras.excepciones;

import javax.swing.JOptionPane;


/**
 *
 * @author nroda
 */
public class ManejadorExcepciones {
    
    
    
    //Metodos
    //Verifica que se ingresaron los dos iD
    public static void evaluarCampoVacioId(String uno, String dos) throws ExceptionVacio{
        if (uno.isBlank()) {
            throw new ExceptionVacio("Ingresa el id del primer Jugador");
        } else if (dos.isBlank()){
            throw new ExceptionVacio("Ingresa el id del segundo Jugador");
        }
    }
    //Verifica que se ingresaron los tres id
    public static void evaluarCampoVacioId(String uno, String dos, String tres) throws ExceptionVacio{
        if (uno.isBlank()) {
            throw new ExceptionVacio("Ingresa el id del primer Jugador");
        } else if (dos.isBlank()){
            throw new ExceptionVacio("Ingresa el id del segundo Jugador");
        } else if (tres.isBlank()) {
           throw new ExceptionVacio("Ingresa el id del tercer Jugador");
        }
    }
    //Verifica que se ingresaron los cuatro id
    public static void evaluarCampoVacioId(String uno, String dos, String tres, String cuatro) throws ExceptionVacio{
        if (uno.isBlank()) {
            throw new ExceptionVacio("Ingresa el id del primer Jugador");
        } else if (dos.isBlank()){
            throw new ExceptionVacio("Ingresa el id del segundo Jugador");
        } else if (tres.isBlank()) {
            throw new ExceptionVacio("Ingresa el id del tercer Jugador");
        } else if (cuatro.isBlank()) {
            throw new ExceptionVacio("Ingresa el id del cuarto Jugador");
        }
    }
    
    //Verifica si ingreso sus datos
    public static void evaluarSiEstaVacio(String nombre, String apellido) throws ExceptionVacio{
        if (nombre.isEmpty()) {
            throw new ExceptionVacio("Ingresa el nombre del Jugador");
        } else if (apellido.isEmpty()) {
            throw new ExceptionVacio("Ingresa el apellido Jugador");
        }
    }
    
}
