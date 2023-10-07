package homework5;

public class GetMinAndMaxValue {
    public static void main(String[] args) {
        int[] arr = {11, 101, 21, 7, 2, 15, 9, -3, 88, 6};
        int max = 0;
        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum value of array is " + max);
        System.out.println("Minimum value of array is " + min);
    }
}
