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
    private int monto;
    private int numeroPleno;

    public FichaApuesta(int monto, int numeroPleno) {
        this.monto = monto;
        this.numeroPleno = numeroPleno;
    }
    public int  getMontoFicha(){
        return this.monto;
    }
    public int  getNumeroPleno(){
        return this.numeroPleno;
    }
}
