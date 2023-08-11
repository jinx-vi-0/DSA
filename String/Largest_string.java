// for a given set of strings, print the largest string lexicographically

// .compareTo() : capital letter and small letter are treated differently
// .compareToIgnoreCase() : capital letter and small letter are treated same

// str1.compareTo(str2) : returns 0 for equal, -ve for str1<str2, +ve for str1>str2

public class Largest_string {
    public static void main(String[] args) {
        String[] fruits = {"mango", "apple", "guava", "banana"};
        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++) {
            if(largest.compareToIgnoreCase(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
