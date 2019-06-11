public class Printer {

    public int sheetsLeft;
    public int toner;

    public Printer(int sheetsLeft, int toner){
        this.sheetsLeft = sheetsLeft;
        this.toner = toner;
    }

    public void print(int pages, int copies){
        int totalSheetsPrinted = pages * copies;
        this.sheetsLeft -= totalSheetsPrinted;
        this.toner -= totalSheetsPrinted;
    }


}
