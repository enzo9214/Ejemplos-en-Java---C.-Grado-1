/**
 * Created by Enzo on 01-07-2017.
 */
public class Country {

    private String name;
    private String language;
    private String capital;
    private String countryCode;

    public Country(String name, String language, String capital, String countryCode){
        this.name=name;
        this.language=language;
        this.capital=capital;
        this.countryCode=countryCode;
    }

    public void imprimirDatos(){

        System.out.println(this.name + this.capital + this.language + this.countryCode);

    }
}
