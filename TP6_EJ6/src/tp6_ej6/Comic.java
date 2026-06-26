/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_ej6;

/**
 *
 * @author alumno
 */
public class Comic extends Lectura {
    private String dibujante;
    private boolean color;

    public Comic() {
    }

    public Comic(String dibujante, boolean color) {
        this.dibujante = dibujante;
        this.color = color;
    }

    public Comic(String titulo, String autor, int totalPaginas, int calificacion, String dibujante, boolean color) {
        super(titulo, autor, totalPaginas, calificacion);
        this.dibujante = dibujante;
        this.color = color;
    }

    public String  getDibujante()           { return dibujante; }
    public void    setDibujante(String d)   { this.dibujante = d; }
 
    public boolean isColor(){return color;}
    public void setAcolor(){ this.color = true; }
    public void setBlacoYNegro(){ this.color = false; }
 
    
    @Override
    public String resumen(){
        return "Comic: "      + getTitulo()
             + " | Autor: "   + getAutor()
             + " | Páginas: " + getTotalPaginas()
             + " | Calificación: " + getCalificacion()
             + " | Dibujante: "    + dibujante
             + " | Color: "        + (color ? "True" : "False");
    }
    
    @Override
    public int tiempoEstimadoLectura(){
       return getTotalPaginas()/100;
    }
}
