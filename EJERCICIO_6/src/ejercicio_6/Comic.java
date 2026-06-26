/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6;

public class Comic extends Lectura{
    
    private String  dibujante;
    private boolean color;
 
    // Constructores
    public Comic() {
    }

    public Comic(String dibujante, boolean color) {
        this.dibujante = dibujante;
        this.color = color;
    }
    
    public Comic(String titulo, String autor, int totalPaginas, int calificacion, String dibujante, boolean color) {
        super(titulo, autor, totalPaginas, calificacion);
        this.dibujante = dibujante;
        this.color     = color;
    }
 
    // Getters y setters
    public String  getDibujante()           { return dibujante; }
    public void    setDibujante(String d)   { this.dibujante = d; }
 
    // Métodos abstractos
    @Override
    public int tiempoEstimadoLectura() {
        return getTotalPaginas() / 100;
    }
    
    @Override
    public String resumen() {
        return "| Comic: "      + getTitulo()
             + " | Autor: "   + getAutor()
             + " | Paginas: " + getTotalPaginas()
             + " | Calificacion: " + getCalificacion()
             + " | Dibujante: "    + dibujante
             + " | Color: "        + (color ? "True" : "False");
    }
}
