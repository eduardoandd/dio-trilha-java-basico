public class TelegramMessenger extends  ServicoMensagemInstatanea {

    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("ENVIAR MENSAGEM PELO Telegram");
        receberMensagem();
        salvarHistorico();
    }
}
