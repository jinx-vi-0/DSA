
public class Transpose_matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}};
        // display original matrix
        printMatrix(matrix);

        // Transose the Matrix
        int n=matrix.length, m=matrix[0].length;
        int[][] transpose = new int[m][n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                transpose[i][j]=matrix[j][i];
            }
        }
        System.out.println();
        // print the Transpose Matrix
        printMatrix(transpose);
    }
    public static void printMatrix(int[][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
