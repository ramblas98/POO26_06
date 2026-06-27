/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_ejercicio6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author Pc
 */
public class BibliotecaPersonal {
    private ArrayList<Lectura> coleccion = new ArrayList<>();
    
    public BibliotecaPersonal(){}
   
    
    public void ordenarBiblioteca(){
        Collections.sort(coleccion);
    }
    
    
    public void agregarLectura(Lectura nuevaLectura){
        //if(coleccion.isEmpty()) coleccion.add(nuevaLectura);
        boolean agregado = true;
        for(Lectura l: coleccion){
            if(l.getTitulo().equalsIgnoreCase(nuevaLectura.getTitulo())){
               
               agregado = false;
            }
        }
        if(agregado == true){
           coleccion.add(nuevaLectura);
           System.out.println("Se agrego exitosamente");
        } else System.out.println("Ya existe esta Lectura");
        
    }
    
    public void eliminarObraPorTitulo(String titulo){
        Iterator<Lectura> it = this.coleccion.iterator();
        boolean encont = false;
        
        while(it.hasNext() && !encont){
            Lectura l = it.next();
            if(l.getTitulo().equalsIgnoreCase(titulo)) coleccion.remove(l);
        }
       
    }
    
   
    
    public void eliminarObraPorAutor(String autor){
        ArrayList<Lectura> eliminados = new ArrayList<>();
        
        for(Lectura l: coleccion){
            if(l.getAutor().equalsIgnoreCase(autor)){
                eliminados.add(l);
            }
        }   
        coleccion.removeAll(eliminados);
        System.out.println("\nCantidad de Obras eliminadas del autor " +autor+": " + eliminados.size());
    }
   
    public Lectura obtenerLecturaMayor(){
        if(coleccion.isEmpty()){
            System.out.println("La lista esta vacia");
            return null;
        }
        Lectura mayor = coleccion.get(0);
        for(Lectura l: coleccion){
            //mayor = (l.getCalificacion() > mayor.getCalificacion()) ? l : mayor;
            if(l.getCalificacion() > mayor.getCalificacion()){
                mayor = l;
            }
        }
        return mayor;
    }
    
    public Lectura obtenerLecturaMenor(){
        if(coleccion.isEmpty()){
            System.out.println("La lista esta vacia");
            return null;
        }
        Lectura menor = coleccion.get(0);
        for(Lectura l: coleccion){
            if(l.getCalificacion() < menor.getCalificacion()){
                menor = l;
            }
        }
        return menor;
    }
    
    public void mostrarResumen(){
       if(coleccion.isEmpty()) System.out.println("\nLa lista esta vacia");
       for(Lectura l: coleccion){
           System.out.println(l.resumen());
           System.out.println("~~~~~~~~~~~~~~~~");
       }
    }
    
    public int tiempoTotalEstimado(){
        int suma=0;
        for(Lectura l: coleccion){
            suma += l.tiempoEstimadoLectura();
        }
        return suma;
    }

    public HashSet<String> obtenerTitulosLeidos(){
        HashSet<String> lista = new HashSet<>();
    
        for(Lectura l: coleccion ){
            lista.add(l.getTitulo()) ;
        }
     return lista;   
    }
    
    
    public LinkedHashSet<Lectura> obtenerHistorialDeLectura(){
        LinkedHashSet<Lectura> historial = new LinkedHashSet<>();
        
        for(Lectura l: coleccion){
            historial.add(l);
        }
        
        return historial;
    }
    
    
    public TreeSet<Lectura> listarLecturasPorCalificacion(){
        TreeSet lecturasPorCalificacion = new TreeSet<>(Comparator.reverseOrder());
        
        for(Lectura l: coleccion){
            lecturasPorCalificacion.add(l.getCalificacion());
        }
        
        return lecturasPorCalificacion;
    }
    
    public TreeSet<Lectura> listarLecturasPorTiempoEstimado(){
        TreeSet<Lectura> lecturasPorTiempoEstimado = new TreeSet<>(new ComparaLectura());
        
        for(Lectura l: coleccion){
            lecturasPorTiempoEstimado.add(l);
        }
        
         for(Lectura lec: lecturasPorTiempoEstimado){
            System.out.println("Titulo: " + lec.getTitulo() +
                    "| TIEMPO ESTIMADO: " + lec.tiempoEstimadoLectura());
        }
        
        
        
        return lecturasPorTiempoEstimado;
    }
    
    //Indicar si todas Las Lecturas Gustaron? 
    
}//Cierre de clase 
