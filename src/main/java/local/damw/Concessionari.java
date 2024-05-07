package local.damw;

import java.util.ArrayList;
import java.util.HashMap;

public class Concessionari {
    // Atributs
    private String nom;
    private ArrayList<Cotxe> llistaCotxes = new ArrayList<Cotxe>();
    private ArrayList<Client> llistaClients = new ArrayList<Client>();
    private HashMap<String,Lloga> llistaLloguers = new HashMap<String,Lloga>();

    // Constructor
    public Concessionari(String nom) { this.nom = nom; }

    public void altaCotxe(String marca, String model, String matricula,int km, String combustible){
        if(Automobil.matriculaCorrecta(matricula)){
            Cotxe c = new Cotxe(marca,model,matricula,km,combustible);
            this.llistaCotxes.add(c);
            System.out.println(" Alta auto : " + c.matricula );
        } else {
            System.out.println("matricula :" + matricula + "No correcta");
        }
    }

    public void baixaCotxe(String matricula) {
        // falta comprovar que no està llogat
        boolean trobat = false;
        int i = 0;
        while (!trobat && i<llistaCotxes.size()) {
            Cotxe c = llistaCotxes.get(i);
            if (c.matricula.equals(matricula)){
                trobat = true;
                llistaCotxes.remove(i);
            }
            i = i + 1;  
        }
        if(trobat){
             System.out.println("Baixa auto : " + matricula);
        } else { System.out.println(" NO Existeix : " + matricula);}
    }

    public void altaClient(String dni, String nom){
        Client c = new Client(dni,nom);
        this.llistaClients.add(c);
        System.out.println(" Alta Client : " + c.nom);
    }

    public void baixaClient(String dni){
        for(Client c : this.llistaClients){
            if(c.dni.equals(dni)){
                this.llistaClients.remove(c);
                System.out.println(" Client amb dni " + dni + " és Baixa");
                return;
            }
        }
        System.out.println(" Client amb dni " + dni + " No existeix !!");
    }

    public void mostrarCotxes(){
        System.out.println("\n Concessionari de " + this.nom);
        System.out.println(" -- Llistat de cotxes -- ");
        for(Cotxe c : llistaCotxes){
            System.out.println(c.mostrarDades());
        }
    }

    public void mostrarClients(){
        System.out.println("\n Concessionari de " + this.nom);
        System.out.println(" -- Llistat de clients -- ");
        for(Client c : this.llistaClients){
            System.out.println(c.mostrarDades());
        }
    }

    public void llogarCotxe(String dni,String matricula, String dataInici, String dataFi, Double preu){
        if(existeixClient(dni) && existeixCotxe(matricula)){
            String clau = matricula;
            Lloga reserva = new Lloga(getCotxe(matricula),getClient(dni), dataInici, dataFi, preu);
            llistaLloguers.put(clau, reserva);
            System.out.println(" Alta reserva : " + matricula );
        } else System.out.println(" Problemes amb el client i/o cotxe ... fallo");
    }

    public void retornaCotxe(String matricula){
        if(llistaLloguers.containsKey(matricula)){
            llistaLloguers.remove(matricula);
            System.out.println(" Cotxe amb matrícula " + matricula + " ha estat retornat");
        } else {
            System.out.println(" Cotxe amb matrícula " + matricula + " NO EXISTEIX");
        }
    }

    public void mostrarLloguers(){
        System.out.println("\n Llista lloguers");
        for(String key : llistaLloguers.keySet()){
            Lloga l = llistaLloguers.get(key);
            System.out.println(l.client.mostrarDades() + " : " + l.cotxe.mostrarDades());
        }
    }

    /** Mètodes privats */
    private Cotxe getCotxe(String matricula){
        Cotxe co = null;
        for (Cotxe c : this.llistaCotxes) {
            if (c.matricula.equals(matricula)) {
                co = c;
            }
        }
        return co;
    }

    private Client getClient(String dni){
        Client cl = null;
        for (Client c : this.llistaClients) {
            if (c.dni.equals(dni)) {
                cl = c;
            }
        }
        return cl;
    }

    private boolean existeixCotxe(String matricula) {
        for (Cotxe c : this.llistaCotxes) {
            if (c.matricula.equals(matricula)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean existeixClient(String dni) {
        for (Client c : this.llistaClients) {
            if (c.dni.equals(dni)) {
                return true;
            }
        }
        return false;
    }

}
