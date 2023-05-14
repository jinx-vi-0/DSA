//inverted half pyramid
public class pattern4 {
    public static void main(String args[]) {
        int row = 4;
        for(int i=row; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
