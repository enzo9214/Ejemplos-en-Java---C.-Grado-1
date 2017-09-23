/**
 * Created by Enzo on 10-06-2017.
 */

import java.util.*;

public class Main {

    public static void  main(String [] args) {
        float a, b;
        Date date=new Date();
        System.out.println(date.getTime());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese a:");
        a = scanner.nextFloat();
        System.out.println("Ingrese b:");
        b = scanner.nextFloat();

        System.out.println("a+b: "+ (a+b));
        System.out.println("a-b: "+ (a-b));
        System.out.println("a*b: "+ (a*b));
        System.out.println("a/b: "+ (a/b));
        System.out.println("a%b: "+ (a%b));


    }
}
