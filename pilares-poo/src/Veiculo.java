import java.util.Scanner;

public abstract class Veiculo {

    private String chassi;

    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public void ligar(){

        Scanner sc = new Scanner(System.in);
        System.out.println("1 = sim, 0 = não");

        int temCombustivel = sc.nextInt();

        if(confereCombustivel(temCombustivel) == true){
            System.out.println("VEICULO LIGADO");
        }
        else{
            System.out.println("ABASTECER");
            abastecer();
        }
    }

    private boolean confereCombustivel(int temCombustivel){
        
        //Scanner sc = new Scanner(System.in);
        int tanque = temCombustivel;

        if(tanque == 1){
            return true;
        }
        else{
            return false;
            
        }
    }
    private void abastecer(){
        double seuDinheiro = 50;
        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto você deseja abastecer?");
        double valor = sc.nextDouble();

        if(seuDinheiro >= valor){
            System.out.println("Carro abastecido");
            System.out.println("Sobrou:" + (seuDinheiro-valor));
        }
        else{
            System.out.println("Você ta pobre");
        }
    }

    
}
