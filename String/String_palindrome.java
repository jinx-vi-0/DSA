import java.util.Scanner;

public class String_palindrome
{
	public static void main(String[] args) {
	    String str = "geeg";
	    str = str.toLowerCase();
	    if(isPalindrome(str))
	        System.out.println("Palindrome");
	    else
	        System.out.println("not Palindrome");
	}
	
	public static boolean isPalindrome(String str) {
	    int i=0;
	    int j=str.length()-1;
	    while(i<j) {
	        if(str.charAt(i) != str.charAt(j))
	            return false;
	        else
	            i++;
	            j--;
	    }
	    return true;
	}
}