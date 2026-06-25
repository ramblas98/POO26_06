package ejercicio_ferro;

import java.util.Comparator;

public class OrdenarPesoDeLocomotoras implements Comparator<Locomotora> {
    @Override
    public int compare(Locomotora l1, Locomotora l2){
        return Double.compare(l1.getPeso(),l2.getPeso());
    }
}
