/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.serpientesescaleras.imagenes;
import java.awt.Image;
import javax.swing.*;

/**
 *
 * @author nroda
 */
public class LlenadorImagenes {
    
    //Atributos

    
    //Metodos
    
    public Icon editarFondo(JLabel fondo){
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/ImagenesJuego/Imagen2.jpg"));
        Icon fondoImagen = new ImageIcon(imagenFondo.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
        return fondoImagen;
    }
    
    //Getters y setters

    
}
