/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_ejercicio6;

import java.util.Comparator;

/**
 *
 * @author Pc
 */
public class ComparaLectura implements Comparator<Lectura> {
    
    
    @Override
    public int compare(Lectura o1,Lectura o2){
       // Lectura l1 = (Lectura)o1;
        //Lectura l2 = (Lectura)o2;
    
    return Integer.compare(o1.tiempoEstimadoLectura(), o2.tiempoEstimadoLectura());
      }
}

    /*
    @Override
    public int compare(Object o1, Object o2){
        Lectura l1= (Lectura)o1 ;
        Lectura l2= (Lectura)o2;
       
       /* if(l1.getCalificacion() == l2.getCalificacion()) return 0;
        else if (l1.getCalificacion() < l2.getCalificacion()) return -1;
                else return 1;
        
        return Integer.compare(l1.getCalificacion(), l2.getCalificacion());*/
