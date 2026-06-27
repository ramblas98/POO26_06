/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_ejercicio6;

/**
 *
 * @author Pc
 */
public class Libro extends Lectura{
    private Genero genero;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int totalPaginas, int calificacion, Genero genero, int anioPublicacion) {
        super(titulo, autor, totalPaginas, calificacion);
        this.genero = genero;
        this.anioPublicacion = anioPublicacion;
    }

    public Libro() {
    }

    public Libro(Genero genero, int anioPublicacion) {
        this.genero = genero;
        this.anioPublicacion = anioPublicacion;
    }

    

    public Genero getGenero() {
        return genero;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    
    @Override
    public String resumen(){
        String clasico;
        if(anioPublicacion<2000){
            clasico= "SI";
        }
        else clasico= "NO";
        
        return "\nLibro: " + getTitulo() +
               "\nAutor: " + getAutor() +
               "\nGenero: " + genero +
               "\nAnio: " + anioPublicacion +
               "\nClasico: " + clasico +
               "\nCalificacion: " + getCalificacion(); 
    }
    
    @Override
    public int tiempoEstimadoLectura(){
        return getTotalPaginas()/50; 
    }    
}
