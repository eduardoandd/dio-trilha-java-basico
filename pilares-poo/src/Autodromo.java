import java.util.Scanner;

public class Autodromo {

   public static void main(String[] args) {

        Carro jeep = new Carro();
        // jeep.setChassi("387282");
        // jeep.ligar();

        Veiculo coringa = jeep;
        coringa.ligar();


        Moto z400 = new Moto();
        z400.ligar();
        z400.setChassi("237828");


   }
}
