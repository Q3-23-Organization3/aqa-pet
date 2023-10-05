package homework5;

public class SinTableGenerator {
    public static void main(String[] args) {

        int resultValuesCount = 360 / 10;
        double[] sinValues = new double[resultValuesCount];

        for (int i = 0, degree = 0; i < resultValuesCount; i++, degree += 10) {
            sinValues[i] = Math.sin(degree);
        }
        for (int i = 0; i < resultValuesCount; i++) {
            System.out.println(sinValues[i]);
        }
    }
}
