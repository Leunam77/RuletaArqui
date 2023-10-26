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
public class Pleno extends Apuesta{
protected Stack<FichaApuesta> bolsaApuestas;
    public Pleno() {
        bolsaApuestas = new Stack<FichaApuesta>();
    }
    @Override
    protected int calcularApuesta(NumeroColorido casillaGanadora){
        int apuesta = 0;
            while (!bolsaApuestas.isEmpty()) {
                if (casillaGanadora.getNumero() == bolsaApuestas.peek().getNumeroPleno()) {
                    int monto = bolsaApuestas.firstElement().getMontoFicha();
                    apuesta += monto * 35;
                }
                bolsaApuestas.pop();
            }
        return apuesta;
    }
    protected void insertarApuesta(FichaApuesta ficha){
        this.bolsaApuestas.push(ficha);
    }
    protected String contenido(){
        String res = "";
        Stack<FichaApuesta> copia = new Stack<FichaApuesta>();
        copia.addAll(bolsaApuestas);
        while(!copia.isEmpty()){
            res += "[" + Integer.toString(copia.peek().getMontoFicha()) + " ; " + Integer.toString(copia.peek().getNumeroPleno()) + "]";
            copia.pop();
        }
        return res;
    }
    protected void vaciarPila(){
        this.bolsaApuestas.clear();
    }
}
