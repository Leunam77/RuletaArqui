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
        this.casillaGenerada = new NumeroColorido(0,"");
        this.listaCasillas = new ArrayList<NumeroColorido>(37);
        this.semillaRandom = new Random(new Date().getTime());
  
        listaCasillas.add(new NumeroColorido(0, "verde"));
        listaCasillas.add(new NumeroColorido(1, "rojo"));
        listaCasillas.add(new NumeroColorido(2, "negro"));
        listaCasillas.add(new NumeroColorido(3, "rojo"));
        listaCasillas.add(new NumeroColorido(4, "negro"));
        listaCasillas.add(new NumeroColorido(5, "rojo"));
        listaCasillas.add(new NumeroColorido(6, "negro"));
        listaCasillas.add(new NumeroColorido(7, "rojo"));
        listaCasillas.add(new NumeroColorido(8, "negro"));
        listaCasillas.add(new NumeroColorido(9, "rojo"));
        listaCasillas.add(new NumeroColorido(10, "negro"));
        listaCasillas.add(new NumeroColorido(11, "negro"));
        listaCasillas.add(new NumeroColorido(12, "rojo"));
        listaCasillas.add(new NumeroColorido(13, "negro"));
        listaCasillas.add(new NumeroColorido(14, "rojo"));
        listaCasillas.add(new NumeroColorido(15, "negro"));
        listaCasillas.add(new NumeroColorido(16, "rojo"));
        listaCasillas.add(new NumeroColorido(17, "negro"));
        listaCasillas.add(new NumeroColorido(18, "rojo"));
        listaCasillas.add(new NumeroColorido(19, "rojo"));
        listaCasillas.add(new NumeroColorido(20, "negro"));
        listaCasillas.add(new NumeroColorido(21, "rojo"));
        listaCasillas.add(new NumeroColorido(22, "negro"));
        listaCasillas.add(new NumeroColorido(23, "rojo"));
        listaCasillas.add(new NumeroColorido(24, "negro"));
        listaCasillas.add(new NumeroColorido(25, "rojo"));
        listaCasillas.add(new NumeroColorido(26, "negro"));
        listaCasillas.add(new NumeroColorido(27, "rojo"));
        listaCasillas.add(new NumeroColorido(28, "negro"));
        listaCasillas.add(new NumeroColorido(29, "negro"));
        listaCasillas.add(new NumeroColorido(30, "rojo"));
        listaCasillas.add(new NumeroColorido(31, "negro"));
        listaCasillas.add(new NumeroColorido(32, "rojo"));
        listaCasillas.add(new NumeroColorido(33, "negro"));
        listaCasillas.add(new NumeroColorido(34, "rojo"));
        listaCasillas.add(new NumeroColorido(35, "negro"));
        listaCasillas.add(new NumeroColorido(36, "rojo"));
    }
    public int generadorNumero(){
        int numeroGenerado = 0;
        numeroGenerado = semillaRandom.nextInt(37);
        JOptionPane.showMessageDialog(null, "El numero es: " + numeroGenerado);
        return numeroGenerado;
    }
}
