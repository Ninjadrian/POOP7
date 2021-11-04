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
public class Main {
    public static void main(String[] args) {
        Empleado emp = new Empleado();
        System.out.println(emp);
        
        Gerente ger = new Gerente();
        System.out.println(ger);
        
        ger.setNombre("Raul Jimenez");
        ger.setNumEmpleado(587890);
        ger.setSueldo(25_000);
        System.out.println(ger);
        ger.aumentarSueldo(20);
        ger.asignarPresupuesto(50_000);
        System.out.println(ger);
        System.out.println("Nombre del gerente: "+ ger.getNombre());
        
        Gerente ger2 = new Gerente("Karen Avalos",596723,80_000,120_000);
        System.out.println(ger2);
        
        Gerente ger3 = new Gerente("Samanta Rios",956320,35_000);
        System.out.println(ger3);
        System.out.println("#############Instancias#############");
        
        if(ger3 instanceof Gerente){ //objeto ger3 es de la clase gerente
            System.out.println("Gerente es instancia de Gerente"); 
        }
        if(ger3 instanceof Empleado){
            System.out.println("Gerente es instancia de empleado");
        }
        if(ger instanceof Object){
            System.out.println("Gerente es instancia de object");
        }
        
        System.out.println("#############Ballena#############");
        Ballena ballena = new Ballena(16,"Sally","Subcontinente Indio", "gris", 2);
        System.out.println(ballena);
        
        System.out.println("#############Perro#############");
        Perro perro = new Perro("Azul",4,"Firulais", "Estados unidos","Blanco");
        System.out.println(perro);
        
        System.out.println("#############Pajaro#############");
        Pajaro pajaro = new Pajaro("Curvo",2,"Alita", "América del Sur", "Amerillo");
        System.out.println(pajaro);
    }
}
