public class Bottle {

    private int volume;

    public Bottle (int volume){
        this.volume = volume;
    }

    public boolean volumeStartsAt100(){
        if (this.volume == 100){
            return true;
        }
        return false;
    }

    public int drinkTakes10OffVolume(){
        return this.volume -= 10;
    }

    public int canEmptyBottle(){
        return this.volume = 0;
    }

    public int canFillBottle(){
        return this.volume = 100;
    }

}
