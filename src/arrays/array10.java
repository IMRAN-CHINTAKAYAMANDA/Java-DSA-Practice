package arrays;

public class array10 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            // move start until even
            if (arr[start] % 2 != 0) {
                start++;
            }

            // move end until even
            else if (arr[end] % 2 != 0) {
                end--;
            }

            // both are even → swap
            else {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }

        // print result
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}