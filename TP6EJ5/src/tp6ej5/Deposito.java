package tp6ej5;

import java.util.ArrayList;
//import java.util.Comparator;
import java.util.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class Deposito{
    private final ArrayList<Formacion> listaFormaciones;
    private final ArrayList<Locomotora> listaLocomotorasSueltas;

    public Deposito() {
        this.listaFormaciones= new ArrayList<>();
        this.listaLocomotorasSueltas= new ArrayList<>();
    }

    public ArrayList<Formacion> getListaFormaciones() {
        return listaFormaciones;
    }
    public void agregarFormacion(Formacion f) {
        this.listaFormaciones.add(f);
    }
    public ArrayList<Locomotora> getListaLocomotorasSueltas() {
        return listaLocomotorasSueltas;
    }
    public void agregarLocomotoraSuelta(Locomotora l){
        this.listaLocomotorasSueltas.add(l);
    }
    public void eliminarLocomotoraSuelta(int i){
        this.listaLocomotorasSueltas.remove(i);
    }

    public boolean coductorExperimentado() {
        for(int i=0; i<this.listaFormaciones.size(); i++){
            Formacion f=this.listaFormaciones.get(i);
            if(f.esCompleja()==true){
                return true;
            }
        }
        return false;
    }

    public void locomotoraAFormacion(int i) {
        Formacion f=this.listaFormaciones.get(i);
        if (!f.puedeMoverse()){
            int u =0;
            boolean b=false;
            while(u<this.listaLocomotorasSueltas.size() && b==false){
                Locomotora ls=this.listaLocomotorasSueltas.get(u);
                if(ls.arrastreUtil()>= f.kiloEmpujeFaltantes()){
                    b=true;
                    f.agregarLocomotora(ls);
                    this.eliminarLocomotoraSuelta(u);
                }
                else{
                    u++;
                }
            }
        }
    }
    
    public ArrayList<Vagon> cojuntoVagon () {//-masPesados----------------
        ArrayList<Vagon> v=new ArrayList<>();
        for(int i=0; i<this.listaFormaciones.size(); i++){
            Formacion f=this.listaFormaciones.get(i);
            v.add(f.vagonMasPesado());
        }
        return v;
    }
    public void mostrarDetallesFormaciones(){
        //Collections.sort(this.listaFormaciones,new Comparator());
        int c=1;
        for(Formacion f : listaFormaciones){
            System.out.println("\nFormacion " + c);
            f.mostrarDetalles();
            System.out.println();
            c++;
        }
    }
    public void mostrarDetallesLocomotorasSueltas(){
        //Collections.sort(this.listaFormaciones,new Comparator());
        int c=1;
        for(Locomotora l : listaLocomotorasSueltas){
            System.out.println("\nLocomotora Suelta: " + c);
            l.detalleLocomotora();
            System.out.println();
            c++;
        }
    }
    //--------------
    public void completarFormaciones(){
        for(int i=0 ; i<this.getListaFormaciones().size() ; i++){
            this.locomotoraAFormacion(i);
        }
    }
    //ORDENAR
    public void ordenarPorOrdenNatural() {
        Collections.sort(this.listaFormaciones);
        Collections.sort(this.listaLocomotorasSueltas);
        System.out.println("\nORDEN NATURAL (velodidad formaciones y velocidad maxima locmotoras):");
        this.mostrarDetallesFormaciones();
        this.mostrarDetallesLocomotorasSueltas();
    }
    public void ordenarPorPasajeros() {
        Collections.sort(this.listaFormaciones, new CompararPorPasajeros());
        System.out.println("\nFORMACIONES POR PASAJEROS");
        this.mostrarDetallesFormaciones();
    }
    public void ordenarPorPesoVagon() {
        Collections.sort(this.listaFormaciones, new CompararPorPesoVagon());
        System.out.println("\nFORMACIONES POR EMPUJE FALTANTE");
        this.mostrarDetallesFormaciones();
    }
    public void ordenarPorCantidadVagones(){
        Collections.sort(listaFormaciones, new CompararPorCantidadVagones());
        System.out.println("\nORDENAR POR CANTIDAD DE VAGONES EN LA FORMACION");
        this.mostrarDetallesFormaciones();
    }
    public void ordenarPorCantidadLocomotorasEnFormacion(){
        Collections.sort(listaFormaciones, new CompararPorCantidadLocomotorasFormacion());
        System.out.println("\nORDENAR POR CANTIDAD DE LOCOMOTORAS EN LA FORMACION");
        this.mostrarDetallesFormaciones();
    }
    public void ordenarLocomotorasPorArrastreUtil() {
        this.listaLocomotorasSueltas.sort((l1, l2) -> Double.compare(l1.arrastreUtil(), l2.arrastreUtil()));
        System.out.println("\nLOCOMOTORAS POR VELOCIDAD MAXIMA");
        this.mostrarDetallesLocomotorasSueltas();
    }
    
    
    //----------------------------------------------------------
    public HashSet<String> obtenerMarcasDeVagones(){
        HashSet<String> marcasUnicas = new HashSet<>();
        for(Formacion f : listaFormaciones) {
            for(Vagon v : f.getVagones()) {
                marcasUnicas.add(v.getMarca());
            }
        }
        return marcasUnicas;
    }
    public LinkedHashSet<Formacion> obtenerHistorialDeFormaciones() {
        LinkedHashSet<Formacion> historialF= new LinkedHashSet<>();
        for (int i = 0; i < this.listaFormaciones.size(); i++) {
            historialF.add(this.listaFormaciones.get(i));
        }
        return historialF;
    }
    public TreeSet<Formacion> listarFormacionesPorCodigo(){
        TreeSet<Formacion> formacionesC=new TreeSet<>();
        formacionesC.addAll(this.listaFormaciones);//TreeSet ordena solo
        return formacionesC;
    }
    public TreeSet<Vagon> listarVagonesPorPesoMaximo(Formacion f){
        //indicar en el constructor el criterio de ordenacion si no es el naturla
        TreeSet<Vagon> vagonesPM= new TreeSet<>(new CompararVagonesPorPesoMaximo());
        vagonesPM.addAll(f.getVagones());
        return vagonesPM;
    }
}
