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
    private final Ficha ficha = new Ficha();
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
    
    public void ponerTodasFichas(JLabel celda){
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/ImagenesJuego/5.png"));
        Icon fondoImagen = new ImageIcon(imagenFondo.getImage().getScaledInstance(celda.getWidth(), celda.getHeight(), Image.SCALE_DEFAULT));
        celda.setIcon(fondoImagen);
    }
    
    public void ponerIcono(int numero, JLabel celda){
        ficha.verficarSiHayFicha(numero, celda);
    }
}
