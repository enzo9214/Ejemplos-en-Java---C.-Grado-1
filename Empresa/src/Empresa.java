import java.util.ArrayList;

/**
 * Created by Enzo on 01-07-2017.
 */
public class Empresa {

    private String nombreEmpresa;
    private String domicilioEmpresa;
    private String telefonoEmpresa;
    private int empleados;
    private ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    public Empresa(String nombre, String domicilio,String telefono){
        this.setNombre(nombre);
        this.setDomicilio(domicilio);
        this.setTelefono(telefono);
        System.out.println("Empresa Creada!");
    }

    public void altaEmpleado(String name, String rut, String fechaDeNacimiento, String fechaContrato, String puesto){
        listaEmpleados.add(new Empleado(name,rut,fechaDeNacimiento,fechaContrato,puesto));
        System.out.println("Empleado Agregado");
    }

    public void consultaEmpleado(int index){
        Empleado empleado = listaEmpleados.get(index);
        System.out.println(empleado.getName());
    }

    public void bajaEmpleado(int index){
        listaEmpleados.remove(index);
        System.out.println("Empleado Removido");
    }

    public void actualizaEmpleado(int index, String nuevoDomicilio){
        Empleado empleado = listaEmpleados.get(index);
        empleado.setDomicilio(nuevoDomicilio);
        System.out.println("Domicilio Actualizado");
    }


    public void aumentarSueldoEmpleado(int index, double nuevoSueldo){
        Empleado empleado = listaEmpleados.get(index);
        empleado.setSueldo(nuevoSueldo);
        System.out.println("Sueldo Actualizado");
    }

    public void cambiarPuesto(int index, String nuevoPuesto){
        Empleado empleado = listaEmpleados.get(index);
        empleado.setPuesto(nuevoPuesto);
        System.out.println("Puesto Actualizado");
    }

    public void imprimirEmpleados(){
        System.out.println("===============");
        System.out.println("Lista Empleados");
        System.out.println("===============");
        for (Empleado i: listaEmpleados){
            System.out.println(i.imprimirDatos());
        }
    }


    public String getNombre() {
        return nombreEmpresa;
    }

    public void setNombre(String nombre) {
        this.nombreEmpresa = nombre;
    }

    public String getDomicilio() {
        return domicilioEmpresa;
    }

    public void setDomicilio(String domicilio) {
        this.domicilioEmpresa = domicilio;
    }

    public String getTelefono() {
        return telefonoEmpresa;
    }

    public void setTelefono(String telefono) {
        this.telefonoEmpresa = telefono;
    }

    public int getEmpleados() {
        return empleados;
    }


    @Override
    public String toString(){
       return (getNombre());
    }
}
