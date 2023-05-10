package Apps;
import Apps.ServicoMensagemInstatanea;

public class TelegramMessenger extends  ServicoMensagemInstatanea {

    
    public void enviarMensagem(){  
        ValidaInternet();
        System.out.println("ENVIAR MENSAGEM PELO TELEGRAM");
    }
    public void receberMensagem(){
        System.out.println("RECEBENDO MENSAGEM PELO TELEGRAM");
    }
    
}
