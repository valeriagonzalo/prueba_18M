package es.uah.matcomp.mp.e1.ejerciciosclases.b;

public class Author {
    //Variables
    private String name;
    private String email;

    //Constructores:
    public Author (String n, String e) {
        this.name = n;
        this.email = e;
    }

    //Getters:
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    //Setters:
    public void setEmail(String email) {
        this.email = email;
    }

    //ToString:
    public String toString() {
        return "Author[name= "+name+",email= "+email+"]";
    }
}
