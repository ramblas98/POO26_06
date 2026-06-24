/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_4_tp4;

/**
 *
 * @author USUARIO
 */
public class AutoGNC extends Auto{
    private double capacidadTubo;
    static private double precioGNC;

    public AutoGNC() {
    }

    public AutoGNC(double capacidadTubo, double precioGNC) {
        this.capacidadTubo = capacidadTubo;
        AutoGNC.precioGNC = precioGNC;
    }

    public AutoGNC(double capacidadTubo, String patente, double combustible, String marca,double precioGNC) {
        super(patente, combustible, marca);
        this.capacidadTubo = capacidadTubo;
        AutoGNC.precioGNC = precioGNC;
    }
    
    
    
    //Getter
    public double getCapacidadTubo() {
        return capacidadTubo;
    }

    public double getPrecioGNC() {
        return precioGNC;
    }
    //Setter

    public void setCapacidadTubo(double capacidadTubo) {
        this.capacidadTubo = capacidadTubo;
    }

    public void setPrecioGNC(double precioGNC) {
        AutoGNC.precioGNC = precioGNC;
    }
    
    @Override
    public double consumo(double kilometros) {
        return (kilometros / 16.0) / 3.0;
    }
    
    @Override
    public String obtenerRecomendacionUso() {
        return "Excelente opcion economica para uso urbano intensivo";
    }
    
    @Override
    public void cargar(double monto) {
        double combustibleCargado = monto / precioGNC;
        double espacioDisponible = capacidadTubo - getCombustible();

        if (combustibleCargado <= espacioDisponible) {
            // se carga
            setCombustible(getCombustible() + combustibleCargado);
            System.out.println("Se cargo: " + String.format("%.2f", combustibleCargado) + " Lts");
            System.out.println("Combustible actual: " + String.format("%.2f", getCombustible()) + " Lts");
        } else {
            // Solo carga hasta llenar el tubo, devuelve el resto
            double montoRealGastado = espacioDisponible * precioGNC;
            double vuelto = monto - montoRealGastado;
            setCombustible(capacidadTubo);
            System.out.println("Tubo lleno. Solo se cargaron: " + String.format("%.2f", espacioDisponible) + " Lts");
            System.out.println("Combustible actual: " + String.format("%.2f", getCombustible()) + " Lts");
            System.out.println("Vuelto: $" + String.format("%.2f", vuelto));
        }
    }

    @Override
    public void recorrer(double km) {
        // Rinde 1/3 del Naftero: 1 unidad cada 48 km
        // Limite de 100 km por viaje
        if (km > 100) {
            System.out.println("Viaje cancelado: el AutoGNC no puede recorrer mas de 100 km por viaje.");
            return;
        }
        
        double consumo = km / 48;
        setCombustible(getCombustible() - consumo);
        System.out.println("Se recorrio " + km + " KMs con " + String.format("%.2f", consumo) + " Lts");
        System.out.println("Combustible actual: " + String.format("%.2f", getCombustible()) + " Lts");
        
        // Alerta si el combustible restante no alcanza para 20 km mas
        double consumo20km = 20.0 / 48;
        if (getCombustible() < consumo20km) {
            System.out.println("ALERTA: combustible insuficiente para recorrer 20 km mas.");
        }
    }
        
    @Override
    public void realizarMantenimiento(){
        System.out.println("==== CHEQUEO MOTOR ====");
        System.out.println("Tipo: GNC");
        System.out.println("Patente: " + getPatente());
        System.out.println("Capacidad del tubo: " + capacidadTubo + " Lts");
        System.out.println("Combustible disponible: " + String.format("%.2f", getCombustible()) + " Lts");
    }

    @Override
    public String toString() {
        return "AutoGNC{ "+super.toString() + ", capacidadTubo: " + capacidadTubo + '}';
    }
    
    
}

