/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6_ejercicio6;

import java.util.TreeSet;


/**
 *
 * @author Pc
 */
public class TP6_EJERCICIO6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BibliotecaPersonal b = new BibliotecaPersonal();
        
        Lectura l1 = new Libro("Libro1", "AutorLibro1", 50,5, Genero.CIENCIA_FICCION, 1990);
        Lectura l2 = new Libro("Libro1", "AutorLibro2", 110,9, Genero.ENSAYO, 1990);
        Lectura c1 = new Comic("Comic1", "AutorComic1", 25,6, "DibujanteComic1", true);
        Lectura c2 = new Comic("Comic2", "AutorComic2", 15,8, "DibujanteComic2", false);
        Lectura r1 = new Revista("Revista1","AutorRevista1", 83,2,3, Tematica.ACTUALIDAD);
        Lectura r2 = new Revista("Revista2","AutorRevista2", 211,4,1, Tematica.CIENCIA);
        
        b.agregarLectura(l2);
        b.agregarLectura(c1);
        b.agregarLectura(r2);
        b.agregarLectura(c2);
        
        b.agregarLectura(r1);
        b.agregarLectura(l1);
        
        
        
        System.out.println("\nLISTA DE TITULOS LEIDOS: ");
        System.out.println(b.obtenerTitulosLeidos());
        
        
        System.out.println("\nHISTORIAL DE LECTURA: ");
        b.obtenerHistorialDeLectura();
        b.mostrarResumen();
        
        
        System.out.println("\nLECTURAS ORDENADAS POR CALIFICACION (mayor a menor): ");
        System.out.println(b.listarLecturasPorCalificacion());
        b.mostrarResumen();
        
        System.out.println("\nLECTURAS ORDENADAS POR TIEMPO ESTIMADO DE LECTURA(menor a mayor): ");
        b.listarLecturasPorTiempoEstimado();
        
        
    }
    
}
