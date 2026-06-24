package ejercicio5_interface;

import java.util.Comparator;

public class CompararCantidadDeVagones implements Comparator<Formacion> {
    @Override
    public int compare(Formacion v1,Formacion v2){
        return Integer.compare(v1.getVagones().size(),v2.getVagones().size());
    }
}
