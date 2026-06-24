/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_4_tp4;

import java.util.Comparator;

/**
 *
 * @author USUARIO
 */
public class ComparaAutoCombustible implements Comparator{
    @Override
    public int compare(Object o1, Object o2){
        Auto a1 = (Auto) o1;
        Auto a2 = (Auto) o2;
        double combustible1 = a1.getCombustible();
        double combustible2 = a2.getCombustible();
        
        return Double.compare(combustible2, combustible1);
        
        /*if(combustible1==combustible2){
            return 0;
        }else if(combustible1>combustible2) return 1;
        else return -1; */
    }
}
