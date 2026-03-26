package arrays;

public class array3 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int sum = 0;
        int avg;

        // Step 1: Calculate sum
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        // Step 2: Calculate average
        avg = sum / arr.length;

        // Step 3: Print values > avg
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) {
                System.out.println(arr[i]);
            }
        }
    }
}