//floyd's triangle
public class pattern8 {
    public static void main(String args[]) {
        int row = 5;
        int number = 1;
        for(int i=1; i<=row; i++) {
            for(int j=1; j<=i; j++, number++) {
                System.out.print(number+" ");
            }
            System.out.println();
        }
    }
}
