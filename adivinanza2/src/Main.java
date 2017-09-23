import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int modo;
        System.out.println("Ingresa 1 o 2, Modo cmd:1, modo grafico:2");
        modo = scanner.nextInt();

        int intento = 1;
        int numero;
        int numrandom;


        switch (modo){
            case 1:
                while (intento <= 3) {
                    System.out.println("Ingresa un numero del 1 al 7, Intento: " + intento);
                    numero = scanner.nextInt();

                    numrandom = (int) (Math.random() * 6) + 1;

                    if (numero == numrandom) {

                        System.out.println("Ganaste");
                        break;
                    } else {
                        System.out.println("Intenta otra vez, era el " + numrandom);
                    }
                    intento++;
                }
                break;
            case 2:

                break;
            default:
                System.out.println("Opcion no permitida");
        };

    }

}



