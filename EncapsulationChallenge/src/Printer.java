public class Printer {

    //instance variables or class fields when instantiating a new object from this class the following fields will be available
    //percentage of how much toner is left
    private int tonerLevel;
    //count of total pages printed by the Printer
    private int pagesPrinted;
    //if true, it can print on 2 sides of a single sheet of paper
    private boolean duplex;

    //constructors Printer class
    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;

    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 100 || tonerAmount <= 0) {
            return -1;
        }
        if ((tonerLevel + tonerAmount) > 100 || (tonerLevel + tonerAmount) < 0) {
            return -1;
        }
        return tonerLevel += tonerAmount;
    }

    public int printPages(int pagesToPrint) {
        int sheets = (duplex) ? (pagesToPrint/2)+(pagesToPrint%2):pagesToPrint;
        pagesPrinted += sheets;
        return sheets;

    }


}
