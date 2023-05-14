//inverted half pyramid(rotated by 180 deg)
public class pattern5 {
    public static void main(String args[]) {
        int row = 4;
        for(int i=1; i<=row; i++) {
            for(int j=i; j<=row-1; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
