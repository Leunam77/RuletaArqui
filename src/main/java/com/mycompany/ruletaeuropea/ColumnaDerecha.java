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
public class ColumnaDerecha extends Apuesta{

    protected Stack<Integer> bolsaApuestas;
    public ColumnaDerecha() {
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
        int[] listaValido = {3,6,9,12,15,18,21,24,27,30,33,36};
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
