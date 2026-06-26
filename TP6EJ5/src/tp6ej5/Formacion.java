package tp6ej5;

import java.util.ArrayList;
import java.util.Objects;//---------------


public class Formacion implements Comparable<Formacion>{
    private final ArrayList<Locomotora> locomotoras;
    private final ArrayList<Vagon> vagones;
    private String codigo;
    private static int contadorFormaciones = 0;
    private final int numeroFormacion;

    public Formacion(String codigo) {
        this.locomotoras= new ArrayList<>();
        this.vagones= new ArrayList<>();
        this.codigo=codigo;
        contadorFormaciones++; // El contador global aumenta
        this.numeroFormacion = contadorFormaciones;
    }
    public ArrayList<Locomotora> getLocomotoras() {
        return locomotoras;
    }
    public ArrayList<Vagon> getVagones() {
        return vagones;
    }
    public String getCodigo(){
        return codigo;
    }
    public int getNumeroFormacion(){
        return numeroFormacion;
    }
    public void agregarLocomotora(Locomotora l) {
        locomotoras.add(l);
    }
    public void agregarVagon(Vagon v) {
        this.vagones.add(v);
    }
    public void setCodigo(String codigo) {
        this.codigo=codigo;
    }

    public int totalPasajeros() {
        int t=0;
        for(Vagon v : vagones){
            t=t+v.cantidadPasajeros();
        }
        return t;
    }

    public int vagonesLivianos() {
        int c=0;
        for(Vagon v : vagones){
            if(v.esLiviano()==true){
                c++;
            }
        }
        return c;
    }

    public double velocidadMaximaMin(){
        if (locomotoras.isEmpty()){
            return 0;
        }
        double m=locomotoras.getFirst().getVelocidadMaxima();
        for(int i=1; i<locomotoras.size(); i++){
            double aux = locomotoras.get(i).getVelocidadMaxima();
            if(aux<m)m=aux;
        }
        return m;
    }

    public boolean esEficiente() {
        for(Locomotora l : locomotoras){
            if(l.getPesoMaximo()<l.getPeso()*5){//-----------
                return false;
            }
        }
        return true;
    }

    private double totalArrastreLocomotoras(){
        double a=0;
        for(Locomotora l : locomotoras){
            a=a+l.arrastreUtil();
        }
        return a;
    }
    private double totalPesoMaximoVagones(){
        double x=0;
        for(Vagon v : vagones){
            x=x+v.pesoMaximo();
        }
        return x;
    }
    private double totalPesoMaximoLocomotoras(){
        double x=0;
        for(Locomotora l : locomotoras){
            x=x+l.getPeso();
        }
        return x;
    }
    
    public boolean puedeMoverse() {
        return this.totalArrastreLocomotoras()>=
                this.totalPesoMaximoVagones();
    }
    
    public double kiloEmpujeFaltantes() {
        if(this.puedeMoverse()) return 0;
        return this.totalPesoMaximoVagones()-
                this.totalArrastreLocomotoras();
    }

    public boolean esCompleja() {
        if(this.locomotoras.size()+this.vagones.size()>20){
            return true;
        }
        return (this.totalPesoMaximoLocomotoras()+
                this.totalPesoMaximoVagones()>10000);
    }
    
    public Vagon vagonMasPesado(){
        Vagon MvagonPesado = null;
        for(Vagon i : vagones){
            if(MvagonPesado == null){
                MvagonPesado = i;
            }
            if(MvagonPesado.pesoMaximo() < i.pesoMaximo()){
                MvagonPesado = i;
            }
        }
        return MvagonPesado;
    }
    
    public void mostrarDetalles(){
        System.out.println("Codigo: "+this.codigo);
        System.out.println("Cantidad de locomotoras: " + locomotoras.size());
        System.out.println("Cantidad de vagones: " + vagones.size());
        System.out.println("Total pasajeros: " + this.totalPasajeros());
        System.out.println("Velocidad Maxima: " + this.velocidadMaximaMin());
        System.out.println("Puede moverse?: ");
        if (this.puedeMoverse()){
            System.out.print(" SI");
        }
        else{
            System.out.print(" NO");
        }
        System.out.print("");
    }
    
    //Orden natural
    @Override
    public int compareTo(Formacion o){
        return this.codigo.compareTo(o.getCodigo());
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;// 1. Identidad
        if(obj == null) return false;// 2. Nulidad
        if (this.getClass() != obj.getClass()) return false;// 3. Compatibilidad
        Formacion otra = (Formacion) obj; // 4. Casteo
        return Objects.equals(this.codigo, otra.codigo); // 5. Atributo
    }
    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
    
    @Override
    public String toString() {
        return "\nFormacion N" +numeroFormacion + "\nCodigo:" + this.getCodigo()+"\n"; 
    }
}
