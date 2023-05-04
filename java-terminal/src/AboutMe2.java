import java.util.Scanner;

public class AboutMe2 {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = scanner.next();

        System.out.println("Qual sua idade?");
        int idade = scanner.nextInt();

        System.out.println("Qual seu sexo?");
        String sexo = scanner.next();

        System.out.println("Seu nome registrado é: " +nome+ ", sua idade é: " +idade+ ", do sexo: " +sexo);


    }

    
}
