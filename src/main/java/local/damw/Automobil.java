package local.damw;

/**
 * Definició de la classe Automobil ABSTRACTA
 *  No podem crear instàncies (o objectes) de la classe
 *  És utilitzada com a base per altres classes. Poden implementar mètodes (els INTEFACE NO)
 *  Els mètodes han d'estar implementats a les classes que hereden
 */
public abstract class Automobil {

    // variables de instància (atributs)
    protected String marca;
    protected String model;
    protected String matricula;
    protected int km;

    // atributs estàtics
    protected static int totalAutos = 0;  
    private static final int LONG_MATRICULA = 7; // longitud de la matricula

    // Setters i Getters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }   
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }   
    public int getKm() { return km; }
    public void setKm(int km) { this.km = km; }
    
    // MÈTODES ABSTRACTES : sense dades, el sobreescrivim en totes les classes derivades
    public abstract  float consumBenzina(float litresX100);
    
    // Mètodes IMPLEMENTATS  (els INTERFACES no implementen cap mètode)
    public String mostrarDades(){
        return " marca : " + this.marca + " | model : " + this.model + " | matricula : " + this.matricula + " | km : " + this.km;
    }; 

    // Mètode ESTATIC es crida amb la classe.
    protected static int getTotalAutos() { return totalAutos; }

    // Funció estàtica ens retorna true si matricula correcta
    public static boolean matriculaCorrecta (String matricula){
        char[] mat = matricula.toCharArray();
        int longitud = matricula.length();
        boolean correcta = true;
        int i = 0;
        
        if(longitud != LONG_MATRICULA) correcta = false; 
        while (correcta == true && i < longitud){ 
            char c = mat[i];
    
            if( i < 4 && Character.isDigit(c)){
                i = i + 1; 
            } else if ( i >= 4 && i < longitud && Character.isUpperCase(c)) {
                i = i + 1;
            } else {
                correcta = false;
            }
        }

        return correcta;
    }

}
