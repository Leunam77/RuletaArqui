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
public class ColumnaCentral extends Apuesta {

    protected Stack<Integer> bolsaApuestas;
    public ColumnaCentral() {
        bolsaApuestas = new Stack<>();
    }
    @Override
    protected int calcularApuesta(NumeroColorido casillaGanadora){
        int apuesta = 0;
        boolean estaEnValidos = estaLista(casillaGanadora.getNumero());
        if(estaEnValidos){
            while (!bolsaApuestas.isEmpty()) {
                int monto = bolsaApuestas.firstElement();
                apuesta += monto * 2;
                bolsaApuestas.pop();
            }
        }
        return apuesta;
    }
    protected boolean estaLista(int numero){
        boolean res = false;
        int[] listaValido = {2,5,8,11,14,17,20,23,26,29,32,35};
        for(int valor : listaValido){
            if(numero == valor){
                res = true;
            }
        }
        return res;
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
