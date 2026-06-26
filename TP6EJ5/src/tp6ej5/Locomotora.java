package tp6ej5;

public class Locomotora implements Comparable{
    private double peso;
    private double pesoMaximo; //que puede arrastrarArrastrarse_-----------------
    private double velocidadMaxima;

    public Locomotora() {
    }

    public Locomotora(double peso, double pesoMaximo, double velocidadMaxima) {
        this.peso = peso;
        this.pesoMaximo = pesoMaximo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getPeso() {
        return this.peso;
    }
    public double getPesoMaximo() {
        return this.pesoMaximo;
    }
    public double getVelocidadMaxima() {
        return this.velocidadMaxima;
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
        return this.getPesoMaximo()-this.peso;
    }
    
    @Override
    public int compareTo(Object o){
        Locomotora l = (Locomotora) o;
        int compVelocidad = Double.compare(this.velocidadMaxima, l.velocidadMaxima);
        if (compVelocidad != 0) {
            return compVelocidad;
        }
        int compPesoMaximo = Double.compare(this.pesoMaximo, l.pesoMaximo);
        if (compPesoMaximo != 0){
            return compPesoMaximo;
        }
        return Double.compare(this.peso, l.peso);
    }
   
    public void detalleLocomotora(){
        System.out.println("Peso: " + this.peso);
        System.out.println("Peso Maximo de Arrastre: " + this.pesoMaximo);
        System.out.println("Velocidad Maxima: " + this.velocidadMaxima);
    }
}
