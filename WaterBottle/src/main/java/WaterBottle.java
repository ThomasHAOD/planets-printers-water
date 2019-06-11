public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int gulp(){
        this.volume -= 10;
        return this.volume;
    }

    public int chugIt(){
        this.volume = 0;
        return this.volume;
    }

    public int takeATripToTheCooler(){
        this.volume = 100;
        return this.volume;
    }

}
