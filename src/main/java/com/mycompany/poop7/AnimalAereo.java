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
public class AnimalAereo extends Animal{
    int numeroAlas;

    public AnimalAereo() {
    }

    public AnimalAereo(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }

    public AnimalAereo(int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }

    public int getNumeroAlas() {
        return numeroAlas;
    }

    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }
    
    public void volar(){
        System.out.println("Estoy volando");
    }
    
    @Override
    public void comer(){
        System.out.println("Voy a comer semillas");
    }

    @Override
    public String toString() {
        return "AnimalAereo{" + "numeroAlas=" + numeroAlas + '}';
    }
    
}
