/**
 * Created by Enzo on 17-06-2017.
 */
public class Main {
    public static void main(String [] args){
        String nombre = "Naomi";
        String temporal = "";
        int intentos=0;
        while (!temporal.equalsIgnoreCase(nombre)){
            temporal="";
            while (temporal.length()<nombre.length()){
                char asciiChar = (char) (Math.random()*26+97);
                temporal += asciiChar;



            }

            intentos++;

        }
        System.out.println(nombre+" encontrado en "+intentos+ " intentos");

    }
}
