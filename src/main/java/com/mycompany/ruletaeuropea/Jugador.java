/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ruletaeuropea;

/**
 *
 * @author jmanu
 */
public class Jugador {
    protected String nombre;
    protected int dineroTotal;
    protected int apuestaTotalActual;

    public Jugador(String nombre, int dineroTotal, int apuestaTotalActual) {
        this.nombre = nombre;
        this.dineroTotal = dineroTotal;
        this.apuestaTotalActual = apuestaTotalActual;
    }
    protected void restarDinero(int valor){
        this.dineroTotal = dineroTotal-valor;
    }
    protected void sumarDinero(int valor){
        this.dineroTotal = dineroTotal+valor;
    }
    
}
