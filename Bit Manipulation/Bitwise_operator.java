// MSB (most significant bit) determines whether the number is positive or negative
// 0- positive
// 1- negative

// to get the value of the negative binary number, convert it by using 2's complement method

// 5 - 000101
// ~5 - 111010
// 2's complement = 1's complement then add 1
// first 1's complement - 000101
// then add 1 - 000110
// 000110 = 6
// as we are taking 2's complement of a negative so answer
// will be -(000110) = -6

public class Bitwise_operator {
    public static void main(String[] args) {
        System.out.println(~0);
        System.out.println(~5);
        leftShift(5, 2);
        rightShift(6, 1);
    }
    public static void leftShift(int a, int b) {
        // a << b = a * 2^b
        System.out.println(a<<b);
    }
    public static void rightShift(int a, int b) {
        // a >> b = a / 2^b
        System.out.println(a>>b);
    }
}
