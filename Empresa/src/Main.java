/**
 * Created by Enzo on 01-07-2017.
 */
public class Main {

    public static void main(String [] args){

    Empresa empresa = new Empresa("Empresita","Mi casita","99999999");
    empresa.altaEmpleado("Enzo","17.961.926-1","14/01/1992","07/07/2017","Vendedor");
    empresa.altaEmpleado("Camila","18.356.975-9", "25/12/1992","16/02/2017","Vendedora");
    Ingeniero ingeniero = new Ingeniero("Roberto","74116396","27/03/1957","16/02/2017");
    Empleado empleado = new Empleado("Juan","115545459","10/3/1987","11/9/2015","Aseo");

    try
    {
        empleado.aumentarSueldo(10);
    }
    catch (SueldoInvalidoException sie)
    {
        System.out.println("No se pudo completar la operación: "+ sie.getMessage());
    };

        //empresa.consultaEmpleado(1);
        //empresa.bajaEmpleado(1);
        //empresa.actualizaEmpleado(1,"Otra casita")
        //empresa.aumentarSueldoEmpleado(1,100000);
        //empresa.cambiarPuesto(0,"Encargado Aseo")
        //empresa.imprimirEmpleados();
    }
}
