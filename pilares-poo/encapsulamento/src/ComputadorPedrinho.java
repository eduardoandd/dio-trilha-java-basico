import java.util.Scanner;

import Apps.FacebookMessenger;
import Apps.MSNMessenger;
import Apps.ServicoMensagemInstatanea;
import Apps.TelegramMessenger;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        
        /*
         *  NÃO SE SAVE QUAL APP
         *  MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
         */

        ServicoMensagemInstatanea smi = null;
       

        //System.out.println("ESCOLHA O APP DE INICIALIZAÇÃO");
        String appEscolhido = "msn";

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("face"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("telegram"))
            smi = new TelegramMessenger();

           
            smi.enviarMensagem();
            smi.receberMensagem();
    }
}
