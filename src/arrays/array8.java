package arrays;

import java.util.Scanner;

public class array8 {

	public static void main(String[] args) {
		// searching position of number in array
		int[] arr = {45, 12, 78, 34, 89,72, 23, 67, 90, 11, 56, 72, 38, 99, 5, 61};
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Key Value :");	
		int key = scn.nextInt();
		boolean present = false;
		
		for (int i = 0 ; i < arr.length; i++) {
			if (arr[i]==key) {
				System.out.print(i+ " ");	
				present = true;
			}
			
		}
		if (present==false) {
			System.out.print("Not Found !");	
		}
		
	}

}
