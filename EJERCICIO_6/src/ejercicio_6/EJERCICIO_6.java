/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio_6;

public class EJERCICIO_6 {

    public static void main(String[] args) {
        BibliotecaPersonal biblioteca = new BibliotecaPersonal();
        
        // Crear instancias
        Lectura libro1  = new Libro("Los Tres mosqueteros", "Alexandre Dumas",576, 5, Genero.OTROS, 1844);
        Lectura libro2  = new Libro("Principito", "Antoine de Saint-Exupery ",96, 10, Genero.OTROS, 1943);
        Lectura libro3  = new Libro("Cien anios de soledad", "Gabriel Garcia Marquez",496, 5, Genero.NOVELA, 1967);
        Lectura comic1  = new Comic("One Pice", "Eiichiro Oda", 22800, 10,"Eiichiro Oda", false);
        Lectura comic2  = new Comic("Watchmen", "Alan Moore", 416, 10,"Dave Gibbons", true);
        Lectura comic3  = new Comic("Super", "Alan Moore", 416, 10,"Dave Gibbons", true);
        Lectura revista1 = new Revista("Genio", "Varios autores",140, 7, 482, Tematica.ACTUALIDAD);
        
        biblioteca.agregarLectura(libro1);
        biblioteca.agregarLectura(libro2);
        biblioteca.agregarLectura(libro3);
        biblioteca.agregarLectura(comic1);
        biblioteca.agregarLectura(comic2);
        biblioteca.agregarLectura(comic3);
        biblioteca.agregarLectura(revista1);
        
        System.out.println("\n Resumen:");
        biblioteca.mostrarResumenGeneral();
        
        System.out.println("\n TIEMPO ESTIMADO POR OBRA:");
        System.out.println("Tiempo total de la biblioteca: " + biblioteca.tiempoTotalEstimado() + " horas");
        
        System.out.println("\n CALIFICACIONES:");
        Lectura mejor = biblioteca.getMayorCalificacion();
        Lectura peor  = biblioteca.getMenorCalificacion();
        System.out.println("Mayor calificacion : " + mejor.getTitulo() + " = " + mejor.getCalificacion() );
        System.out.println("Menor calificacion : " + peor.getTitulo()  + " = " + peor.getCalificacion()  );
        
        System.out.println("\n ELIMINACIONES:");
        biblioteca.eliminarPorTitulo("Los Tres mosqueteros");
        biblioteca.eliminarPorAutor("Alan Moore");
        biblioteca.eliminarPorTitulo("Libro que no existe");
        
        // Resumen final tras eliminaciones
        System.out.println("\n RESUMEN TRAS ELIMINACIONES:");
        biblioteca.mostrarResumenGeneral();
        
        System.out.println("\n TIEMPO ESTIMADO POR OBRA:");
        System.out.println("Tiempo total de la biblioteca: " + biblioteca.tiempoTotalEstimado() + " horas");
    }
    
}
