/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ruletaeuropea;

/**
 *
 * @author jmanu
 */
public class CasillaApuesta{
    protected int x1,x2,y1,y2;
    protected String tipo;
    public CasillaApuesta(int x1, int y1, int x2, int y2, String tipo) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.tipo = tipo;
    }
    protected int getx1(){
        return this.x1;
    }
    protected int getx2(){
        return this.x2;
    }
    protected int gety1(){
        return this.y1;
    }
    protected int gety2(){
        return this.y2;
    }
    protected void vaciarContenido(){
        this.tipo = "";
    }
}
