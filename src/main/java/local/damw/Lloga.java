package local.damw;

public class Lloga {
  
    protected Cotxe cotxe = null;
    protected Client client = null;
    protected String dataInici = null;
    protected String dataFi = null;
    protected double preu = 0;   

    public Lloga(Cotxe c, Client cl, String dataInici, String dataFi, Double preu){
        this.client = cl;
        this.cotxe = c;
        this.dataInici = dataInici;
        this.dataFi = dataFi;
        this.preu = preu;
    }
}
