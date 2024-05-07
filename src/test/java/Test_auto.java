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

}
