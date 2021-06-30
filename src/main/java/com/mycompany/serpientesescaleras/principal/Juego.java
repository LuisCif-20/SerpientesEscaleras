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
    private int[] posicionficha1 = {0, 0};
    private int[] posicionficha2 = {0, 0};
    private int[] posicionficha3 = {0, 0};
    private int[] posicionficha4 = {0, 0};

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
        if (indice == 0) {
            this.verMod(this.posicionficha1[0], avanzarcasillas, posicionficha1[1]);
        } else if (indice == 1) {
            this.verMod(this.posicionficha2[0], avanzarcasillas, posicionficha2[1]);
        } else if (indice == 2) {
            this.verMod(this.posicionficha3[0], avanzarcasillas, posicionficha3[1]);
        } else if (indice == 3) {
            this.verMod(this.posicionficha4[0], avanzarcasillas, posicionficha4[1]);
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

    public void moverFichaPar(int numero, int avanzarCasillas, int x, int y) {
        int limite = celdas.getTablero()[x].length;
        int disponibles = limite - y - 1;
        if (avanzarCasillas > disponibles) {
            celdas.setFicha1(celdas.getTablero()[x][y]);
            if (avanzarCasillas > limite) {
                int residuo = avanzarCasillas - disponibles;
                int posicion = limite - residuo;
                celdas.getCelda().ponerIcono(numero, celdas.getTablero()[x + 1][posicion]);
                this.cambiarPosicion(x + 1, posicion);
            } else if (avanzarCasillas < limite) {
                int residuo = limite - avanzarCasillas;
                int posicion = limite - residuo;
                celdas.getCelda().ponerIcono(numero, celdas.getTablero()[x + 1][posicion]);
                this.cambiarPosicion(x + 1, posicion);
            } else {
                int residuo = limite - disponibles;
                int posicion = limite - residuo;
                celdas.getCelda().ponerIcono(numero, celdas.getTablero()[x + 1][posicion]);
                this.cambiarPosicion(x + 1, posicion);
            }
        } else {
            celdas.setFicha1(celdas.getTablero()[x][y]);
            celdas.getCelda().ponerIcono(numero, celdas.getTablero()[x][y + avanzarCasillas]);
            this.cambiarPosicion(x, y + avanzarCasillas);
        }
    }

    public void moverFichaImpar(int numero, int avanzarCasillas, int x, int y) {
        int limite = celdas.getTablero()[x].length;
        int disponibles =  y;
        if (avanzarCasillas > disponibles) {
            if (avanzarCasillas > limite) {
                celdas.setFicha1(celdas.getTablero()[x][y]);
                int residuo = avanzarCasillas - disponibles - 1;
                celdas.getCelda().ponerIcono(numero, celdas.getTablero()[x + 1][residuo]);
                this.cambiarPosicion(x + 1, residuo);
            } else if (avanzarCasillas < limite) {
                celdas.setFicha1(celdas.getTablero()[x][y]);
                int residuo = limite - avanzarCasillas;
                celdas.getCelda().ponerIcono(numero, celdas.getTablero()[x + 1][residuo]);
                this.cambiarPosicion(x + 1, residuo);
            } else {
                celdas.setFicha1(celdas.getTablero()[x][y]);
                int residuo = limite - disponibles -1;
                celdas.getCelda().ponerIcono(numero, celdas.getTablero()[x + 1][residuo]);
                this.cambiarPosicion(x + 1, residuo);
            }
        } else {
            celdas.setFicha1(celdas.getTablero()[x][y]);
            celdas.getCelda().ponerIcono(numero, celdas.getTablero()[x][y - avanzarCasillas]);
            this.cambiarPosicion(x, y - avanzarCasillas);
        }
    }

    public void verMod(int x, int avanzarcasillas, int y) {
        if (x % 2 == 0) {
            this.moverFichaPar(indice + 1, avanzarcasillas, x, y);
        } else {
            this.moverFichaImpar(indice + 1, avanzarcasillas, x, y);
        }
    }

    public void cambiarPosicion(int x, int y) {
        if (indice == 0) {
            this.posicionficha1[0] = x;
            this.posicionficha1[1] = y;
        } else if (indice == 1) {
            this.posicionficha2[0] = x;
            this.posicionficha2[1] = y;

        } else if (indice == 2) {
            this.posicionficha3[0] = x;
            this.posicionficha3[1] = y;

        } else {
            this.posicionficha4[0] = x;
            this.posicionficha4[1] = y;
        }
    }

}
