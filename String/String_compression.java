// string compression
// time complexity : O(n)
// because i is incremented in both the loop so the overall loop runs till the length of the string

public class String_compression {
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++) {
            Integer count=1; // object of type integer
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1)
                sb.append(count.toString());
        }
        return sb.toString();
    }
}
