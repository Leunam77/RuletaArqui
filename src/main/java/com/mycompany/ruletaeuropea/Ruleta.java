/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jmanu
 */
package com.mycompany.ruletaeuropea;
import java.util.ArrayList;
import java.util.Random;
import java.util.Date;
import javax.swing.JOptionPane;

public class Ruleta {
    private NumeroColorido casillaGenerada;
    private ArrayList<NumeroColorido> listaCasillas;
    private Random semillaRandom;
    public Ruleta(){
        this.listaCasillas = new ArrayList<NumeroColorido>(37);
        this.semillaRandom = new Random(new Date().getTime());
        
        listaCasillas.add(new NumeroColorido(0, "verde"));
        for(int i = 1; i < 37;i++){
            if(i > 0 && i < 11){
                if(i % 2 != 0){
                    listaCasillas.add(new NumeroColorido(i, "rojo"));
                }else{
                    listaCasillas.add(new NumeroColorido(i, "negro"));
                }
            }else if(i > 10 && i < 19){
                if(i % 2 != 0){
                    listaCasillas.add(new NumeroColorido(i, "negro"));
                }else{
                    listaCasillas.add(new NumeroColorido(i, "rojo"));
                }
            }else if(i > 18 && i < 29){
                if(i % 2 != 0){
                    listaCasillas.add(new NumeroColorido(i, "rojo"));
                }else{
                    listaCasillas.add(new NumeroColorido(i, "negro"));
                }
            }else{
                if(i % 2 != 0){
                    listaCasillas.add(new NumeroColorido(i, "negro"));
                }else{
                    listaCasillas.add(new NumeroColorido(i, "rojo"));
                }
            }
        }
    }
    public int generadorNumero(){
        int numeroGenerado = 0;
        numeroGenerado = semillaRandom.nextInt(37);
        JOptionPane.showMessageDialog(null, "El numero es: " + listaCasillas.get(numeroGenerado).getNumero()
        + "El color es: " + listaCasillas.get(numeroGenerado).getColor());
        return numeroGenerado;
    }
}
