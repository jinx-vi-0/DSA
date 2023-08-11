import java.util.Scanner;
// Largest of three numbers

public class LargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of a, b and c");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        int max = a;
        if(b>max)
            max = b;
        if(c>max)
            max = c;
        System.out.println(max + " is largest");
    }
}