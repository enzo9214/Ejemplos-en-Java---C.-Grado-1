/**
 * Created by Enzo on 17-06-2017.
 */
public class main {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 30; i++) {
            if (i == 10 || i == 15) continue;
            if (i == 28) break;
            suma = suma + i;
        }
        System.out.println(suma);
    }
}
