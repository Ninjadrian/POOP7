/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop7;

/**
 *
 * @author lenovo
 */
public class Ballena extends AnimalAcuatico{
    int largo;

    public Ballena() {
    }

    public Ballena(int largo, String nombre, String lugarOrigen, String color, int numeroAletas) {
        super(nombre, lugarOrigen, color, numeroAletas);
        this.largo = largo;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    public void pelearConPinocho(){
        System.out.println("Estoy peleando con pinocho");
    }
    
    @Override
    public void comer(){
        System.out.println("Voy a comer vegetales");
    }

    @Override
    public String toString() {
        return "Ballena{" + "largo=" + largo + '}';
    }

    
    
    
}
