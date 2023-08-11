import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter number : ");
        int num = in.nextInt();
        int count = 1;
        while(count <= 10) {
            System.out.print(num*count + "\t");
            count++;
        }
    }
}
