public class MSNMessenger extends  ServicoMensagemInstatanea {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("ENVIAR MENSAGEM PELO MSN");
        receberMensagem();
        salvarHistorico();
    }
}
