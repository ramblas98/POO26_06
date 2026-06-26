/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_ej6;

import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class BibliotecaPersonal {
    private List<Lectura> coleccion;

    public BibliotecaPersonal(){
        coleccion= new ArrayList<>();
    }
        
    
    public void agregarLectura(Lectura nuevaLectura){
        boolean encontrado=false;
        for(Lectura l : coleccion){
            if(l.getTitulo().equalsIgnoreCase(nuevaLectura.getTitulo())){
                System.out.println("Libro ya existente");
                encontrado=true;
            }
        }
        if(!encontrado){
            coleccion.add(nuevaLectura);
            System.out.println("Lbro agregado exitosamente");
        }
    }
    
    public void eliminarObraPorTitulo(String titulo){
        boolean encontrado=false;
        for( Lectura l : coleccion){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                encontrado=coleccion.remove(l);
                System.out.println("La obra " + titulo + " se elimino correctamente");
                break;
            }
        }
        if(!encontrado){
            System.out.println("El titulo " + titulo + " No existe");
        }
        
    }
    
    public void eliminarPorAutor(String autor){
        boolean encontrado=false;
        for(Lectura l : coleccion){
            encontrado=coleccion.remove(l);
            System.out.println("La obra de" + autor + " se elimino correctamente");
            break;
        }
        
        if(!encontrado){
            System.out.println("La obra de" + autor + " No encontrado");
        }
        
    }
    
    public Lectura obtenerLecturaMayor(){
        if(coleccion.isEmpty()){
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
        for(Lectura l: coleccion){
            System.out.println(l.resumen());
        }
    }
    
    public int tiempoTotalEstimado(){
        int suma=0;
        for(Lectura l: coleccion){
            suma+=l.tiempoEstimadoLectura();
        }
        return suma; 
    }
    
    public void ordenarPorCalificacion(){
        Collections.sort(coleccion);
    }
    
    public void ordenarPorPaginas(){
        Collections.sort(coleccion);
    }
    
    public HashSet<String> obtenerTitulosLeidos(){
        HashSet<String> titulosLeidos = new HashSet<>();
        for(Lectura l: coleccion){
            titulosLeidos.add(l.getTitulo());
        }
        return titulosLeidos;
    }
    
    public LinkedHashSet<Lectura> obtenerHistorialDeLectura(){
        return new LinkedHashSet<>(coleccion);
    }
    
    public TreeSet<Lectura> listarLecturasPorCalificacion(){
        return new TreeSet<>(coleccion);
    }
    
    public TreeSet<Lectura> listarLecturaPorTiempoEstimado(){
        TreeSet<Lectura> set = new TreeSet<>
    }
}
