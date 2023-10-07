package homework5;

public class ReplaceEvenNumbersWithZero {

    public static void main(String[] args) {

        int[] num = {3, 2, 5, 8, 10, 13, 22};

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                num[i] = 0;
            }
            System.out.println(num[i]);
        }
        System.out.println(num);
    }
}
