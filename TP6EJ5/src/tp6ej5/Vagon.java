package tp6ej5;

import java.util.Objects;


public abstract class  Vagon implements Comparable<Vagon>{
    private double largo;
    private double ancho;
    private String marca;
    private int anioFabricacion;
    
    private int numeroVagon=0;

    public Vagon() {
    }
    public Vagon(double largo, double ancho, String marca, int anioFabricacion){
        this.largo = largo;
        this.ancho = ancho;
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
    }
    public double getLargo(){
        return this.largo;
    }
    public double getAncho(){
        return this.ancho;
    }
    public String getMarca(){ 
        return marca;
    }
    public int getAnioFabricacion(){ 
        return anioFabricacion;
    }
    public int getNumeroVagon(){
        return this.numeroVagon;
    }
    public void setNumeroVagon(int numeroVagon){
        this.numeroVagon=numeroVagon;
    }
    
    public void setLargo(double largo) {
        this.largo = largo;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

     public int obtenerNumeroVagon(int numeroVagon) {
        this.numeroVagon = numeroVagon;
        return numeroVagon;
    }
    
    public int cantidadPasajeros() {
        return 0;
    }

    public abstract double pesoMaximo();
    public abstract boolean esLiviano();
    
    @Override
    public int compareTo(Vagon o) {
        return Integer.compare(this.anioFabricacion, o.anioFabricacion);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Vagon otro = (Vagon) obj;
        return this.anioFabricacion == otro.anioFabricacion && 
               Objects.equals(this.marca, otro.marca);
    }
    @Override
    public int hashCode() {
        return Objects.hash(marca, anioFabricacion);
    }
    @Override
    public String toString(){
        return "\nVAGON N" + this.getNumeroVagon() + ": \npeso maximo: " + this.pesoMaximo()+"\n";
    }
}
