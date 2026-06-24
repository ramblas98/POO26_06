package ejercicio5_interface;

import java.util.Comparator;

public class CompararPesoVagon implements Comparator<Vagon> {
    @Override
    public int compare(Vagon v1,Vagon v2 ){
        return Double.compare(v1.pesoMaximo(), v2.pesoMaximo());
    }
}
