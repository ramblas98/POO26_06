/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6;

public abstract class Lectura implements Comparable<Lectura>{
    
    private String titulo;
    private String autor;
    private int    totalPaginas;
    private int calificacion; 
 
    // Constructor 
    public Lectura() {
    }
    
    public Lectura(String titulo, String autor, int totalPagina, int calificacion) {
        this.titulo       = titulo;
        this.autor        = autor;
        this.totalPaginas   = totalPagina;
        setCalificacion(calificacion);
    }
 
    // Getters y setters 
    public String getTitulo()             { return titulo; }
    public String getAutor()              { return autor; }
    public int getTotalPaginas()            { return totalPaginas; }
    public int getCalificacion()       { return calificacion; }
    
    public void setTitulo(String t)       { this.titulo = t; }
    public void setAutor(String a)        { this.autor = a; }
    public void setTotalPagina(int n)      { this.totalPaginas = n; }
    public void setCalificacion(int c) {
        if (c < 0)  c = 0;
        if (c > 10) c = 10;
        this.calificacion = c;
    }
    
    // Métodos abstractos
    public abstract String resumen();
 
    public abstract int tiempoEstimadoLectura();
    
 
    @Override
    public String toString() {
        return resumen();
    }

    // equals() — 5 pasos vistos en teoría
    @Override
    public boolean equals(Object obj) {
        // Paso 1: misma referencia
        if (this == obj) return true;
        // Paso 2: referencia nula
        if (obj == null) return false;
        // Paso 3: misma clase
        if (getClass() != obj.getClass()) return false;
        // Paso 4: casteo seguro
        Lectura otra = (Lectura) obj;
        // Paso 5: comparar campo clave (titulo, ignorando mayusculas)
        return this.titulo.equalsIgnoreCase(otra.titulo);
    }

    @Override
    public int hashCode() {
        return titulo.toLowerCase().hashCode();
    }

    // Comparable: orden natural por calificacion de mayor a menor
    @Override
    public int compareTo(Lectura otra) {
        return Integer.compare(otra.getCalificacion(), this.getCalificacion());
    }
}