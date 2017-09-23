/**
 * Created by Enzo on 01-07-2017.
 */
public class Ingeniero extends Empleado {

    private String idIngeniero;

    public Ingeniero(String name, String rut, String fechaNacimiento, String fechaContrato){
        super(name, rut, fechaNacimiento, fechaContrato,"ingeniero");
        System.out.println("Ingeniero Creado");
    }

    public String getIdIngeniero() {
        return idIngeniero;
    }

    public void setIdIngeniero(String idIngeniero) {
        this.idIngeniero = idIngeniero;
    }

}
