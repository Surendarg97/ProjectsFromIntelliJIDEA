public class Printer {

    private int turnerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int turnerLevel, boolean duplex) {
        if(turnerLevel>0 && turnerLevel<101) {
            this.turnerLevel = turnerLevel;
        }else {
            this.turnerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted =0;
    }
    public int addTurner(int turnerAmount)
    {
        if(turnerAmount>0 && turnerAmount<101) {
            if((this.turnerLevel+turnerAmount)>100)
                return -1;
            else
                return this.turnerLevel+=turnerAmount;
        }else {
            return -1;
        }

    }
    public int printPages(int pages){
        int pagesToPrint= pages;
        if(this.duplex){
            pagesToPrint=(pages/2)+(pages%2);
            System.out.println("Print in duplex mode");
        }
        this.pagesPrinted+=pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
