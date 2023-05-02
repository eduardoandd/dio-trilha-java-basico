import java.util.concurrent.locks.Condition;

public class OperadoresLogicos {

    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;
    
        if(condicao1 || condicao2 ){
            System.out.println("ou");
        }

        if(condicao1 && condicao2){
            System.out.println("e");
        }

        if(condicao1 == true && condicao2 == false){
            System.out.println("e");
        }

        if(condicao1 && (7>4)){
            System.out.println("Verdadeiro");
        }


    }

   
    
}
