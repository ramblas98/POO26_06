/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_4_tp4;


/**
 *
 * @author USUARIO
 */
public class EJERCICIO_4_TP4 {

    public static void main(String[] args) {
        // Instanciamos la agencia con el constructor vacío
        Agencia agencia = new Agencia();
        
        // Instanciamos vehículos de distintos tipos
        // Precios estáticos: GNC=800, Diesel=1900, Nafta=1800
        
        AutoNaftero naftero1 = new AutoNaftero(95, "AB123CD", 45.0, "Toyota", 1800);
        AutoNaftero naftero2 = new AutoNaftero(98, "XY987ZW", 30.5, "Ford", 1800);
        
        AutoDiesel diesel1 = new AutoDiesel("Common Rail", "CD456EF", 60.0, "Volkswagen", 1900);
        AutoDiesel diesel2 = new AutoDiesel("Directa", "GH789IJ", 50.0, "Peugeot", 1900);
        
        AutoGNC gnc1 = new AutoGNC(60.0, "KL012MN", 40.0, "Chevrolet", 800);
        AutoGNC gnc2 = new AutoGNC(45.5, "OP345QR", 35.0, "Fiat", 800);
        
        // Registramos los vehículos en la agencia, en este orden de ingreso
        agencia.agregarAuto(naftero1);
        agencia.agregarAuto(diesel1);
        agencia.agregarAuto(gnc1);
        agencia.agregarAuto(naftero2);
        agencia.agregarAuto(diesel2);
        agencia.agregarAuto(gnc2);
        
        // Probamos un duplicado de patente para verificar que TreeSet/LinkedHashSet lo filtren
        AutoNaftero naftero1Duplicado = new AutoNaftero(95, "AB123CD", 10.0, "Toyota", 1800);
        agencia.agregarAuto(naftero1Duplicado);
        
        System.out.println("=== MARCAS DISPONIBLES (HashSet) ===");
        System.out.println(agencia.obtenerMarcasDisponibles());
        
        System.out.println("\n=== FLOTA POR ORDEN DE INGRESO (LinkedHashSet) ===");
        for (Auto a : agencia.obtenerFlotaPorOrdenDeIngreso()) {
            System.out.println(a.getPatente() + " - " + a.getMarca());
        }
        
        System.out.println("\n=== VEHICULOS ORDENADOS POR PATENTE (TreeSet - orden natural) ===");
        for (Auto a : agencia.obtenerVehiculosOrdenadosPorPatente()) {
            System.out.println(a.getPatente() + " - " + a.getMarca());
        }
        
        System.out.println("\n=== VEHICULOS POR CONSUMO (TreeSet - Comparator, mas barato a mas caro) ===");
        for (Auto a : agencia.obtenerVehiculosPorCostoDiario()) {
            System.out.println(a.getPatente() + " - " + a.getMarca() + " - consumo/100km: " + a.consumo(100));
        }
    }
}
