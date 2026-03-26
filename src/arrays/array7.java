package arrays;

public class array7 {

	public static void main(String[] args) {
		// reverse array {1,2,3,4} -> {4,3,2,1}
		int [] num ={ 1,2,3,4,5};
		int start = 0;
		int end = num.length-1;
		
		while (start < end) {
			int temp = num[start];
			num [start] = num[end] ;
			num [end] = temp ;
			start ++;
			end --;
		};
		for (int i = 0; i<num.length;i++) {
			System.out.print(num[i] + " ");
		}
		
	}

}
