package arrays;

public class array2 {

	public static void main(String[] args) {
		// mathamatics on array
		int [] num = {1,2,3,4,5,6,7,8,9,10};
		int i=0;
		int sum = 0;
		int min = num[0];
		int max = num[0];
		int avg = 0;
		while (i<num.length){
			sum = sum+num[i];
			if (num[i]<min) {
				min = num [i];
			}
			if (num[i]>max) {
				max = num [i];
			}
			
			i++;
		}
		avg = sum / num.length;
		System.out.println("sum ="+ sum);
		System.out.println("max ="+ max);		
		System.out.println("min ="+ min);
		System.out.println("avg ="+ avg);
	}

}
