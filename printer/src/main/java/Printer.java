public class Printer {

    private int paper;
    private int tonerVolume;

    public Printer (int paper, int tonerVolume){
        this.paper = paper;
        this.tonerVolume = tonerVolume;
    }

    public boolean hasPaper(){
        if (this.paper > 0){
            return true;
        }
        return false;
    }

    public int canPrint(int pages, int copies){
        int totalPrinting = pages * copies;
        return totalPrinting;
    }

    public boolean onlyPrintIfEnoughPaper(int pages, int copies){
        int totalPrinting = pages * copies;
        if (totalPrinting < this.paper){
            this.paper -= totalPrinting;
            this.tonerVolume -= totalPrinting;
            return true;
        }
        return false;
    }

    public int getTonerVolume(){
        return this.tonerVolume;
    }

}
