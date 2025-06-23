public class MatrixAddition {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] b = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        int[][] sum = new int[3][3];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                sum[i][j] = a[i][j] + b[i][j];

        System.out.println("Result of matrix addition:");
        for (int[] row : sum) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
