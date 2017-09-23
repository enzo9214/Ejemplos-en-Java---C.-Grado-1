import java.awt.datatransfer.FlavorEvent;
import java.sql.Date;

/**
 * Created by Enzo on 17-06-2017.
 */

public class Persona {
    private String nombre;
    private String domicilio;
    private int edad;
    private String fechadenacimiento;
    private static String nacionalidad = "Chilena";


    public Persona(){
        System.out.println("Persona Creada...Constructor 1");
    }

    public Persona(String nombre){
        System.out.println("Persona Creada...Constructor 2");
    }

    public Persona(String nombre, String domicilio, String fechadenacimiento){

        this.setNombre(nombre);
        this.setDomicilio(domicilio);
        this.fechadenacimiento=fechadenacimiento;
        System.out.println("Persona Creada...Constructor 3");

    }


    public void calculaEdad(){

        Date fecha=Date.valueOf(fechadenacimiento);
        System.out.print("Edad Calculada: " );
        System.out.print(2017-fecha.toLocalDate().getYear());

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public int getEdad() {
        return edad;
    }

    public static String getNacionalidad(){return nacionalidad;}

    public void imprimeDatos(String titulo){
        System.out.println(titulo);
        System.out.println("==========================");
        System.out.println("Nombre: "+nombre);
        System.out.println("Domicilio: "+domicilio);
        System.out.println("Edad: "+edad);
        System.out.println("==========================");
    }

    public void imprimeDatos(){
        System.out.println("Datos: "+getNombre()+" "+getDomicilio()+" "+getEdad());
    }

}
