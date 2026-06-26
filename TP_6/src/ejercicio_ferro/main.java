package ejercicio_ferro;

public class main {
    public static void main(String[] args){
        /*
        System.out.println("Nuevo Deposito!");
        Deposito d1 = new Deposito();

        Formacion f1 = new Formacion(231);
        Formacion f2 = new Formacion(2144);

        System.out.println("Se creo 2 Formaciones!");
        Locomotora l1 = new Locomotora();
        Locomotora l2 = new Locomotora(2000,4000,8000);

        System.out.println("Se creo 2 Locomotoras para la formacion 1!");
        f1.agregarVagon(new VagonPasajero());
        f1.agregarVagon(new VagonCarga());
        System.out.println("Se creo 2 Vagones para La formacion 1!");
        f1.agregarLocomotora(l2);
        f1.agregarLocomotora(l1);
        System.out.println("Se Agrego las 2 Locomotoras a la Formacion 1!");


        System.out.println("La formacion 1 Puede moverse?:");
        System.out.println(f1.puedeMoverse());
        d1.agregarFormacion(f1);
        d1.agregarFormacion(f2);

        System.out.println("3 Locomotoras sueltas creadas");
        Locomotora sl1 = new Locomotora();
        Locomotora sl2 = new Locomotora();
        Locomotora sl3 = new Locomotora();

        System.out.println("3 Locomotoras sueltas Agregadas!");
        d1.agregarLocomotoraSuelta(sl1);
        d1.agregarLocomotoraSuelta(sl2);
        d1.agregarLocomotoraSuelta(sl3);

        d1.mostrarListaFormacionesDetalles();


        System.out.println("=============================");
        System.out.println("===========DEPOSITO==========");
        System.out.println("=============================");

        Deposito d = new Deposito();

        System.out.println(" ");

        Formacion f1=new Formacion();
        d.agregarFormacion(f1);

        f1.agregarVagon(new VagonPasajero(10, 2));
        f1.agregarVagon(new VagonCarga(10, 3.5, 3000.0));
        Locomotora l1= new Locomotora(1234.0, 4567.0, 7890.0);
        Locomotora l2= new Locomotora(1000.0, 40000.0, 70000.0);
        f1.agregarLocomotora(l1);
        f1.agregarLocomotora(l2);

        System.out.println("--------{ Puede Moverse la Formacion? }--------");
        if(f1.puedeMoverse()){
            System.out.println("---SI---");
        }else{
            System.out.println("---NO---");
        }


        System.out.println(" ");

        Formacion f2=new Formacion();
        d.agregarFormacion(f2);

        System.out.println("--------{ Puede Moverse la Formacion? }--------");
        if(f2.puedeMoverse()){
            System.out.println("---SI---");
        }else{
            System.out.println("---NO---");
        }


        System.out.println(" ");

        //Locomotoras sueltas
        System.out.println("<===========-- Locomotoras sueltas --===========> ");
        Locomotora lSuelta1= new Locomotora(1111.0, 2222.0, 3333.0);
        d.agregarLocomotoraSuelta(lSuelta1);
        Locomotora lSuelta2= new Locomotora(4444.0, 5555.0, 6666.0);
        d.agregarLocomotoraSuelta(lSuelta2);
        Locomotora lSuelta3= new Locomotora(7777.0, 8888.0, 9999.0);
        d.agregarLocomotoraSuelta(lSuelta3);

        System.out.println(" ");

        System.out.println("---ESTADO FORMACIONES INICIAL---");
        d.mostrarListaFormacionesDetalles();

        for (int i = 0; i < d.getListaFormacion().size(); i++) {
            Formacion f = d.getListaFormacion().get(i);
            System.out.println("Formacion " + i + "\n -Puede moverse?: ");
            if (f.puedeMoverse()){
                System.out.println("SI");
            }
            else{
                System.out.println("NO");
            }
            System.out.println();
        }


        //System.out.println("Locomotoras sueltas disponibles: " + d.getListaLocotorasSueltas().size());
        // completa las formaciones que no pueden moverse
        Formacion f3=new Formacion();
        d.agregarFormacion(f3);

        f3.agregarVagon(new VagonPasajero(1, 1));
        f3.agregarVagon(new VagonCarga(1, 1, 30.0));
        Locomotora la= new Locomotora(12.0, 45.0, 78.0);
        f3.agregarLocomotora(la);
        if(f3.puedeMoverse()){
            System.out.println("---SI---");
        }else{
            System.out.println("---NO---");
        }

        Formacion f4=new Formacion();
        d.agregarFormacion(f4);

        f4.agregarVagon(new VagonPasajero(2, 1));
        f4.agregarVagon(new VagonCarga(3, 1, 20.0));
        Locomotora lb= new Locomotora(11.0, 35.0, 48.0);
        f4.agregarLocomotora(lb);
        if(f4.puedeMoverse()){
            System.out.println("---SI---");
        }else{
            System.out.println("---NO---");
        }

        System.out.println(" ");

        Locomotora lSuelta4= new Locomotora(101.0, 350.0, 480.0);
        d.agregarLocomotoraSuelta(lSuelta4);
        Locomotora lSuelta5= new Locomotora(121.0, 50.0, 180.0);
        d.agregarLocomotoraSuelta(lSuelta5);
        Locomotora lSuelta6= new Locomotora(111.0, 150.0, 480.0);
        d.agregarLocomotoraSuelta(lSuelta6);
        Locomotora lSuelta7= new Locomotora(131.0, 124.0, 280.0);
        d.agregarLocomotoraSuelta(lSuelta7);

        System.out.println("\n---ESTADO FORMACIONES INICIAL---");
        d.mostrarListaFormacionesDetalles();
        System.out.println("\nLocomotoras sueltas en el deposito: " + d.getListaLocotorasSueltas().size());

        System.out.println(" ");

        System.out.println("\nCompletar formaciones que no pueden moverwse");
        d.completarFormaciones();

        System.out.println(" ");

        System.out.println("\n---ESTADO FORMACIONES FINAL---");
        d.mostrarListaFormacionesDetalles();
        System.out.println("Locomotoras sueltas en el deposito: " + d.getListaLocotorasSueltas().size());
        */
        //System.out.println("Verificacion: " + f3.puedeMoverse());
        //System.out.println("Verificacion: " + f4.puedeMoverse());
        //Agregar locomotoras sueltas necesarias
        /*f3.agregarLocomotora(new Locomotora(101.0, 350.0, 480.0));
        f3.agregarLocomotora(new Locomotora(121.0, 50.0, 180.0));
        f3.agregarLocomotora(new Locomotora(111.0, 150.0, 480.0));


        while(f3.puedeMoverse()==false){

            System.out.println("La formacion ya puede moverse");
        }

        f4.agregarLocomotora(new Locomotora(11.0, 30.0, 480.0));
        f4.agregarLocomotora(new Locomotora(141.0, 340.0, 330.0));
        f4.agregarLocomotora(new Locomotora(114.0, 460.0, 50.0));*/


        //d.locomotoraAFormacion(lSuelta1);
        //d.locomotoraAFormacion(lSuelta2);
        //d.locomotoraAFormacion(lSuelta3);

        Deposito d1 = new Deposito();


    }
}
