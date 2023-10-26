/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ruletaeuropea;

/**
 *
 * @author jmanu
 */
public class Casilla extends CasillaApuesta{
    private NumeroColorido plenoMesa;
    public Casilla(int x1, int y1, int x2, int y2, String tipo, NumeroColorido plenoMesa) {
        super(x1,y1,x2,y2,tipo);
        this.plenoMesa = plenoMesa;
    }
    protected NumeroColorido getPlenoMesa(){
        return this.plenoMesa;
    }
}
