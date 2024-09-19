import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = sumDiagonals(matrix);
        System.out.println("Sum of the main and secondary diagonals: " + sum);
    }

    public static int sumDiagonals(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {

            sum += matrix[i][i];

            sum += matrix[i][n - 1 - i];
        }

        if (n % 2 != 0) {
            sum -= matrix[n / 2][n / 2];
        }

        return sum;
    }
}
