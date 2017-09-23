package PPSistema;

import javax.swing.*;

import Controller.HuellaController;
import View.FormCredit;
import Controller.DB.*;

//En Model las clases del negocio
//Person.class, Empresa.class, etc..

//En Controller va la logica del negocio, va entre Model y View (es el unico que sabe que existen ambos)
//Aca van las consultas SQL, Patron DataAccessObject -> reflejar resultados de query en un Objeto (Modelo)

//View -> Forms

import View.FormCredit;

/**
 * Created by Enzo on 15-07-2017.
 */
public class Main {
    public static void main(String [] args){

      /*  JFrame rootFrame = new JFrame("Agregar Credito");
        rootFrame.setSize(300,150);
        rootFrame.setContentPane(new FormCredit().panel1);
        rootFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rootFrame.setVisible(true);
        */

        HuellaController huella = new HuellaController();
        huella.Iniciar();
        huella.start();
        huella.
    }
}
