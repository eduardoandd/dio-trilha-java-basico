public class SmartTv {
    boolean on=false;
    int channel = 1;
    int sound = 25;

    public void ligar(){
        on = true;
    }
    public void desligar(){
        on = false;
    }

    public void increaseSound(){
        sound++;
    }

    public void decraseSound(){
        sound--;
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
}
