package tp6ej5;

public class VagonCarga extends Vagon implements Comparable<Vagon>{
    private double cargaMaxima;

    public VagonCarga() {
    }

    public VagonCarga(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public VagonCarga(double largo, double ancho, String marca, int anioFabricacion,double cargaMaxima) {
        super(largo, ancho, marca, anioFabricacion);
        this.cargaMaxima = cargaMaxima;
    }

    public double getCargaMaxima(){
        return this.cargaMaxima;
    }
    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public double pesoMaximo() {
        return this.cargaMaxima+160;
    }
    //A
    @Override
    public boolean esLiviano() {
        return this.pesoMaximo() < 2500;
    }
    
    /*@Override
    public int compareTo(Object o){
        VagonCarga v = (VagonCarga) o;
        double c1= this.cargaMaxima;
        double c2= v.cargaMaxima;
        return Double.compare(c1, c2);
    }*/

}
