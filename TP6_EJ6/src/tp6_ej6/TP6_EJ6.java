/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6_ej6;

/**
 *
 * @author alumno
 */
public class TP6_EJ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BibliotecaPersonal biblio1= new BibliotecaPersonal();
        
        biblio1.agregarLectura(new Libro("Dias Sangriento","Ferlan Clomser", 212, 8, Genero.CIENCIA_FICCION, 1998));
        biblio1.agregarLectura(new Comic("Batman", "Garrel Bloom", 85, 7, "Michael Harrison", true));
        biblio1.agregarLectura(new Revista("Traje 2026", "Antoine Guniel", 90, 8, 3, Tematica.MODA));
        biblio1.agregarLectura(new Libro("La Niebla", "Stephen King", 189, 9,Genero.CIENCIA_FICCION, 1994));
        biblio1.agregarLectura(new Comic("Superman", "Mathew Collins", 48, 8, "Carl Shoper", true));
        biblio1.agregarLectura(new Revista("Polemica WandaGate", "Barabara Oliva", 59, 6, 2, Tematica.ACTUALIDAD));
        
        System.out.println("Resumen");
        biblio1.mostrarResumen();
        
        System.out.println("Ordenado por paginas");
        biblio1.ordenarPorPaginas();
        biblio1.mostrarResumen();
    }
    
}
