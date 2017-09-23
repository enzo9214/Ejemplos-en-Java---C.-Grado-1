/**
 * Created by Enzo on 01-07-2017.
 */
public class Empleado extends Persona {

    private int numEmpleado;
    private String puesto;
    private String fechaContrato;
    private double sueldo;

    public Empleado(String name, String rut, String fechaNacimiento, String fechaContrato, String puesto){
        super(name, rut, fechaNacimiento);
        this.setFechaContrato(fechaContrato);
        this.setNumEmpleado();
        this.setPuesto(puesto);
        System.out.println("Empleado Creado");
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado() {

    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(String fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void aumentarSueldo(double aumento) throws SueldoInvalidoException{
        if (aumento <=0){
            throw new SueldoInvalidoException("El aumento ingresado es menor o igual a 0");
        }
        else
        {
            setSueldo(getSueldo()+aumento);
            System.out.println("El nuevo sueldo de "+getName()+" es $"+getSueldo());
        }
    }

    public String imprimirDatos(){
        return ("Datos Empleado\n Nombre: "+getName());
    };
}
