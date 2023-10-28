public class Main {
    public static void main(String[] args) {
        Printer printer1 = new Printer(40,true);


        //add toner
//        System.out.println("Added toner: " + printer1.addToner(80));
//        System.out.println("Added toner: " + printer1.addToner(50));
//        System.out.println("Added toner: " + printer1.addToner(20));
//        System.out.println("Added toner: " + printer1.addToner(10));
//        System.out.println("Added toner: " + printer1.addToner(-10));

        //print pages
//        System.out.println("Pages printed: " + printer1.getPagesPrinted());
//        System.out.println("Number of sheets: " + printer1.printPages(10));
//        System.out.println("Pages printed: " + printer1.getPagesPrinted());
//        System.out.println("Number of sheets: " + printer1.printPages(10));
//        System.out.println("Pages printed: " + printer1.getPagesPrinted());
//        System.out.println("Number of sheets: " + printer1.printPages(3));
//        System.out.println("Pages printed: " + printer1.getPagesPrinted());

        System.out.println("#############################");

        Printer printer = new Printer(50, true);
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current job pages: %d, Printed Total: %d %n", pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(10);
        System.out.printf("Current job pages: %d, Printed Total: %d %n", pagesPrinted, printer.getPagesPrinted());

    }
}
