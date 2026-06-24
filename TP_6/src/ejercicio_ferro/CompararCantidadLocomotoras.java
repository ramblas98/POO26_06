package ejercicio5_interface;

import java.util.Comparator;

public class CompararCantidadLocomotoras implements Comparator<Formacion> {
    @Override
    public int compare(Formacion f1,Formacion f2){
        return Integer.compare(f1.getLocomotoras().size(),f2.getLocomotoras().size());
    }
}
