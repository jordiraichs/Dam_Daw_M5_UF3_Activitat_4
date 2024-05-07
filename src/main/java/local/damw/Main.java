package local.damw;

public class Main {
    public static void main(String[] args) {
      
        Concessionari concessionari = new Concessionari("Lleida");
        concessionari.mostrarDades();

        concessionari.altaCotxe("BMW", "X5", "1234ABC", 1000, "Gasolina");
        concessionari.mostrarCotxes();



       
    }

}