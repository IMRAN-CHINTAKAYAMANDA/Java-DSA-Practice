package arrays;

public class array9 {

	public static void main(String[] args) {
		// Counting number
		int[] arr = {10, 20, 30, 20, 40, 20};
		int key = 0;
		int count =0;
		boolean found = false;
		for (int i = 0 ; i < arr.length;i++) {
			if (arr[i]==key) {
				found = true;
				count ++;
			}
		}			System.out.println( count);
		if (found == false) {
			System.out.println("Not found");
		}

	}

}
