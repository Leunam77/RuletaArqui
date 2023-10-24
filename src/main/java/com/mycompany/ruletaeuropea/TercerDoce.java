/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ruletaeuropea;

import java.util.Stack;

/**
 *
 * @author jmanu
 */
public class TercerDoce extends Apuesta {
protected Stack<FichaApuesta> bolsaApuestas;
    public TercerDoce() {
        bolsaApuestas = new Stack<>();
    }
    @Override
    protected int calcularApuesta(){
        int resultado = 0;
        int apuesta = 0;
        while(bolsaApuestas.isEmpty()){
            int monto = bolsaApuestas.firstElement().getMontoFicha();
            int cantidad = bolsaApuestas.firstElement().getCantidadFicha();
            apuesta += monto*cantidad*2;
            bolsaApuestas.pop();
        }
        return resultado;
    }
}
