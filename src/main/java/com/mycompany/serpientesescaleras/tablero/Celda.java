/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.serpientesescaleras.tablero;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author nroda
 */
public class Celda {
    //Atributos
    
    //Constructor

    public Celda() {
        
    }
    
    //Metodos
    public void pintarCeldaGris(JLabel celda){
        celda.setOpaque(true);
        celda.setBackground(Color.LIGHT_GRAY);
    }
    
    public void pintarCeldaBlanco(JLabel celda){
        celda.setOpaque(true);
        celda.setBackground(Color.WHITE);
    }
}
