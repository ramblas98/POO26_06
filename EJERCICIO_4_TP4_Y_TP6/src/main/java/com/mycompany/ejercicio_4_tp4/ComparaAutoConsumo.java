/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio_4_tp4;

import java.util.Comparator;

/**
 *
 * @author Administrador
 */
public class ComparaAutoConsumo implements Comparator<Auto>{
    public int compare(Auto o1, Auto o2){
        Auto a1 = (Auto) o1;
        Auto a2 = (Auto) o2;
        
        double km = 100;
        
        return Double.compare(a1.consumo(km),a2.consumo(km)); //Forma de comparar Strings o cadenas
    }
}
