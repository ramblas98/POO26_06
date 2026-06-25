package ejercicio_ferro;

import java.lang.Comparable;

public abstract class Vagon{
    private final double largo;
    private final double ancho;
    private String marca;
    private int anio;
    /*
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Vagon v){
        return Integer.compare(this.anio,v.anio);
    }*/

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



    public int cantidadPasajeros() {
        return 0;
    }

    public abstract double pesoMaximo();

    public abstract boolean esLiviano();
}
