public class BitManipulation {
    public static void main(String[] args) {
        //System.out.println(getIthBit(10, 3));
        //System.out.println(setIthBit(10, 2));
        //System.out.println(clearIthBit(10, 1));
        //System.out.println(updateIthBit(10, 2, 1));
        //System.out.println(clearIBits(15, 2));
        //System.out.println(clearBitsinRange(10, 2, 4));
        //System.out.println(isPowerofTwo(8));
        System.out.println(countSetBits(15));
    }
    public static int getIthBit(int n, int i) {
        // bitMask- shift 1 to ith position
        int bitMask = 1<<i;

        // and operation
        // changes all other bits to 0 other than i'th bit
        if((n & bitMask) == 0) // i'th bit = 0
            return 0;
        else // i'th bit = 1
            return 1;
    }
    public static int setIthBit(int n, int i) {
        // bitMask- shift 1 to ith position
        int bitMask = 1<<i;

        // or operation
        // only change the i'th bit if it is 0
        // else its remain same
        // do not change any other bit
        return n | bitMask;
    }
    public static int clearIthBit(int n, int i) {
    /*  clear i'th bit
        Since bitwise AND of any bit with a reset bit results in a reset bit, i.e.
        Any bit <bitwise AND> Reset bit = Reset bit

        which means,
        0 & 0 = 0
        1 & 0 = 0

        So for clearing a bit, performing a bitwise AND of the number with a reset bit is the best idea.
        n = n & ~(1 << i)
        OR
        n &= ~(1 << i)

        where i is the bit that is to be cleared
    */
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int updateIthBit(int n, int i, int newBit) {
        // update the i'th bit with the value of newBit
        
        // 1st approach
        // if(newBit == 0)
        //     return clearIthBit(n, i);
        // else
        //     return setIthBit(n, i);

        // 2nd approach
        n = clearIthBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }
    public static int clearIBits(int n, int i) {
        // clear last i bits
        
        //int bitMask = (~0)<<i;
        int bitMask = -1<<i;
        return n & bitMask;
    }
    public static int clearBitsinRange(int n, int i, int j) {
        // clear bits in range
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }
    // check if a number is Power of 2 or not
    public static boolean isPowerofTwo(int n) {
        return (n&(n-1))==0;
    }
    // count set bits in a number
    public static int countSetBits(int n) {
        int count=0;
        while(n>0) {
            if((n&1)!=0) // check for LSB
                count++;
            n = n>>1; // right shift n
        }
        return count;
    }
}

