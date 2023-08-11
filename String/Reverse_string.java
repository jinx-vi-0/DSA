// reverse a string

public class Reverse_string {
    public static void main(String[] args) {
            String str = "geeks for geeks";
            String rev = "";
            char ch;
            for(int i=0; i<str.length(); i++) {
                ch = str.charAt(i);
                rev = ch + rev;
            }
            System.out.println(rev);
    }
}
