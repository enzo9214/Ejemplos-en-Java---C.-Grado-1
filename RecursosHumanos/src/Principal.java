import javax.swing.*;
import java.sql.Array;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
    public static void main (String [] args){


        JFrame frame = new JFrame("Start");
        frame.setContentPane(new Start().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona("Pedro");
        Persona persona4 = new Persona("Juan","Su Casa","1992-06-15");

        Empleado empleado1 = new Empleado("Juanita");
        Empleado empleado2 = new Empleado("Rodrigo","Su Casita",62,"Ingeniero",1200000);

        ArrayList<String> lista = new ArrayList<>();

        Scanner datosin = new Scanner(System.in);
        String data = datosin.nextLine();

        lista.add(0,"Posicion 1");
        lista.add("Posicion 2");
        lista.add(data);

        System.out.println(lista);

            persona1.setNombre("Enzo");
            persona1.setEdad(25);
            persona1.setDomicilio("Cervantes 2942");

            persona2.setNombre("Camila");
            persona2.setEdad(24);
            persona2.setDomicilio("Cervantes 2942");

            System.out.println(Persona.getNacionalidad());
            System.out.println("Datos: "+persona1.getNombre()+", "+persona1.getEdad()+", "+persona1.getDomicilio());

            System.out.println(Math.random());

            persona1.imprimeDatos();
            persona2.imprimeDatos("Titulo Variable");

            persona4.calculaEdad();

            System.out.println(empleado1.toString());
            System.out.println(empleado2.toString());

    }
}
