/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_ejercicio6;

import java.util.Objects;

/**
 *
 * @author Pc
 */
public abstract class Lectura implements Comparable<Lectura> {

    private String titulo;
    private String autor;
    private int totalPaginas;
    private int calificacion;

    public Lectura() {
    }

    public Lectura(String titulo, String autor, int totalPaginas, int calificacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.calificacion = calificacion;
    }

    @Override
    public int compareTo(Lectura o) {
        Lectura l = (Lectura) o;
        
        //return this.calificacion - o.calificacion;
        return o.calificacion - this.calificacion ;
    }
    //Collections.reverse(lista) --Da vuelta la lista
    
   /* 
    @Override
    public int compareTo(Lectura o) {
        Lectura l = (Lectura) o;
        return this.autor.compareTo(o.autor);
    }
     */
    
    
    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getTotalPaginas() {
        return this.totalPaginas;
    }

    public int getCalificacion() {
        return this.calificacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public abstract String resumen();

    public abstract int tiempoEstimadoLectura();

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.titulo);
        return hash;
    }

    
  
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final Lectura other = (Lectura) obj;
        return Objects.equals(this.titulo, other.titulo);
    }
    
    

}//Fin de la clase Lectura
