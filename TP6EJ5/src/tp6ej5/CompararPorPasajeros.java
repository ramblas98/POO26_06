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
public class CompararPorPasajeros implements Comparator{
    @Override
    public int compare(Object o1, Object o2){
        Formacion f1 = (Formacion) o1; 
        Formacion f2 = (Formacion) o2;
        return Integer.compare(f1.totalPasajeros(), f2.totalPasajeros());
    }
}
