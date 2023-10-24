/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ruletaeuropea;
import java.util.ArrayList;
/**
 *
 * @author jmanu
 */
public class Juego {
    private Mesa mesaJuego;
    private int seleccionFicha;
    
    public Juego() {
        this.mesaJuego = new Mesa();
        seleccionFicha = 0;
    }
    public Mesa getmesaJuego(){
        return this.mesaJuego;
    }
    public void setSeleccionFicha(int valor){
        this.seleccionFicha = valor;
        System.out.println("SeleccionFicha: " + seleccionFicha);
    }
    
}
