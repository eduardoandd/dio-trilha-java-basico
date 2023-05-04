import javax.swing.event.ChangeEvent;

public class Usuario {

    public static void main(String[] args) {
        SmartTV smartTv = new SmartTV();

        //TV STATUS
        System.out.println("TV ligada? " +smartTv.on);
        smartTv.turnOn();
        System.out.println("E agora? " +smartTv.on);

        //CHANNEL
        System.out.println("A tv está no canal: " +smartTv.channel);
        smartTv.increaseChannel();
        System.out.println("Agora está no canal: " +smartTv.channel);
        smartTv.decraseChannel();
        System.out.println("Agora caiu para: " +smartTv.channel);
        smartTv.changeChannel(88);
        System.out.println("Agora pulei para o: " +smartTv.channel);
        smartTv.continuosIncrementChannel(10);
        System.out.println("Agora é " +smartTv.channel);
        smartTv.continuosDecrementChannel(20);
        System.out.println("Agora é " +smartTv.channel);

        //SOUND
        System.out.println("O volume atual é: " +smartTv.sound);
        smartTv.incraseSound();
        System.out.println("Agora está no volume: " +smartTv.sound);
        smartTv.decraseSound();
        System.out.println("Agora caiu para: " +smartTv.sound);
        smartTv.continuousIncreaseSound(20);
        System.out.println("O volume com o loop é " + smartTv.sound);
        smartTv.continuousDecrementSound(13);
        System.out.println("O volume com o loop negativo é: " +smartTv.sound);

    
    }

    

    
    
}
