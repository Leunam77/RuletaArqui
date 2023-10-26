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
protected Stack<Integer> bolsaApuestas;
    public TercerDoce() {
        bolsaApuestas = new Stack<>();
    }
    @Override
    protected int calcularApuesta(NumeroColorido casillaGanadora){
        int apuesta = 0;
        if(casillaGanadora.getNumero() >= 25 && casillaGanadora.getNumero() <= 36){
            while (!bolsaApuestas.isEmpty()) {
                int monto = bolsaApuestas.firstElement();
                apuesta += monto * 2;
                bolsaApuestas.pop();
            }
        }
        return apuesta;
    }
    protected void insertarApuesta(int apuesta){
        this.bolsaApuestas.push((Integer)apuesta);
    }
    protected String contenido(){
        String res = "";
        Stack<Integer> copia = new Stack<>();
        copia.addAll(bolsaApuestas);
        while(!copia.isEmpty()){
            res += "[" + copia.peek() + " , " + "]";
            copia.pop();
        }
        return res;
    }
    protected void vaciarPila(){
        this.bolsaApuestas.clear();
    }
}
