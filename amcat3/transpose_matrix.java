import java.util.ArrayList;

public class GFG {

    public static ArrayList<ArrayList<Integer>> transpose(int[][] mat) {

        int n = mat.length;

        // Create a result matrix of size n x n
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        // Build the transposed matrix
        for (int j = 0; j < n; j++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                row.add(mat[i][j]);
            }
            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 1, 1, 1},
            {2, 2, 2, 2},
            {3, 3, 3, 3},
            {4, 4, 4, 4}
        };

        ArrayList<ArrayList<Integer>> res = transpose(mat);

        int n = res.size();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}