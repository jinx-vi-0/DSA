// find the Kth element which will obtain while traversing the matrix spirally
// GFG

public class Spiral_Matrix1
{
	public static void main(String[] args) {
	    int[][] matrix = {{1, 2, 3}, 
                         {4, 5, 6}, 
                         {7, 8, 9}};
		int ans = findK(matrix, 4);
		System.out.println("answer = " + ans);
	}
	public static int findK(int matrix[][], int k)
	{
	    // Your code goes here
	    int startRow=0;
	    int endRow=matrix.length-1;
	    int startCol=0;
	    int endCol=matrix[0].length-1;
	    int count=0;
	    int ele=0;
	    while(startRow<=endRow && startCol<=endCol) {
	        // top
	        for(int j=startCol; j<=endCol; j++) {
	            if(count == k)
	                break;
	            ele = matrix[startRow][j];
	            count++;
	        }
	        
	        // right
	        for(int i=startRow+1; i<=endRow; i++) {
	            if(count == k)
	                break;
	            ele = matrix[i][endCol];
	            count++;
	        }
	        
	        // bottom
	        for(int j=endCol-1; j>=startCol; j--) {
	            if(startRow == endRow)
	                break;
	            if(count == k)
	                break;
	            ele = matrix[endRow][j];
	            count++;
	        }
	        
	        // right
	        for(int i=endRow-1; i>=startRow+1; i--) {
	            if(startCol == endCol)
	                break;
	            if(count == k)
	                break;
	            ele = matrix[i][startCol];
	            count++;
	        }
	        startRow++;
	        endRow--;
	        startCol++;
	        endCol--;
	    }
	    return ele;
	}
}