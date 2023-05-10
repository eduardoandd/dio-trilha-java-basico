public class FacebookMessenger extends  ServicoMensagemInstatanea {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("ENVIAR MENSAGEM PELO Facebook");
        receberMensagem();
        salvarHistorico();
    }
}
