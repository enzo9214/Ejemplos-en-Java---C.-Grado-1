/**
 * Created by Enzo on 01-07-2017.
 */
public class Gerente extends Empleado {

    private String area;

    public Gerente(String name, String rut, String fechaNacimiento, String fechaContrato){
        super(name, rut, fechaNacimiento, fechaContrato,"gerente");
        System.out.println("Gerente Creado");
    }

    public void setArea(String area){
        this.area=area;
    }

    public String getArea(){
        return area;
    }

}
