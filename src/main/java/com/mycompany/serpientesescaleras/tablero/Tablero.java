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
    private final Celda celda = new Celda();
    private final JPanel panelTablero;
    private JLabel ficha1;
    private JLabel ficha2;
    private JLabel ficha3;
    private JLabel ficha4;

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
                tablero[x][y].setBounds(i, j, 51, 36);
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
                j += 36;
            }
            i += 51;
            j = 0;
        }
    }

    //Metodos
    //Getters y Setters

    public JLabel getFicha1() {
        return ficha1;
    }

    public void setFicha1(JLabel ficha1) {
        this.ficha1 = ficha1;
    }

    public JLabel getFicha2() {
        return ficha2;
    }

    public void setFicha2(JLabel ficha2) {
        this.ficha2 = ficha2;
    }

    public JLabel getFicha3() {
        return ficha3;
    }

    public void setFicha3(JLabel ficha3) {
        this.ficha3 = ficha3;
    }

    public JLabel getFicha4() {
        return ficha4;
    }

    public void setFicha4(JLabel ficha4) {
        this.ficha4 = ficha4;
    }

    public JLabel[][] getTablero() {
        return tablero;
    }

    public Celda getCelda() {
        return celda;
    }

    public JPanel getPanelTablero() {
        return panelTablero;
    }
    
}
