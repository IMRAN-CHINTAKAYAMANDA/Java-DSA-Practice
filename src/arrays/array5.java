package arrays;

public class array5 {

	public static void main(String[] args) {
		// Third Largest
		int[] num = {12,54,6,47,85,100,758,4892,59,2564};
		int large1 = num [0];
		int large2 = num[0];
		int large3 = num [0];
		for (int i =0 ; i < num.length ; i++) {
			if (num [i]>large1) {
				large3 = large2;
				large2 = large1;
				large1 = num[i];
			}
			else if (num [i]>large2 && num[i] != large1 ) {
				large3 = large2;
				large2 = num[i];
			}
			else if (num [ i ]> large3 && num[i] != large2) {
				large3=num[i];
			}
		}
		System.out.println(large1);
		System.out.println(large2);
		System.out.println(large3);
	}

}
