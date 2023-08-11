// check if a number is even or odd

// check for the LSB, if LSB is 0(even) or 1(odd)
public class Odd_Even {
    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(11);
        oddOrEven(6);
    }
    public static void oddOrEven(int n) {
        int bitMask = 1; // (1<<0)
        // changes all other bits to 0 other than LSB

        if((n & bitMask) == 0) // even
            System.out.println("even");
        else // odd
            System.out.println("odd");
    }
}
