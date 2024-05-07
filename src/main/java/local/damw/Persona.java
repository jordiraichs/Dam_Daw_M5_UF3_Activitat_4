package local.damw;

public class Persona {
    protected String dni;
    protected String nom;

    public Persona(String dni, String nom){
        this.dni = dni;
        this.nom = nom;
    }

    public String mostrarDades(){
        return "dni : " + this.dni + " nom : " + this.nom;
    }
}
