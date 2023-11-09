package homework11.lambda;

import java.util.stream.Stream;

public class Lambda {


    public static void main(String[] args) {

        Printable lambdaMagazine = () -> System.out.println("`Vogue Knitting`");
        Printable lambdaMagazine1 = () -> System.out.println("`Vogue`");
        Printable lambdaBook = () -> System.out.println("`Little Women`");
        Printable lambdaBook1 = () -> System.out.println("`Shining`");

        Stream.of(lambdaMagazine, lambdaMagazine1, lambdaBook, lambdaBook1).forEach(Printable::print);
    }
}