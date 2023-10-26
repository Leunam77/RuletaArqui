/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ruletaeuropea;

/**
 *
 * @author jmanu
 */
public interface Jugada {
    Mesa getmesaJuego();
    void setSeleccionFicha(int valor);
    void buscarApuesta(int x, int y);
    void apostar();
    void limpiarApuestas();
}
