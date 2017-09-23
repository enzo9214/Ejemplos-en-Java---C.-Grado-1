/**
 * Created by Enzo on 01-07-2017.
 */
public class Empleado extends Persona {

    private int numEmp;
    private String puesto;
    private double sueldo;

    public Empleado(String nombre){
        super(nombre);
    }

    public Empleado(String nombre, String domicilio, int edad, String puesto, double sueldo){
        super(nombre,domicilio,"");
        super.setEdad(edad);
        this.puesto=puesto;
        this.sueldo=sueldo;
    }

    public void setNumEmp(int numEmp) {
        this.numEmp = numEmp;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getNumEmp() {
        return numEmp;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString(){
        return (getNombre()+getDomicilio()+getEdad()+getNacionalidad()+getPuesto()+getNumEmp()+getSueldo());
    };

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
