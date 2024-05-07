package local.damw;

public class Main {
    public static void main(String[] args) {
      
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