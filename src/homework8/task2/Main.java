package homework8.task2;

public class Main {
    public static void main(String[] args) {

        Printable[] printables = new Printable[4];

        Printable book1 = new Book("Little Women");
        Printable book2 = new Book("Shining");
        Printable magazine1 = new Magazine("Vogue");
        Printable magazine2 = new Magazine("Vogue Knitting");

        printables[0] = book1;
        printables[1] = book2;
        printables[2] = magazine1;
        printables[3] = magazine2;

        for (int i = 0; i < printables.length; i++) {
            printables[i].print();
        }

        Magazine.printMagazines(printables);
        Book.printBooks(printables);
    }
}
