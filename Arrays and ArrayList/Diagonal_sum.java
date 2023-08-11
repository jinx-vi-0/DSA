// diagonal sum = primary diagonal sum + secondary diagonal sum

public class Diagonal_sum {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        System.out.println("diagonal sum = " + diagonalSum(matrix));
    }
    public static int diagonalSum(int[][] matrix) {
        int sum=0;
        for(int i=0; i<matrix.length; i++) {
            // primary diagonal
            sum += matrix[i][i];

            // secondary diagonal
            // for sd : i+j==matrix.length-1
            // i.e. j=matrix.length-1-i
            if(i != matrix.length-1-i)
                sum += matrix[i][matrix.length-1-i];
        }
        return sum;
    }
}
