package homework8.task2;

public class Magazine implements Printable {
    String magazineName;

    public Magazine(String magazineName) {
        this.magazineName = magazineName;
    }

    @Override
    public void print() {
        System.out.println("Printing a magazine: " + magazineName);
    }

    public static void printMagazines(Printable[] printables) {

        for (int i = 0; i < printables.length; i++) {
            if (printables[i] instanceof Magazine) {
                printables[i].print();
            }
        }
    }
}
