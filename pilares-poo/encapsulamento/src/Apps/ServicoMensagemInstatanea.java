package Apps;

public abstract class ServicoMensagemInstatanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void ValidaInternet() {
        // TODO Auto-generated method stub
        System.out.println("VALIDANDO SE ESTÁ CONECTADO");
    }

    protected void salvanHistoricoDeMensagem(){
        System.out.println("SALVANDO HISTÓRICO DE MENSAGEM");
    }
}
