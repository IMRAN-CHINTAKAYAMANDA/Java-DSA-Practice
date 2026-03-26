package arrays;

public class array6 {

	public static void main(String[] args) {
		// Find missing numbers(boolean array method)
		int [] num = {1,100,200,300};
		int range = 301;
		boolean[] present = new boolean[range+1];
		for (int i = 0 ; i < num.length ; i++) {
			present [num[i]]=true;
		}
		for (int i =1 ; i < range ; i++)
		{
			if (!present[i]) {
				System.out.println(i);
			}
		}
	}

}
