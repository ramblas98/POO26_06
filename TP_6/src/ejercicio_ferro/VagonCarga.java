package ejercicio5_interface;

import java.lang.Comparable;

public class VagonCarga extends Vagon implements Comparable<VagonCarga> {
    private double cargaMaxima;

    @Override
    public int compareTo(VagonCarga o){
        /*
        double ps1 = this.cargaMaxima;
        double ps2 = o.cargaMaxima;
        if(ps1 == ps2){
            return 0;
        } else if (ps1 < ps2) {
            return -1;
        }else{
            return 1;
        }
        */
        return Double.compare(this.cargaMaxima,o.cargaMaxima);
    }
    public VagonCarga() {
    }

    public VagonCarga(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public VagonCarga(double largo, double ancho, double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    @Override
    public double pesoMaximo() {
        return cargaMaxima+160;
    }

    @Override
    public boolean esLiviano() {
        if(cargaMaxima < 2500.0){
            return true;
        }
        return false;
    }
}
