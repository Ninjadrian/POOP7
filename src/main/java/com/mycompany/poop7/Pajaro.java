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
public class Pajaro extends AnimalAereo{
    String tipoPico;

    public Pajaro() {
    }

    public Pajaro(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    public Pajaro(String tipoPico, int numeroAlas) {
        super(numeroAlas);
        this.tipoPico = tipoPico;
    }

    public Pajaro(String tipoPico, int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(numeroAlas, nombre, lugarOrigen, color);
        this.tipoPico = tipoPico;
    }

    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    public void recolectarRamas(){
        System.out.println("Estoy recolectando ramas");
    }

    @Override
    public String toString() {
        return "Pajaro{" + "tipoPico=" + tipoPico + '}';
    }
    
}
