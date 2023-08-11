// binary string problem

// print all binary strings of size n without consecutive ones

public class Binary_String {
    public static void main(String[] args) {
        printBinString(3, 0, "");
    }
    public static void printBinString(int n, int lastPlace, String str) {
        if(n==0) {
            System.out.println(str);
            return;
        }
        // if(lastPlace==0) {
        //     printBinString(n-1, 0, str+"0");
        //     printBinString(n-1, 1, str+"1");
        // }
        // else
        //     printBinString(n-1, 0, str+"0");
        printBinString(n-1, 0, str+"0");
        if(lastPlace == 0)
            printBinString(n-1, 1, str+"1");
    }
}
