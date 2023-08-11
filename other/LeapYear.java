import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the year : ");
        int year = in.nextInt();
        if(year%4==0) {
            if(year%100==0) {
                if(year%400==0) {
                    System.out.println("leap year");
                }
                else {
                    System.out.println("not leap year");
                }
            }
            else {
                System.out.println("leap year");
            }
        }
        else {
            System.out.println("not leap");
        }
    }
}