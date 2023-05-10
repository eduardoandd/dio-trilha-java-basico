package Apps;
import Apps.ServicoMensagemInstatanea;

public class MSNMessenger extends  ServicoMensagemInstatanea {

    public void enviarMensagem(){ 
        ValidaInternet(); 
        System.out.println("ENVIAR MENSAGEM PELO MSN");
    }
    public void receberMensagem(){
        System.out.println("RECEBENDO MENSAGEM PELO MSGN");
        salvanHistoricoDeMensagem();
    } 
}
