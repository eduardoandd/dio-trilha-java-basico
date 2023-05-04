import java.nio.channels.Channel;

import javax.naming.spi.DirStateFactory.Result;

public class SmartTV{

    boolean on = false;
    int channel = 2;
    int sound = 10;

    public void turnOn(){
        on = true;
    }

    public void turnOf(){
        on = false;
    }

    public void increaseChannel(){
        channel++;
    }

    public void decraseChannel(){
        channel--;
    }

    public void changeChannel(int newChannel){
        channel = newChannel;
    }

    public void continuosIncrementChannel(int increment){
        int result=0;

        for(int i = 0; i <= increment; i++){
            result = channel+i;
            System.out.println("O canal agora é: " +result);

        }

        channel = result;
    }

    public void continuosDecrementChannel(int decrement){

        int result = 0;
        for(int i =0; i <= decrement; i++){
            result = channel-i;
            System.out.println("O canal agora é: " +result);
        }
        channel = result;
    }

    public void incraseSound(){
        sound++;
    }

    public void decraseSound(){
        sound--;
    }

    public void continuousIncreaseSound(int increment){
        
        int result=0;

        for(int i =0; i <= increment; i++){
            
               result = sound+i;

            System.out.println("O volume agora é: " +result);
        }

        sound = result;
    }
    
    public void continuousDecrementSound(int decrement){
        int result =0;
        for(int i=0; i <= decrement; i++){
            result = sound - i;
            System.out.println("O volume agora é: " +result);
        }
        sound = result;
    }






}