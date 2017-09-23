/**
 * Created by Enzo on 10-06-2017.
 */
public class Frase {

    private String sustantivo = "El Perro";
    private String verbo = "come";
    private String complemento = "pasto";

    public String getFrase(){
        String frase =sustantivo+" "+verbo+" "+complemento;
        return  (frase);
    }
}