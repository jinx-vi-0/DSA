// find if the number is odd or not

public class Bit_odd_even {
    public static void main(String[] args) {
        int n = 37;
        System.out.println(isOdd(n));
    }
    public static boolean  isOdd(int n) {
        return (n & 1) == 1;
    }
}
