package ejercicio_ferro;

public class VagonPasajero extends Vagon{

    public VagonPasajero(){
        super();
    }

    public VagonPasajero(double largo, double ancho) {
        super(largo, ancho);
    }

    @Override
    public double pesoMaximo() {
        return this.cantidadPasajeros()*80;
    }

    @Override
    public boolean esLiviano() {
        return this.pesoMaximo() < 2500;
    }

    @Override
    public int cantidadPasajeros() {
        //ancho útil
        if(super.getAncho()<=2.5){
            return (int) ((super.getLargo()*8));
        }
        return (int) ((super.getLargo()*10));
    }
}
