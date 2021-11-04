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
public class Perro extends AnimalTerrestre{
    String colorCollar;

    public Perro(String colorCollar) {
        this.colorCollar = colorCollar;
    }

    public Perro(String colorCollar, int numeroPatas) {
        super(numeroPatas);
        this.colorCollar = colorCollar;
    }

    public Perro(String colorCollar, int numeroPatas, String nombre, String lugarOrigen, String color) {
        super(numeroPatas, nombre, lugarOrigen, color);
        this.colorCollar = colorCollar;
    }

    public String getColorCollar() {
        return colorCollar;
    }

    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    
    public void hscerTrucos(){
        System.out.println("Estoy haciendo trucos");
    }

    @Override
    public String toString() {
        return "Perro{" + "colorCollar=" + colorCollar + '}';
    }
    
}
