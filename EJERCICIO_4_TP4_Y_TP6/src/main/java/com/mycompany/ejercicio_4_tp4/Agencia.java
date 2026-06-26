/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio_4_tp4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author Administrador
 */
public class Agencia {
    private ArrayList<Auto> flota ;
    
    public Agencia() {
    this.flota = new ArrayList<Auto>();
    }
    
    public Agencia(ArrayList<Auto> flota) {
        this.flota = flota;
    }
    
    public void agregarAuto(Auto a){
        flota.add(a);
    }
    
    public HashSet<String> obtenerMarcasDisponibles(){ //Hashset hace la verificacion de la cadena y no va tener repetidos
        HashSet<String> c = new HashSet<String>();
        if(flota.isEmpty()){
            System.out.println("Inventario vacio, no hay vehiculos disponibles");
        } else {
            for(Auto a: flota){
                c.add(a.getMarca());
            }
        }
        return c;
    }
    
    public LinkedHashSet<Auto> obtenerFlotaPorOrdenDeIngreso(){
        LinkedHashSet<Auto> c = new LinkedHashSet<Auto>();
        if(flota.isEmpty()){
            System.out.println("Inventario vacio, no hay vehiculos disponibles");
        } else {
            for(Auto a: flota){
                c.add(a);
            }
        }
        return c;
    }
    
    public TreeSet<Auto> obtenerVehiculosOrdenadosPorPatente(){
        TreeSet<Auto> c = new TreeSet<Auto>();
        if(flota.isEmpty()){
            System.out.println("Inventario vacio, no hay vehiculos disponibles");
        } else {
            for(Auto a: flota){
                c.add(a);
            }
        }
        return c;
    }
    
    public TreeSet<Auto> obtenerVehiculosPorCostoDiario(){
        TreeSet<Auto> c = new TreeSet<Auto>(new ComparaAutoConsumo());
    
        if(flota.isEmpty()){
            System.out.println("Inventario vacio, no hay vehiculos disponibles");
        } else {
            for(Auto a: flota){
                c.add(a);
            }
        }
        return c;
    }
}
