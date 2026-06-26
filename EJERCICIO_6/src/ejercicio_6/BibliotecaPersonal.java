/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
 
public class BibliotecaPersonal {
 
    private ArrayList<Lectura> coleccion = new ArrayList<>();
 
    // Agregar
    public void agregarLectura(Lectura lectura) {
        if (coleccion.contains(lectura)) {
            System.out.println("Ya existe una lectura con el titulo: " + lectura.getTitulo());
        } else {
            coleccion.add(lectura);
            System.out.println("Agregada: " + lectura.getTitulo());
        }
    }
 
    // 2. Elimanr
    public void eliminarPorTitulo(String titulo) {
        boolean eliminado = coleccion.removeIf(l -> l.getTitulo().equalsIgnoreCase(titulo));
        if (eliminado) {
            System.out.println("Eliminada: " + titulo );
        } else {
            System.out.println("No se encontro ninguna obra con el titulo: " + titulo );
        }
    }
    
    public void eliminarPorAutor(String autor) {
        int antes = coleccion.size();
        coleccion.removeIf(l -> l.getAutor().equalsIgnoreCase(autor)); 
        int eliminados = antes - coleccion.size();
        if (eliminados > 0) {
            System.out.println("Eliminadas " + eliminados + " obra(s) del autor: " + autor );
        } else {
            System.out.println("No se encontró ninguna obra del autor: " + autor );
        }
    }
 
    // 3. Mayor y menor calificación 
    public Lectura getMayorCalificacion() {
        if (coleccion.isEmpty()) return null;
        Lectura mejor = coleccion.get(0);
        for (Lectura l : coleccion){
            if (l.getCalificacion() > mejor.getCalificacion()) mejor = l;
        }
        return mejor;
    }
    
    public Lectura getMenorCalificacion() {
        if (coleccion.isEmpty()) return null;
        Lectura peor = coleccion.get(0);
        for (Lectura l : coleccion){
            if (l.getCalificacion() < peor.getCalificacion()) peor = l;
        }
        return peor;
    }
    
    // 4. Resumen general
    public void mostrarResumenGeneral() {
        if (coleccion.isEmpty()) {
            System.out.println("La biblioteca esta vacia.");
            return;
        }
        System.out.println(" BIBLIOTECA PERSONAL ");
        for (int i = 0; i < coleccion.size(); i++) {
            System.out.printf("%2d. %s%n", i + 1, coleccion.get(i).resumen());
        }
    }
 
    //5. Tiempo total estimado 
    public int tiempoTotalEstimado() {
        int total = 0;
        for (Lectura l : coleccion){
            total += l.tiempoEstimadoLectura();
        }
        return total;
    } 
    
    // b) -------------------------------------------------------
 
    // Solo titulos unicos, sin orden importar
    public HashSet<String> obtenerTitulosLeidos() {
        HashSet<String> titulos = new HashSet<>();
        for (Lectura l : coleccion) {
            titulos.add(l.getTitulo());
        }
        return titulos;
    }
 
    // Orden cronologico de agregado, sin duplicados
    public LinkedHashSet<Lectura> obtenerHistorialDeLectura() {
        return new LinkedHashSet<>(coleccion);
    }
 
    // Orden natural: por calificacion mayor a menor (Comparable)
    public TreeSet<Lectura> listarLecturasPorCalificacion() {
        return new TreeSet<>(coleccion);
    }
 
    // Orden por tiempo estimado menor a mayor (Comparator externo)
    public TreeSet<Lectura> listarLecturasPorTiempoEstimado() {
        TreeSet<Lectura> porTiempo = new TreeSet<>(new ComparaLectura());
        porTiempo.addAll(coleccion);
        return porTiempo;
    }
}