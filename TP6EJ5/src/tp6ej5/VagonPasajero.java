package tp6ej5;

public class VagonPasajero extends Vagon implements Comparable<Vagon>{
    public VagonPasajero() {
    }
    public VagonPasajero(double largo, double ancho, String marca, int anioFabricacion) {
        super(largo, ancho, marca, anioFabricacion);
    }

    @Override
    public double pesoMaximo() {
        return this.cantidadPasajeros()*80;
    }

    @Override
    public boolean esLiviano() {
        return this.pesoMaximo()<2500;
    }

    @Override
    public int cantidadPasajeros() {
        //ancho útil
        if(super.getAncho()<=2.5){
            return (int) ((super.getLargo()*8));
        }
        return (int) ((super.getLargo()*10));
    }
    /*@Override
    public int compareTo(Object o){
        VagonPasajero v = (VagonPasajero) o;
        double p1= this.cantidadPasajeros();
        double p2= v.cantidadPasajeros();
        return Double.compare(p1, p2);
    }*/
    
}
