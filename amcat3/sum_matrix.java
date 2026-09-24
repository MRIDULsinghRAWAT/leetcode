import java.util.*;

class GFG {

    static int sumOfMatrix(int[][] mat)
    {
     
        int sum = 0;
        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                sum += mat[i][j];
            }
        }

        // Return sum of matrix
        return sum;
    }

    // Driver Code
    public static void main(String[] args)
    {
        // Input Data
        int[][] mat = {
            {4, 5, 3, 2},
            {9, 5, 6, 2},
            {1, 5, 3, 5}
        };

        // Function call
        System.out.println(sumOfMatrix(mat));
    }
}