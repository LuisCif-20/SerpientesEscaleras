/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.serpientesescaleras.principal;

import com.mycompany.serpientesescaleras.tablero.Tablero;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nroda
 */
public class Juego {

    //Atributos
    private final JPanel tablero;
    private final Tablero celdas;
    private final int numeroDeBucle;
    private int indice;
    private final Dado dados;
    private boolean seguir;

    //Contructor
    public Juego(JPanel tablero, int numeroDeBucle) {
        this.dados = new Dado();
        this.indice = 0;
        this.tablero = tablero;
        this.numeroDeBucle = numeroDeBucle;
        celdas = new Tablero(this.tablero);
        celdas.getCelda().ponerTodasFichas(celdas.getTablero()[0][0]);
        JOptionPane.showMessageDialog(null, "Turno Jugador: " + (indice + 1) + "");
    }

    //Metodos
    public void jugar() {
        int avanzarcasillas = dados.retornarSuma();
        for (int x = 0; x < celdas.getTablero().length; x++) {
            for (int y = 0; y < celdas.getTablero()[x].length; y++) {
                if (indice == 0) {
                    if (x % 2 == 0) {
                        
                    } else {
                    }
                } else {
                }
            }
        }
        switch (numeroDeBucle) {
            case 2:
                if (indice == 0) {
                    indice = 1;
                } else {
                    indice = 0;
                }
                break;
            case 3:
                switch (indice) {
                    case 0:
                        indice = 1;
                        break;
                    case 1:
                        indice = 2;
                        break;
                    default:
                        indice = 0;
                        break;
                }
                break;
            case 4:
                switch (indice) {
                    case 0:
                        indice = 1;
                        break;
                    case 1:
                        indice = 2;
                        break;
                    case 2:
                        indice = 3;
                        break;
                    default:
                        indice = 0;
                        break;
                }
                break;
            default:
                break;
        }
        JOptionPane.showMessageDialog(null, "Turno Jugador: " + (indice + 1));

    }

}
