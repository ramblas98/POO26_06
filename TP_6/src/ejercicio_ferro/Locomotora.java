package ejercicio5_interface;

import java.lang.Comparable;
import java.util.Collections;

public class Locomotora implements Comparable<Locomotora> {
    private double peso;
    private double pesoMaximo;
    private double velocidadMaxima;

    @Override
    public int compareTo(Locomotora o){
        return Double.compare(this.velocidadMaxima,o.velocidadMaxima);
    }

    public Locomotora() {
        this.peso = 10;
        this.pesoMaximo = 60;
        this.velocidadMaxima = 30;
    }

    public Locomotora(double peso, double pesoMaximo, double velocidadMaxima) {
        this.peso = peso;
        this.pesoMaximo = pesoMaximo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getPeso() {
        return peso;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPesoMaximo(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public double arrastreUtil(){
        return this.getPesoMaximo() - this.peso;
    }
}
