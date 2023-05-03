public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.on);
        System.out.println("Canal Atual: " + smartTv.channel);
        System.out.println("Volume atual: " + smartTv.sound);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.on);

        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.on);

        System.out.println("O volume é: " + smartTv.sound);

        smartTv.increaseSound();
        System.out.println("Atualização de status -> O volume é: " + smartTv.sound);

        smartTv.decraseSound();
        System.out.println("Atualização de status -> O volume é: " + smartTv.sound);

        smartTv.increaseChannel();
        System.out.println("O canal atual é: " + smartTv.channel);

        smartTv.decraseChannel();
        System.out.println("O canal atual é: " + smartTv.channel);

        smartTv.changeChannel(10);
        System.out.println("O canal selecionado é: " + smartTv.channel);

       
    }


    
}
