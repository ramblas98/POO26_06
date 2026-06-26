/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_ej6;

/**
 *
 * @author alumno
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

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public int getCalificacion() {
        return calificacion;
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
    public int compareTo(Lectura otra){
        return this.totalPaginas - otra.totalPaginas;
    }
    
}
