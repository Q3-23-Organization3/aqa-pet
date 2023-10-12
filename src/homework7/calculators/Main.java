package homework7.calculators;

public class Main {
    public static void main(String[] args) {

        EngineeringCalculator engineeringCalculator = new EngineeringCalculator();

        double squareRootResultEng = engineeringCalculator.squareRoot(4);
        System.out.println("Engineering calculator");
        System.out.println();
        System.out.println("Result of square root: " + squareRootResultEng);

        double numberToPowerResultEng = engineeringCalculator.numberToPower(11.9, 3);
        System.out.println("Result of number to power: " + numberToPowerResultEng);

        double cosineResultEng = engineeringCalculator.cosine(94);
        System.out.println("Result of cosine: " + cosineResultEng);

        double additionResultEng = engineeringCalculator.addition(10.1, 5.7);
        System.out.println("Result of addition: " + additionResultEng);

        double subtractionResultEng = engineeringCalculator.subtraction(88, 12.3);
        System.out.println("Result of subtraction: " + subtractionResultEng);

        double multiplicationResultEng = engineeringCalculator.multiplication(22, 3.23);
        System.out.println("Result of multiplication: " + multiplicationResultEng);

        double divisionResultEng = engineeringCalculator.division(100, 5);
        System.out.println("Result of division: " + divisionResultEng);
        System.out.println("--------------------------");

        ProgrammableCalculator programmableCalculator = new ProgrammableCalculator();

        double tangentResultPro = programmableCalculator.tangent(7);
        System.out.println("ProgrammableCalculator");
        System.out.println();
        System.out.println("Result of tangent: " + tangentResultPro);

        double sineResultPro = programmableCalculator.sine(90);
        System.out.println("Result of sine: " + sineResultPro);

        double additionResultPro = programmableCalculator.addition(4.4, 232);
        System.out.println("Result of addition: " + additionResultPro);

        double subtractionResultPro = programmableCalculator.subtraction(191.99, 83.6);
        System.out.println("Result of subtraction: " + subtractionResultPro);

        double multiplicationResultPro = programmableCalculator.multiplication(33, 4);
        System.out.println("Result of multiplication: " + multiplicationResultPro);

        double divisionResultPro = programmableCalculator.division(25, 3);
        System.out.println("Result of division: " + divisionResultPro);
    }
}
