package ejercicio_ferro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Deposito {
    private ArrayList<Formacion> listaFormaciones;
    private ArrayList<Locomotora> listaLocotorasSueltas;

    public void ordenarFormacionesPorVelocidad(){
        Collections.sort(this.listaFormaciones);
    }

    public void ordenarLocomotorasSueltasPorVelocidad(){
        Collections.sort(this.listaLocotorasSueltas);
    }

    public void ordenarFormacionesPorCantidadDeVagones() {
        Collections.sort(this.listaFormaciones, new CompararCantidadDeVagones());
    }

    public void ordenarPorCantidadDeLocomotoras(){
        Collections.sort(this.listaFormaciones, new CompararCantidadLocomotoras());
    }

    public Deposito() {
        this.listaFormaciones= new ArrayList<>();
        this.listaLocotorasSueltas= new ArrayList<>();
    }

    public ArrayList<Formacion> getListaFormacion() {
        return listaFormaciones;
    }

    public ArrayList<Locomotora> getListaLocotorasSueltas() {
        return listaLocotorasSueltas;
    }

    public boolean coductorExperimentado() {
        for(int i=0; i<this.listaFormaciones.size(); i++){
            Formacion f=this.listaFormaciones.get(i);
            if(f.esCompleja()){
                return true;
            }
        }
        return false;
    }

    public void agregarLocomotora(Locomotora l, int id) {
        Formacion f=this.listaFormaciones.get(id);
        if(!f.puedeMoverse()){

            this.eliminarLocomotoraSuelta(id);
        }
    }

    public void agregarLocomotoraSuelta(Locomotora l){
        this.listaLocotorasSueltas.add(l);
        System.out.println("==========( Se agrego Locomotora Suelta al Deposito )==========");
    }
    public void eliminarLocomotoraSuelta(int i){
        this.listaLocotorasSueltas.remove(this.listaLocotorasSueltas.get(i));
    }

    public void agregarFormacion(Formacion f){
        this.listaFormaciones.add(f);
        System.out.println("<=======-- Formacion Añadida --======>");
    }

    public ArrayList<Vagon> cojunto() {
        ArrayList<Vagon> v=new ArrayList<>();
        for(int i=0; i<this.listaFormaciones.size(); i++){
            Formacion f=this.listaFormaciones.get(i);
            v.add(f.vagonMasPesado());
        }
        return v;
    }

    public void locomotoraAFormacion(int i) {
        Formacion f=this.listaFormaciones.get(i);
        if (!f.puedeMoverse()){
            int u =0;
            boolean b=false;
            while(u < this.listaLocotorasSueltas.size() && b==false){
                Locomotora ls=this.listaLocotorasSueltas.get(u);
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

        /*
        Formacion f=this.listaFormaciones.get(id);
        if (!f.puedeMoverse()){
            int u =0;
            boolean b=false;
            while(u<this.listaLocotorasSueltas.size() && b==false){
                Locomotora ls=this.listaLocotorasSueltas.get(u);
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
         */
    }

    public void mostrarListaFormacionesDetalles(){
        System.out.println("_____________________________________");
        System.out.println(" ");
        for(Formacion i : listaFormaciones){
            System.out.println("<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>");
            i.mostrarDetalles();
            System.out.println("<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>");
            System.out.println(" ");
        }
        System.out.println("_____________________________________");
    }

    public void completarFormaciones(){
        //Iterator<Formacion> f = listaFormaciones.iterator();
        for(int i=0 ; i<this.getListaFormacion().size() ; i++){
            this.locomotoraAFormacion(i);
        }
        /*
        Iterator<Locomotora> l = listaLocotorasSueltas.iterator();
        for(Formacion f : listaFormaciones){
            if(!f.puedeMoverse()){
                while(l.hasNext()){
                    if(!f.puedeMoverse()){
                        f.agregarLocomotora(l.next());
                    }else{
                        break;
                    }
                }
            }
        }
         */
        /*
            boolean completa=false;
            if(!f.puedeMoverse()){
                while(!this.getListaLocotorasSueltas().isEmpty() && completa==false){
                    for(Locomotora l : this.getListaLocotorasSueltas()){
                        if(!f.puedeMoverse()){
                            f.agregarLocomotora(l);
                            completa=true;
                        }
                    }
                }
            }
            */

    }
}
