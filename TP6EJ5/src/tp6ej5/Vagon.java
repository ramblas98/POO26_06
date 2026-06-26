package tp6ej5;

import java.util.Objects;


public abstract class  Vagon implements Comparable<Vagon>{
    private double largo;
    private double ancho;
    private String marca;
    private int anioFabricacion;

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
    public void setLargo(double largo) {
        this.largo = largo;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
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
        // Paso 1: Identidad (¿Es el mismo objeto en memoria?)
        if (this == obj) return true;
        
        // Paso 2: Nulidad (¿El objeto que viene es nulo?)
        if (obj == null) return false;
        
        // Paso 3: Compatibilidad de Clases (¿Tienen exactamente la misma clase?)
        if (this.getClass() != obj.getClass()) return false;
        
        // Paso 4: Casteo (Convertimos el Object genérico al tipo de la clase)
        Vagon otro = (Vagon) obj;
        
        // Paso 5: Comparación de atributos de negocio (marca y año)
        return this.anioFabricacion == otro.anioFabricacion && 
               Objects.equals(this.marca, otro.marca);
    }
    @Override
    public int hashCode() {
        return Objects.hash(marca, anioFabricacion);
    }
    @Override
    public String toString(){
        return "Vagon peso maximo: " + this.pesoMaximo();
    }
}
