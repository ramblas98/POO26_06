/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_4_tp4;

/**
 *
 * @author USUARIO
 */
public class AutoNaftero extends Auto {
    private int octanaje;
    static private double precioNafta;
    
    //Constructor sin parametro
    public AutoNaftero() {
    }
    //Constructor de la clase
    public AutoNaftero(int octanaje, double precioNafta) {
        this.octanaje = octanaje;
        AutoNaftero.precioNafta = precioNafta;
    }
    //Constructor

    public AutoNaftero(int octanaje, String patente, double combustible, String marca,double precioNafta) {
        super(patente, combustible, marca);
        this.octanaje = octanaje;
        AutoNaftero.precioNafta = precioNafta;
    }
    
    @Override
    public String obtenerRecomendacionUso() {
        return "Recomendado para viajes cortos y agiles";
    }
    
    @Override
    public void cargar(double monto) {
        double nuevoMonto = monto * (10.0/100); //PROMOCION
        double precioFinal = monto + nuevoMonto;
        double nuevoCombustible =precioFinal/AutoNaftero.precioNafta;
        setCombustible(nuevoCombustible+getCombustible());
        System.out.println("Gracias a la promo 'Mundial 2026' se cargo: "+String.format("%.2f", precioFinal)+"$");
        System.out.println("Combustible cargado: "+String.format("%.2f",precioFinal/AutoNaftero.precioNafta));
        System.out.println("Combustible actual: "+String.format("%.2f",getCombustible())+"Lts");
    }
    
    @Override
    public double consumo(double kilometros) {
        return kilometros / 16.0;
    }
    
    @Override
    public void recorrer(double km) {
        double consumo = km/16;
        setCombustible(getCombustible()-consumo);
        System.out.println("Se recorrio "+km+" KMS con "+String.format("%.2f",consumo)+" Lts");
        System.out.println("Combustible actual: "+String.format("%.2f",getCombustible())+"Lts");
    }
    
    @Override
    public void realizarMantenimiento() {
        System.out.println("==== CHEQUEO MOTOR ====");
        System.out.println("Tipo: Naftero");
        System.out.println("Patente: "+getPatente());
        System.out.println("Octanaje: "+octanaje);
        System.out.println("Combustible disponible: "+String.format("%.2f",getCombustible())+" Lts");
    }
    
    //Getter
    public int getOctanaje() {
        return octanaje;
    }

    public double getprecioNafta() {
        return precioNafta;
    }
    //Setter
    public void setOctanaje(int octanaje) {
        this.octanaje = octanaje;
    }

    public void setPrecioNafta(double precioNafta) {
        AutoNaftero.precioNafta = precioNafta;
    }

    @Override
    public String toString() {
        return "AutoNaftero{ "+super.toString() + ", octanaje: " + octanaje + '}';
    }
    
    
}
