/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ruletaeuropea;
/**
 *
 * @author jmanu
 */
public class Juego implements Jugada{
    private Mesa mesaJuego;
    private int seleccionFicha;
    protected Jugador jugador;
    protected boolean apuestasCerradas;
    public Juego() {
        this.mesaJuego = new Mesa();
        this.seleccionFicha = 0;
        this.jugador = new Jugador("Juan Manuel",5000,0);
        this.apuestasCerradas = false;
    }
    
    @Override
    public Mesa getmesaJuego(){
        return this.mesaJuego;
    }
    @Override
    public void setSeleccionFicha(int valor){
        this.seleccionFicha = valor;
        System.out.println("SeleccionFicha: " + seleccionFicha);
    }
    @Override
    public void buscarApuesta(int x, int y){
        mesaJuego.buscarCasilla(x, y);
    }
    @Override
    public void apostar(){
        FichaApuesta fichaActual = new FichaApuesta(seleccionFicha, mesaJuego.apuestaRealizadaPleno.getPlenoMesa().getNumero());
        System.out.println("Apuesta Actual hecha:" + fichaActual.getMontoFicha() + fichaActual.getNumeroPleno());
        if(seleccionFicha == 1 || seleccionFicha == 5 || seleccionFicha==10 || seleccionFicha==20 || seleccionFicha==50){

            if(mesaJuego.esSeleccionEspcial == false){
                if(mesaJuego.apuestaRealizadaPleno.tipo.equals("pleno")){
                    mesaJuego.apuestaPleno.insertarApuesta(fichaActual);
                    jugador.restarDinero(fichaActual.getMontoFicha());
                }
            }else{
                if(mesaJuego.apuestaEspecial.tipo.equals("rojo")) {
                    mesaJuego.apuestaRojo.insertarApuesta(seleccionFicha);
                    jugador.restarDinero(fichaActual.getMontoFicha());
                } else if (mesaJuego.apuestaEspecial.tipo.equals("negro")) {
                    mesaJuego.apuestaNegro.insertarApuesta(seleccionFicha);
                    jugador.restarDinero(fichaActual.getMontoFicha());
                } else if (mesaJuego.apuestaEspecial.tipo.equals("par")) {
                    mesaJuego.apuestaPar.insertarApuesta(seleccionFicha);
                    jugador.restarDinero(fichaActual.getMontoFicha());
                } else if (mesaJuego.apuestaEspecial.tipo.equals("impar")) {
                    mesaJuego.apuestaImpar.insertarApuesta(seleccionFicha);
                    jugador.restarDinero(fichaActual.getMontoFicha());
                } else if (mesaJuego.apuestaEspecial.tipo.equals("primerDoce")) {
                    mesaJuego.apuestaPrimerDoce.insertarApuesta(seleccionFicha);
                    jugador.restarDinero(fichaActual.getMontoFicha());
                } else if (mesaJuego.apuestaEspecial.tipo.equals("segundoDoce")) {
                    mesaJuego.apuestaSegundoDoce.insertarApuesta(seleccionFicha);
                    jugador.restarDinero(fichaActual.getMontoFicha());
                } else if (mesaJuego.apuestaEspecial.tipo.equals("tercerDoce")) {
                    mesaJuego.apuestaTercerDoce.insertarApuesta(seleccionFicha);
                    jugador.restarDinero(fichaActual.getMontoFicha());
                } else if (mesaJuego.apuestaEspecial.tipo.equals("unoYDieciocho")) {
                    mesaJuego.apuesta118.insertarApuesta(seleccionFicha);
                    jugador.restarDinero(fichaActual.getMontoFicha());
                } else if (mesaJuego.apuestaEspecial.tipo.equals("diecinueveTreintaYSeis")) {
                    mesaJuego.apuesta1936.insertarApuesta(seleccionFicha);
                    jugador.restarDinero(fichaActual.getMontoFicha());
                } else if (mesaJuego.apuestaEspecial.tipo.equals("columnaIzquierda")) {
                    mesaJuego.apuestaColIz.insertarApuesta(seleccionFicha);
                    jugador.restarDinero(fichaActual.getMontoFicha());
                } else if (mesaJuego.apuestaEspecial.tipo.equals("columnaCentral")) {
                    mesaJuego.apuestaColCen.insertarApuesta(seleccionFicha);
                    jugador.restarDinero(fichaActual.getMontoFicha());
                } else if (mesaJuego.apuestaEspecial.tipo.equals("columnaDerecha")) {
                    mesaJuego.apuestaColDer.insertarApuesta(seleccionFicha);
                    jugador.restarDinero(fichaActual.getMontoFicha());
                }
            } 
        }else{
            System.out.println("Seleccione una ficha de apuesta");
        }
    }
    @Override
    public void limpiarApuestas(){
        this.mesaJuego.apuestaPleno.vaciarPila();
        this.mesaJuego.apuesta118.vaciarPila();
        this.mesaJuego.apuesta1936.vaciarPila();
        this.mesaJuego.apuestaColCen.vaciarPila();
        this.mesaJuego.apuestaColDer.vaciarPila();
        this.mesaJuego.apuestaColIz.vaciarPila();
        this.mesaJuego.apuestaImpar.vaciarPila();
        this.mesaJuego.apuestaNegro.vaciarPila();
        this.mesaJuego.apuestaPar.vaciarPila();
        this.mesaJuego.apuestaPrimerDoce.vaciarPila();
        this.mesaJuego.apuestaRojo.vaciarPila();
        this.mesaJuego.apuestaSegundoDoce.vaciarPila();
        this.mesaJuego.apuestaTercerDoce.vaciarPila();
        System.out.println("Apuestas vaciadas");
    }
}
