/**
 * Created by Enzo on 01-07-2017.
 */
public abstract class Persona {

    private String name;
    private String rut;
    private String fechaDeNacimiento;
    private String domicilio;

    public Persona(String name,String rut,String fechaDeNacimiento){
        this.setName(name);
        this.setRut(rut);
        this.setFechaDeNacimiento(fechaDeNacimiento);
        System.out.println("Persona Creado");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public abstract String imprimirDatos();
}
