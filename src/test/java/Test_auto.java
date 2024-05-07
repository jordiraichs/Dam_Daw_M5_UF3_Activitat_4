import local.damw.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class Test_auto {
   
    private boolean resultat;

    @Test
    public void matriculaCorrecta_Test() throws Exception{
        
        /** Prova 1: cami 1   */
        String matricula = "12234SDF";
        resultat = Automobil.matriculaCorrecta(matricula);
        
        assertFalse(resultat); // esperem que resultat sigui fals
       
        /** Prova 2: cami 2 */
        matricula = "@223SSF";
        resultat = Automobil.matriculaCorrecta(matricula);
        assertFalse(resultat); // esperem que resultat sigui fals
        
        /** Prova 3: cami 3 */
        matricula = "1223A1A";
        resultat = Automobil.matriculaCorrecta(matricula);
        assertFalse(resultat); // esperem que resultat sigui fals
        
        /** Prova 4: cami 4 */
        matricula = "2222ABC";
        resultat = Automobil.matriculaCorrecta(matricula);
        assertTrue(resultat); // esperem que resultat sigui True

    }

    @Test
    public void provarConcecionari(){
        Concessionari con1 = new Concessionari("LLEIDA001");
        
        con1.altaCotxe("BMW", "X3", "1234ABC", 2000, "Gasolina");
        con1.altaCotxe("AUDI", "A2", "1244ABC", 24000, "Diesel");
        con1.altaCotxe("BMW", "X1", "1224ABC", 2000, "Gasolina");
        con1.altaCotxe("BMW", "X2", "2234ABC", 2000, "Gasolina");
        con1.mostrarCotxes();

        con1.altaClient("12345A","Pep");
        con1.altaClient("22222A","Maria");
        con1.altaClient("33333A","Ton");
        con1.altaClient("44444A","Pol");
        con1.mostrarClients();
       
        
        con1.llogarCotxe("22222A","1234ABC","10/5/2024", "10/5/2024",123.4);
        con1.llogarCotxe("33333A","1244ABC","10/5/2024", "10/5/2024",123.4);
        con1.mostrarLloguers();

        con1.retornaCotxe("1234ABC");
        con1.mostrarLloguers();

    }

}
