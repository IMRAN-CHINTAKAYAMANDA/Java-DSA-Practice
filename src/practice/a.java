package practice;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		System.out.println ("enter numbers");
		Scanner scn=new Scanner (System.in);
		int a = scn .nextInt();
		int b = scn .nextInt();
		int c = scn .nextInt();
		int sum = a+b+c;
		System.out.print(sum);
		scn .close();
	}

}
