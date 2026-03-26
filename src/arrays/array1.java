package arrays;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ID = {1,2,3,4,5,6,7,8,9 };
		
		int i =0;
		while (i<ID.length) {
			if (ID[i] %2 ==0) {
				System.out.println( ID[i]);
			}
//			if (ID[i] %2 !=0) {
//				System.out.println( ID[i]);
//			}
			i++;
		}
	}

}
