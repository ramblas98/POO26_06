package ejercicio5_interface;

import java.lang.Comparable;

public class VagonPasajero extends Vagon implements Comparable<VagonPasajero> {
    @Override
    public int compareTo(VagonPasajero o){
        /*
        double ps1 = this.cantidadPasajeros();
        double ps2 = o.cantidadPasajeros();
        if(ps1 == ps2){
            return 0;
        } else if (ps1 < ps2) {
            return -1;
        }else{
            return 1;
        }
        */
        return Double.compare(this.cantidadPasajeros(),o.cantidadPasajeros());
    }
    public VagonPasajero(){
        super();
    }

    public VagonPasajero(double largo, double ancho) {
        super(largo, ancho);
    }

    public void getters() {
    }

    public void setters() {
    }

    @Override
    public double pesoMaximo() {
        return this.cantidadPasajeros()*80;
    }

    @Override
    public boolean esLiviano() {
        return this.pesoMaximo() < 2500;
    }

    @Override
    public int cantidadPasajeros() {
        //ancho útil
        if(super.getAncho()<=2.5){
            return (int) ((super.getLargo()*8));
        }
        return (int) ((super.getLargo()*10));
    }
}
