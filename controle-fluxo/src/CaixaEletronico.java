import javax.sql.rowset.serial.SerialDatalink;

public class CaixaEletronico {
    
    public static void main(String[] args) {
        double balance = 25;
        double requestValue=17;

        if(requestValue < balance){
            balance -= requestValue;
        }

        System.out.println(balance);
    }
    
}
