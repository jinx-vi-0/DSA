import java.util.Scanner;
public class CountingOccurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int Fn = in.nextInt();
        int Sn = in.nextInt();
        while(Fn>0) {
            int rem = Fn % 10;
            if(rem==Sn) {
                count++;
            }
            Fn = Fn/10;
        }
        System.out.println(count);
    }
}
