/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6ej5;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
/**
 *
 * @author Jazmín
 */
public class TP6EJ5 {

    public static void main(String[] args) {
        // TODO code application logic here
        Deposito d = new Deposito();
        //Formacion 1
        Formacion f1=new Formacion("F-123");
        f1.agregarVagon(new VagonPasajero(10, 2, "Materfer", 2003));
        Locomotora l1= new Locomotora(1234.0, 4567.0, 7890.0);
        Locomotora l2= new Locomotora(1000.0, 40000.0, 70000.0);
        f1.agregarLocomotora(l1);
        f1.agregarLocomotora(l2);
        System.out.println("Puede moverse f1?"+f1.puedeMoverse());//---
        
        //Formacion 2
        Formacion f2=new Formacion("L-456");
        f2.agregarVagon(new VagonCarga(102, 3.5, "Alstom", 2020, 3000.0));
        System.out.println("Puede moverse f2?"+f2.puedeMoverse());
        //F1 y F2 al deposito
        d.agregarFormacion(f1);
        d.agregarFormacion(f2);
        
        //Locomotoras sueltas
        System.out.println("Locomotoras sueltas");
        Locomotora lSuelta1= new Locomotora(11.0, 22.0, 33.0);
        d.agregarLocomotoraSuelta(lSuelta1);
        Locomotora lSuelta2= new Locomotora(44.0, 55.0, 66.0);
        d.agregarLocomotoraSuelta(lSuelta2);
        Locomotora lSuelta3= new Locomotora(7777.0, 8888.0, 9999.0);
        d.agregarLocomotoraSuelta(lSuelta3);
        //2do lote de locomotoras suelats
        Locomotora lSuelta4= new Locomotora(1401.0, 3450.0, 4480.0);
        d.agregarLocomotoraSuelta(lSuelta4);
        Locomotora lSuelta5= new Locomotora(1251.0, 5440.0, 1840.0);
        d.agregarLocomotoraSuelta(lSuelta5);
        Locomotora lSuelta6= new Locomotora(5111.0, 150.0, 4580.0);
        d.agregarLocomotoraSuelta(lSuelta6);
        Locomotora lSuelta7= new Locomotora(7131.0, 124.0, 2480.0);
        d.agregarLocomotoraSuelta(lSuelta7);

        //System.out.println("\n---ESTADO FORMACIONES INICIAL---");
        //d.mostrarDetallesFormaciones();
        
        System.out.println("Locomotoras sueltas disponibles: " + d.getListaLocomotorasSueltas().size());
        // completa las formaciones que no pueden moverse 
        
        //Formacion 3
        Formacion f3=new Formacion("D-789");
        f3.agregarVagon(new VagonPasajero(1, 1, "Materfer", 2023));
        f3.agregarVagon(new VagonCarga(1, 1, "Siemens",2012, 30.0));
        Locomotora la= new Locomotora(12.0, 45.0, 78.0);
        f3.agregarLocomotora(la);
        System.out.println("Verificacion f3: " + f3.puedeMoverse());
        d.agregarFormacion(f3);
        //Formacion 4
        Formacion f4=new Formacion("V-000");
        f4.agregarVagon(new VagonPasajero(2, 1, "Siemens", 2026));
        f4.agregarVagon(new VagonCarga(3, 1,  "Alstom", 2025, 20.0));
        Locomotora lb= new Locomotora(11.0, 35.0, 48.0);
        f4.agregarLocomotora(lb);
        System.out.println("Verificacion f4: " + f4.puedeMoverse());
        d.agregarFormacion(f4);
        
        
        /*System.out.println("\n---ESTADO FORMACIONES INICIAL---");
        d.mostrarDetallesFormaciones();
        System.out.println("\nLocomotoras sueltas en el deposito: " + d.getListaLocomotorasSueltas().size());
        
        System.out.println("\nCompletar formaciones que no pueden moverwse");
        d.completarFormaciones();
        
        System.out.println("\n---ESTADO FORMACIONES FINAL---");
        d.mostrarDetallesFormaciones();
        System.out.println("Locomotoras sueltas en el deposito: " + d.getListaLocomotorasSueltas().size());
        
        d.ordenarPorOrdenNatural();
        
        d.ordenarLocomotorasPorArrastreUtil();
        
        //d.ordenarPorPasajeros();
        //d.ordenarPorPesoVagon();
        d.ordenarPorCantidadLocomotorasEnFormacion();*/
        
        //HashSet
        System.out.println("\n---Marcas Unicas (HashSet)---");
        //HashSet<String> marcas = d.obtenerMarcasDeVagones();
        System.out.println(d.obtenerMarcasDeVagones());
        
        //LinkedHashSet
        System.out.println("\n---Historial de llegada (LinkedHashSet)---");
        //LinkedHashSet<Formacion> hist = d.obtenerHistorialDeFormaciones();
        System.out.println(d.obtenerHistorialDeFormaciones());
        
        //TreeSet orden natural
        System.out.println("\n---Formaciones por orden alfabetico (TreeSet)---");
        //TreeSet<Formacion> alf = d.listarFormacionesPorCodigo();
        System.out.println(d.listarFormacionesPorCodigo());
        
        //TreeSet con Comaprator
        System.out.println("\n---Vagones de f3 por peso (TreeSet y Comparator)---");
        //TreeSet<Vagon> vpp = d.listarVagonesPorPesoMaximo(f2);
        System.out.println(d.listarVagonesPorPesoMaximo(f3));
        
    }
}