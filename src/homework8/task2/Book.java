package homework8.task2;

public class Book implements Printable {
    String bookName;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public void print() {
        System.out.println("Printing a book: " + bookName);
    }

    public static void printBooks(Printable[] printables) {
        for (int i = 0; i < printables.length; i++) {
            if (printables[i] instanceof Book) {
                printables[i].print();
            }
        }
    }
}
