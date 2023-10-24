/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ruletaeuropea;

/**
 *
 * @author jmanu
 */
public class FichaApuesta {
    private int cantidadFicha;
    private int montoFicha;

    public FichaApuesta(int cantidadFichas, int montoFicha) {
        this.cantidadFicha = cantidadFichas;
        this.montoFicha = montoFicha;
    }
    public int getCantidadFicha(){
        return   this.cantidadFicha;
    }
    public int getMontoFicha(){
        return   this.montoFicha;
    }
}
