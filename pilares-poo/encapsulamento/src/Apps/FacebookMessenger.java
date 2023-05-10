package Apps;
public class FacebookMessenger extends  ServicoMensagemInstatanea {

    public void enviarMensagem(){
        ValidaInternet();  
        System.out.println("ENVIAR MENSAGEM PELO FACEBOOK");
    }
    public void receberMensagem(){
        System.out.println("RECEBENDO MENSAGEM PELO FACEBOOK");
    }   
}
