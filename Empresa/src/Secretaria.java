/**
 * Created by Enzo on 01-07-2017.
 */
public class Secretaria extends Empleado{

    private String pisoAsignado;

    public Secretaria(String name, String rut, String fechaNacimiento, String fechaContrato){
        super(name, rut, fechaNacimiento, fechaContrato,"secretaria");
        System.out.println("Secretaria Creado");
    }

    public String getPisoAsignado() {
        return pisoAsignado;
    }

    public void setPisoAsignado(String pisoAsignado) {
        this.pisoAsignado = pisoAsignado;
    }
}



