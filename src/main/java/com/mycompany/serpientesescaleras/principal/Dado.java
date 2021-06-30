/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.serpientesescaleras.principal;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author nroda
 */
public class Dado {
    //Atributos
    private final Random random = new Random();
    private int dado1;
    private int dado2;
    
    //Constuctor
    public Dado(){
        
    }
    
    //Metodos
    public int retornarSuma(){
        this.dado1 = random.nextInt(6)+1;
        this.dado2 = random.nextInt(6)+1;
        int suma = this.dado1 + this.dado2;
        JOptionPane.showMessageDialog(null, "El primer dado dio: " + dado1 + " El segundo dado dio: " + dado2 + " Avanzas: " + suma + " casillas");
        return suma;
    }
}
