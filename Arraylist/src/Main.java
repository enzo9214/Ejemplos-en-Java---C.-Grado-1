import java.util.ArrayList;

/**
 * Created by Enzo on 17-06-2017.
 */
public class Main {

    public static void main (String[] args){

        ArrayList<Persona> amigos =new ArrayList<>();

        Persona p1 = new Persona("Enzo");
        p1.setEmail("enzo.9214@gmail.com");

        amigos.add(p1);
        amigos.add(new Persona("Josue"));

        System.out.println(amigos.size());
        for (Persona p: amigos){
            System.out.println(p.getName());    //enhanced for
        }
    }
}
