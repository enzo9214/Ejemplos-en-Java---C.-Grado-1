/**
 * Created by Enzo on 17-06-2017.
 */
public class Persona {
    private String name;
    private String lastname;
    private String email;

    public Persona(String name){
       this.name = name;
       System.out.println("Persona...Created.");
    }

    public String getName()
    {
    return name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
