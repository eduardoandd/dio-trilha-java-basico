import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
         
        double mesada = 50.00;
        while(mesada > 0){
            double valorDoce = valorAleatorio();
            System.out.println("O valor do doce é " +valorDoce);

            if(valorDoce > mesada){
                valorDoce = mesada;
            }

            mesada = mesada-valorDoce;
            System.out.println("Sua mesada agora é: " +mesada);

        }

        System.out.println("O que restou foi: " + mesada);

    }

    
  
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
