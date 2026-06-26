/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6ej5;
import java.util.Comparator;
/**
 *
 * @author Jazmín
 */
public class CompararVagonesPorPesoMaximo implements Comparator<Vagon>{
    @Override
    public int compare(Vagon v1, Vagon v2){
        return Double.compare(v1.pesoMaximo(), v2.pesoMaximo());
    }   
}
