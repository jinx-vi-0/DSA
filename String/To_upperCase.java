// for a given String convert the first letter of each word to upperCase

public class To_upperCase {
    public static void main(String[] args) {
        String str = "hello my name is adarsh kumar";
        System.out.println(toUppercase(str));
    }
    public static String toUppercase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i)==' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                char s = Character.toUpperCase(str.charAt(i));
                sb.append(s);
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
