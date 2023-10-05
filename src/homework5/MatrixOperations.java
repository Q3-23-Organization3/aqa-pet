package homework5;


public class MatrixOperations {
    public static void main(String[] args) {

        int[][] matrix = {
                { 1,  2, 5},
                { -3, 4, 7 } ,
                { 7, -8, 9 }
        };

        int negativeCount = 0;
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] < 0) {
                    negativeCount++;
                }
            }
        }
        int oddSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    oddSum += matrix[i][j];
                }
            }
        }

        System.out.println("Number of negative elements below the main diagonal: " + negativeCount);
        System.out.println("Sum of odd elements above the main diagonal: " + oddSum);

    }
}

