package arrays;
//max and second max values
public class arry4 {
	public static void main (String [] args ) {
		int [] num = {1,2,3,4,15,6,7,8,9,10};
		int max = num[0];
		int secondmax = num [0];
		for (int i = 0 ; i < num.length; i++) {
			if (num [i]>max) {
				secondmax= max;
				max = num [i];
				
			}
			else if (num [i] > secondmax && secondmax != max){
				secondmax = num[i];
			}
			
		}
		System.out.println(max);
		System.out.println(secondmax);
	}

}
