import java.util.Scanner;
public class Vowel_orNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter character : ");
        char ch = in.next().charAt(0);
        switch(ch) {
        case 'A':
        case 'a': 
            System.out.print("vowel");
            break;
        case 'E':
        case 'e':
            System.out.print("vowel");
            break;
        case 'I':
        case 'i':
            System.out.print("vowel");
            break;
        case 'O':
        case 'o':
            System.out.print("vowel");
            break;
        case 'U':
        case 'u':
            System.out.print("vowel");
            break;
        default :
            System.out.print("not vowel");
    }
    }
}