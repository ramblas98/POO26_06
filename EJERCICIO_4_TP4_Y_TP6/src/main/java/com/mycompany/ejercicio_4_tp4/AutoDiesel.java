/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_4_tp4;

/**
 *
 * @author USUARIO
 */
public class AutoDiesel extends Auto{
    private String tipoInyeccion;
    static private double precioDiesel;

    public AutoDiesel() {
    }

    public AutoDiesel(String tipoInyeccion, double precioDiesel) {
        this.tipoInyeccion = tipoInyeccion;
        AutoDiesel.precioDiesel = precioDiesel;
    }

    public AutoDiesel(String tipoInyeccion, String patente, double combustible, String marca,double precioDiesel) {
        super(patente, combustible, marca);
        this.tipoInyeccion = tipoInyeccion;
        AutoDiesel.precioDiesel = precioDiesel;
    }

    public String getTipoInyeccion() {
        return tipoInyeccion;
    }

    public double getPrecioDiesel() {
        return precioDiesel;
    }

    public void setTipoInyeccion(String tipoInyeccion) {
        this.tipoInyeccion = tipoInyeccion;
    }

    public void setPrecioDiesel(double precioDiesel) {
        AutoDiesel.precioDiesel = precioDiesel;
    }
    
    @Override
    public double consumo(double kilometros) {
        return (kilometros / 16.0) / 2.0;
    }
    
    @Override
    public String obtenerRecomendacionUso(){
        return "Ideal para transporte de carga y largas distancias";
    }

    @Override
    public void realizarMantenimiento(){
        System.out.println("==== CHEQUEO MOTOR ====");
        System.out.println("Tipo: Diesel");
        System.out.println("Patente: "+getPatente());
        System.out.println("Tipo inyeccion: "+tipoInyeccion);
        System.out.println("Combustible disponible: "+String.format("%.2f",getCombustible())+" Lts");
    }
    @Override
    public void cargar(double monto) {
        // Sin promo. $1900 por unidad
        double combustibleCargado = monto / precioDiesel;
        setCombustible(getCombustible() + combustibleCargado);
        System.out.println("Se cargo: " + String.format("%.2f", combustibleCargado) + " Lts");
        System.out.println("Combustible actual: " + String.format("%.2f", getCombustible()) + " Lts");
    }

    @Override
    public void recorrer(double km) {
        // Rinde el doble que el Naftero: 1 unidad cada 32 km
        double consumo = km / 32;
        setCombustible(getCombustible() - consumo);
        System.out.println("Se recorrio " + km + " KMs con " + String.format("%.2f", consumo) + " Lts");
        System.out.println("Combustible actual: " + String.format("%.2f", getCombustible()) + " Lts");
    }

    @Override
    public String toString() {
        return "AutoDiesel{ "+super.toString() + ", tipoInyeccion: " + tipoInyeccion + '}';
    }
    
    
}
