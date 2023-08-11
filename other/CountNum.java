import java.util.Scanner;
// count the occurence of a digit in a number
public class CountNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = in.nextInt();
        System.out.print("enter digit to search : ");
        int num_to_search = in.nextInt();
        int count=0;
        while(num != 0) {
            int temp = num % 10;
            if(temp == num_to_search)
                count++;
            num /=10;
        }
        System.out.print(num_to_search + " occurs " + count + " times");
    }
    }