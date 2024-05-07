package local.damw;

public class Persona {
    // Atributs
    protected String dni;
    protected String nom;
 
    // Mètodes si es crrenen setters i getters --> atributs poden ser privats
    public Persona(String dni, String nom){
        this.dni = dni;
        this.nom = nom;
    }

    public String mostrarDades(){
        return "dni : " + this.dni + " nom : " + this.nom;
    }
}
