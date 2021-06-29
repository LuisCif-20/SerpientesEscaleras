/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.serpientesescaleras.jugadores;

import java.util.ArrayList;

/**
 *
 * @author nroda
 */
public class ListaJugadores {
    
    //Atributos
    
    private static ArrayList<Jugador> listaJugador = new ArrayList<>();;
    private static int contadorId;
    
    //Constructor

    public ListaJugadores() {
    }
    
    //Metodos
    
    public static void agregarJugador(Jugador jugador){
        ListaJugadores.listaJugador.add(jugador);
    }
    
    public void imprimirJugadores(){
        for (int i = 0; i < ListaJugadores.listaJugador.size(); i++) {
            System.out.print("Id: " + ListaJugadores.listaJugador.get(i).getIdJugador() + " ");
            System.out.print("Nombre: " + ListaJugadores.listaJugador.get(i).getNombreJugador() + " ");
            System.out.print("Apellido: " + ListaJugadores.listaJugador.get(i).getApellidoJugador() + " ");
            System.out.print("Partidas Jugadas: " + ListaJugadores.listaJugador.get(i).getPartidasJugadas() + " ");
            System.out.println("Partidas Ganadas: " + ListaJugadores.listaJugador.get(i).getPartidasGanadas() + " ");
            System.out.println("Partidas Perdidas: " + ListaJugadores.listaJugador.get(i).getPartidasPerdidas() + " ");
        }
    }
    
    
    //Getters y Setters

    public static ArrayList getListaJugador() {
        return listaJugador;
    }

    public static void setListaJugador(ArrayList listaJugador) {
        ListaJugadores.listaJugador = listaJugador;
    }

    
    
}
