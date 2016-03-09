/**
 * Created by svitlana.masanovets on 3/1/2016.
 */
public class Matrix {
    public static void main(String[] args) {
        int n = 5, i, j, num = 1;
        String[][] matrix = new String[n][n];

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    matrix[i][j] = "*";
                    System.out.print(matrix[i][j] + "\t");
                } else {
                    matrix[i][j] = String.valueOf(num);
                    System.out.print(matrix[i][j] + "\t");
                }
                num++;
            }
            System.out.println();
        }


    }
}
