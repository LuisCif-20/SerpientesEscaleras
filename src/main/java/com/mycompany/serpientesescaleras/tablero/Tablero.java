/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.serpientesescaleras.tablero;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author nroda
 */
public class Tablero {

    //Atributos
    private final JLabel tablero[][] = new JLabel[10][10];
    private final JPanel panelTablero;

    //Constructor
    public Tablero(JPanel panelTablero) {
        this.panelTablero = panelTablero;
        int i = 0;
        int j = 0;
        for (int x = 0; x < tablero.length; x++) {
            int indice = 1 + (x * 10);
            int limite = (x + 1) * 10;
            for (int y = 0; y < tablero[x].length; y++) {
                tablero[x][y] = new JLabel();
                tablero[x][y].setBounds(i, j, 51, 42);
                if (x % 2 == 0) {
                    tablero[x][y].setText("      " + indice + "");
                    indice++;
                } else {
                    tablero[x][y].setText("      " + limite + "");
                    limite--;
                }
                if (x % 2 == 0) {
                    if (y % 2 == 0) {
                        tablero[x][y].setOpaque(true);
                        tablero[x][y].setBackground(Color.LIGHT_GRAY);
                    } else {
                        tablero[x][y].setOpaque(true);
                        tablero[x][y].setBackground(Color.white);
                    }
                } else {
                    if (y % 2 != 0) {
                        tablero[x][y].setOpaque(true);
                        tablero[x][y].setBackground(Color.LIGHT_GRAY);
                    } else {
                        tablero[x][y].setOpaque(true);
                        tablero[x][y].setBackground(Color.white);
                    }
                }
                this.panelTablero.setBounds(i, j, 500, 400);
                panelTablero.add(tablero[x][y]);
                j += 35;
            }
            i += 51;
            j = 0;
        }
    }

    //Metodos
    //Getters y Setters
}
