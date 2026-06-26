package ejercicio_ferro;

import java.lang.Comparable;
import java.util.Objects;

public abstract class Vagon implements Comparable<Vagon>{
    private final double largo;
    private final double ancho;
    private String marca;
    private int anio;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vagon v = (Vagon) obj;
        return anio == v.anio && Objects.equals(marca, v.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, anio);
    }

    @Override
    public int compareTo(Vagon otro){
        return Integer.compare(this.anio, otro.anio);
    }

    public Vagon() {
        this.largo = 2.5;
        this.ancho = 2.5;
    }

    public Vagon(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnio() {
        return anio;
    }

    public int cantidadPasajeros() {
        return 0;
    }

    public abstract double pesoMaximo();

    public abstract boolean esLiviano();

}
