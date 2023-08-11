import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    int number, guess, count=1;
    number = (int) (Math.random()*100 + 1);
    
    do {
        System.out.println("Guess the number between 1 and 100");
        guess = in.nextInt();
        if (guess>number)
            System.out.println("Lower number please");

        else if (guess<number)
            System.out.println("Higher number please");
        
        else
            System.out.println("You guessed it in " + count + " attempts");
        
        count++;
    } while (guess!=number);
	}
}