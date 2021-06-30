/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.serpientesescaleras.tablero;

import com.mycompany.serpientesescaleras.imagenes.LlenadorImagenes;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author nroda
 */
public class Ficha {
    
    //Atributos
    private LlenadorImagenes fondo = new LlenadorImagenes();
    
    //Metodos
    //Pione iconos las celdas
    public void verficarSiHayFicha(int numero, JLabel celda){
        if (numero == 1) {
            if (celda.getIcon() == null) {
                celda.setIcon(fondo.fondoJLabel(numero, celda));
            } else if (celda.getIcon().equals(fondo.fondoJLabel(numero+1, celda))) {
                celda.setIcon(fondo.fondoJLabel(10, celda));
            } else if (celda.getIcon().equals(fondo.fondoJLabel(numero+2, celda))) {
                celda.setIcon(fondo.fondoJLabel(11, celda));
            } else if (celda.getIcon().equals(fondo.fondoJLabel(numero+3, celda))) {
                celda.setIcon(fondo.fondoJLabel(12, celda));
            } else if (celda.getIcon().equals(fondo.fondoJLabel(13, celda))) {
                celda.setIcon(fondo.fondoJLabel(9, celda));
            } else if (celda.getIcon().equals(fondo.fondoJLabel(14, celda))) {
                celda.setIcon(fondo.fondoJLabel(6, celda));
            } else if (celda.getIcon().equals(fondo.fondoJLabel(15, celda))) {
                celda.setIcon(fondo.fondoJLabel(7, celda));
            } else if (celda.getIcon().equals(fondo.fondoJLabel(8, celda))) {
                celda.setIcon(fondo.fondoJLabel(5, celda));
            }
        }
        if (numero == 2) {
            if (celda.getIcon() == null) {
                celda.setIcon(fondo.fondoJLabel(numero, celda));
            } else if (celda.getIcon().equals(fondo.fondoJLabel(numero-1, celda))) {
                celda.setIcon(fondo.fondoJLabel(10, celda));
            } else if (celda.getIcon().equals(fondo.fondoJLabel(numero+1, celda))) {
                celda.setIcon(fondo.fondoJLabel(15, celda));
            } else if (celda.getIcon().equals(fondo.fondoJLabel(numero+2, celda))) {
                celda.setIcon(fondo.fondoJLabel(14, celda));
            } else if (celda.getIcon().equals(fondo.fondoJLabel(13, celda))) {
                celda.setIcon(fondo.fondoJLabel(8, celda));
            } else if (celda.getIcon().equals(fondo.fondoJLabel(12, celda))) {
                celda.setIcon(fondo.fondoJLabel(6, celda));
            } else if (celda.getIcon().equals(fondo.fondoJLabel(11, celda))) {
                celda.setIcon(fondo.fondoJLabel(7, celda));
            } else if (celda.getIcon().equals(fondo.fondoJLabel(9, celda))) {
                celda.setIcon(fondo.fondoJLabel(5, celda));
            }
        }
        if (numero == 3) {
            if (celda.getIcon() == null) {
                celda.setIcon(fondo.fondoJLabel(numero, celda));
            } else if (celda.getIcon().equals(fondo.fondoJLabel(numero-2, celda))) {
                celda.setIcon(fondo.fondoJLabel(11, celda));
            } else if (celda.getIcon().equals(fondo.fondoJLabel(numero-1, celda))) {
                celda.setIcon(fondo.fondoJLabel(15, celda));
            } else if (celda.getIcon().equals(fondo.fondoJLabel(numero+1, celda))) {
                celda.setIcon(fondo.fondoJLabel(13, celda));
            } else if (celda.getIcon().equals(fondo.fondoJLabel(10, celda))) {
                celda.setIcon(fondo.fondoJLabel(7, celda));
            } else if (celda.getIcon().equals(fondo.fondoJLabel(12, celda))) {
                celda.setIcon(fondo.fondoJLabel(9, celda));
            } else if (celda.getIcon().equals(fondo.fondoJLabel(14, celda))) {
                celda.setIcon(fondo.fondoJLabel(8, celda));
            } else if (celda.getIcon().equals(fondo.fondoJLabel(6, celda))) {
                celda.setIcon(fondo.fondoJLabel(5, celda));
            }
        }
        if (numero == 4) {
            if (celda.getIcon() == null) {
                celda.setIcon(fondo.fondoJLabel(numero, celda));
            } else if (celda.getIcon().equals(fondo.fondoJLabel(numero-3, celda))) {
                celda.setIcon(fondo.fondoJLabel(12, celda));
            } else if (celda.getIcon().equals(fondo.fondoJLabel(numero-2, celda))) {
                celda.setIcon(fondo.fondoJLabel(14, celda));
            } else if (celda.getIcon().equals(fondo.fondoJLabel(numero-1, celda))) {
                celda.setIcon(fondo.fondoJLabel(13, celda));
            } else if (celda.getIcon().equals(fondo.fondoJLabel(10, celda))) {
                celda.setIcon(fondo.fondoJLabel(6, celda));
            } else if (celda.getIcon().equals(fondo.fondoJLabel(11, celda))) {
                celda.setIcon(fondo.fondoJLabel(9, celda));
            } else if (celda.getIcon().equals(fondo.fondoJLabel(15, celda))) {
                celda.setIcon(fondo.fondoJLabel(8, celda));
            } else if (celda.getIcon().equals(fondo.fondoJLabel(7, celda))) {
                celda.setIcon(fondo.fondoJLabel(5, celda));
            }
        }
    }
    
}
