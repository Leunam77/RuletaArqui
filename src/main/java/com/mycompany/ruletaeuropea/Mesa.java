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
public class Mesa{
    private ArrayList<Casilla> listaCasilla = new ArrayList<Casilla>(){{
        add(new Casilla(23,254,97,31,"pleno", new NumeroColorido(0,"verde")));
        add(new Casilla(103,254,153,182,"pleno",new NumeroColorido(1,"rojo")));
        add(new Casilla(103,178,153,107,"pleno",new NumeroColorido(2,"negro")));
        add(new Casilla(103,101,153,31,"pleno",new NumeroColorido(3,"rojo")));
        add(new Casilla(157,254,207,182,"pleno",new NumeroColorido(4,"negro")));
        add(new Casilla(157,178,207,107,"pleno",new NumeroColorido(5,"rojo")));
        add(new Casilla(157,101,207,31,"pleno",new NumeroColorido(6,"negro")));
        add(new Casilla(212,254,262,182,"pleno",new NumeroColorido(7,"rojo")));
        add(new Casilla(212,178,262,107,"pleno",new NumeroColorido(8,"negro")));
        add(new Casilla(212,101,262,31,"pleno",new NumeroColorido(9,"rojo")));
        add(new Casilla(267,254,316,182,"pleno",new NumeroColorido(10,"negro")));
        add(new Casilla(267,178,316,107,"pleno",new NumeroColorido(11,"negro")));
        add(new Casilla(267,101,316,31,"pleno",new NumeroColorido(12,"rojo")));
        add(new Casilla(322,254,371,182,"pleno",new NumeroColorido(13,"negro")));
        add(new Casilla(322,178,371,107,"pleno",new NumeroColorido(14,"rojo")));
        add(new Casilla(322,101,371,31,"pleno",new NumeroColorido(15,"negro")));
        add(new Casilla(377,254,426,182,"pleno",new NumeroColorido(16,"rojo")));
        add(new Casilla(377,178,426,107,"pleno",new NumeroColorido(17,"negro")));
        add(new Casilla(377,101,426,31,"pleno",new NumeroColorido(18,"rojo")));
        
        add(new Casilla(432,254,481,182,"pleno",new NumeroColorido(19,"rojo")));
        add(new Casilla(432,178,481,107,"pleno",new NumeroColorido(20,"negro")));
        add(new Casilla(432,101,481,31,"pleno",new NumeroColorido(21,"rojo")));
        add(new Casilla(486,254,536,182,"pleno",new NumeroColorido(22,"negro")));
        add(new Casilla(486,178,536,107,"pleno",new NumeroColorido(23,"rojo")));
        add(new Casilla(486,101,536,31,"pleno",new NumeroColorido(24,"negro")));
        add(new Casilla(542,254,590,182,"pleno",new NumeroColorido(25,"rojo")));
        add(new Casilla(542,178,590,107,"pleno",new NumeroColorido(26,"negro")));
        add(new Casilla(542,101,590,31,"pleno",new NumeroColorido(27,"rojo")));
        add(new Casilla(596,254,646,182,"pleno",new NumeroColorido(28,"negro")));
        add(new Casilla(596,178,646,107,"pleno",new NumeroColorido(29,"negro")));
        add(new Casilla(596,101,646,31,"pleno",new NumeroColorido(30,"rojo")));
        add(new Casilla(652,254,701,182,"pleno",new NumeroColorido(31,"negro")));
        add(new Casilla(652,178,701,107,"pleno",new NumeroColorido(32,"rojo")));
        add(new Casilla(652,101,701,31,"pleno",new NumeroColorido(33,"negro")));
        add(new Casilla(705,254,756,182,"pleno",new NumeroColorido(34,"rojo")));
        add(new Casilla(705,178,756,107,"pleno",new NumeroColorido(35,"negro")));
        add(new Casilla(705,101,756,31,"pleno",new NumeroColorido(36,"rojo")));
    }};
    
    private ArrayList<CasillaApuesta> listaCasillaApuesta = new ArrayList<CasillaApuesta>(){{
        add(new CasillaApuesta(103,312,316,260,"primerDoce"));
        add(new CasillaApuesta(322,312,536,260,"segundoDoce"));
        add(new CasillaApuesta(542,312,756,260,"terceDoce"));
        add(new CasillaApuesta(103,368,207,316,"unoYDieciocho"));
        add(new CasillaApuesta(652,368,756,316,"diecinueveTreintaYSeis"));
        add(new CasillaApuesta(212,368,316,316,"impar"));
        add(new CasillaApuesta(542,368,646,316,"par"));
        add(new CasillaApuesta(322,368,426,316,"rojo"));
        add(new CasillaApuesta(432,368,536,316,"negro"));
        add(new CasillaApuesta(761,254,810,182,"columnaIzquierda"));
        add(new CasillaApuesta(761,178,810,107,"columnaCentral"));
        add(new CasillaApuesta(761,101,810,31,"columnaDerecha"));
    }};
    
    private Rojo apuestaRojo;
    private Negro apuestaNegro;
    private Pleno apuestaPleno;
    

    public Mesa() {
        //this.apuestaRojo = apuestaRojo;
        //this.apuestaNegro = apuestaNegro;
    }
    public NumeroColorido buscarApuestaPleno(int x, int y){
        NumeroColorido res = new NumeroColorido(0, "");
        for (int i = 0; i < listaCasilla.size();i++) {
            int x1 = listaCasilla.get(i).getx1();
            int x2 = listaCasilla.get(i).getx2();
            int y1 = listaCasilla.get(i).gety1();
            int y2 =  listaCasilla.get(i).gety2();
            if((x >= x1 && x <= x2) && (y >= y2 && y <= y1)){
                res = listaCasilla.get(i).getPlenoMesa();
                i = listaCasilla.size()+1;
            }
        }
        return res ;
    }
    public String buscarApuestaEspecial(int x, int y){
        String res = "";
        for (int i = 0; i < listaCasillaApuesta.size();i++) {
            int x1 = listaCasillaApuesta.get(i).getx1();
            int x2 = listaCasillaApuesta.get(i).getx2();
            int y1 = listaCasillaApuesta.get(i).gety1();
            int y2 =  listaCasillaApuesta.get(i).gety2();
            if((x >= x1 && x <= x2) && (y >= y2 && y <= y1)){
                res = listaCasillaApuesta.get(i).getTipo();
                i = listaCasilla.size()+1;
            }
        }
        return res ;
    }
    public String buscarCasilla(int x, int y){
        String res = "";
        if((x >=23  && x <= 756) && (y >= 31 && y <= 254)){
               NumeroColorido pleno = buscarApuestaPleno(x, y);
               res = "Color: " + pleno.getColor() + " Numero: " + pleno.getNumero();
        }else{
            res = buscarApuestaEspecial(x, y);
        }
        return res;
    }
    
}
