/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6;

import java.util.Comparator;

public class ComparaLectura implements Comparator{
    @Override
    public int compare(Object o1,Object o2){
        Lectura l1 = (Lectura)o1;
        Lectura l2 = (Lectura)o2;
    
    return Integer.compare(l1.tiempoEstimadoLectura(), l2.tiempoEstimadoLectura()); 
    }
}
