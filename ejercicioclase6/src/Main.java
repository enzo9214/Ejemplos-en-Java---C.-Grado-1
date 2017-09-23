import java.util.ArrayList;

/**
 * Created by Enzo on 01-07-2017.
 */
public class Main {

    public static void main(String[] args) {

        ArrayList <Country> countries = new ArrayList();

        for (int i = 0; i < 30; i++) {
            countries.add(new Country("Pais" + i, "Lengua" + i, "Capital" + i, "CoC" + i));
        }

        for (Country i : countries) {
            i.imprimirDatos();
        }

        for (int i = 29; i > 14; i--) {
                countries.remove(i);
            }

        System.out.println(countries.size());
        }

    }

