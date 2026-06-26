/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6;

public class Revista extends Lectura{
    private int numeroEdicion;
    private Tematica tematica;
    
    public Revista(){
    }
    
    public Revista(int numeroEdicion, Tematica tematica){
        this.numeroEdicion = numeroEdicion;
        this.tematica = tematica;
    }
    
    public Revista(String titulo, String autor,int totalPaginas,int calificacion, int numeroEdicion, Tematica tematica){
        super(titulo,autor,totalPaginas,calificacion);
        this.numeroEdicion = numeroEdicion;
        this.tematica = tematica;
    }
    
    public int getNumEdicion(){
        return this.numeroEdicion;
    }
    
    public Tematica getTematica(){
        return this.tematica;
    }
    
    public void setNumEdicion(int nuevoNumEdicion){
        this.numeroEdicion = nuevoNumEdicion;
    }
    
    public void setTematica(Tematica nuevaTematica){
        this.tematica = nuevaTematica;
    }
    
    @Override
    public String resumen(){
        return "| Revista: "+ this.getTitulo() +
                "| Autor: " + this.getAutor() +
                "| Numero de Paginas: " + this.getTotalPaginas() +
                "| Calificacion: " + this.getCalificacion() +
                "| Numero de Edicion: " + this.numeroEdicion +
                "| Tematica: " + this.tematica;
    }
    
    
    @Override
    public int tiempoEstimadoLectura(){
        return this.getTotalPaginas() / 70;
    }

}