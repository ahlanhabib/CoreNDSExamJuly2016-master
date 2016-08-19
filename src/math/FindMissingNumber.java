package math;
/**
 * Created by mrahman on 4/9/16.
 */
public class FindMissingNumber {
    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10,2,1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Use some static helper method to find it.
         */

        //Problem solving:
        // Since n =  10, the number inside the array should be 1-10.
        // If n = 12, then 1-12.
        // Just finding the missing number

        int [] array = {10, 9, 1, 4, 5, 3, 7, 8, 6};
        int n = 10;
        int arrayTotal = 0;

        for (int i = 0; i < array.length; i++) {
            n += i + 1;                           //Adding of (1 - nth) number
            arrayTotal += array[i];          // ArrayTotal
        }
        int missingNumber = n - arrayTotal;        // missingNumber = addition of (1 - nth) number - arrayTotal
        System.out.println("Missing number is: "+missingNumber);
    }
}
