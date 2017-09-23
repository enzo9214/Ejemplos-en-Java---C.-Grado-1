/**
 * Created by Enzo on 17-06-2017.
 */
public class Main{


    public static void main(String [] args) {
        int numero;
        int numrandom;
        numrandom = Math.random()*7;
        numero = Integer.parseInt(args[0]);
        System.out.println("Ingresaste el numero "+numero);

        if (numero == numrandom)
        {

            System.out.println("Ganaste");

        }
        else
        {
            System.out.println("Perdiste");
        }
    }
}
