package pract;

import java.util.Scanner;

public class AddSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a1, a2;
		System.out.println("enter first number");
		a1 = sc.nextInt();
		System.out.println("enter second number");
		a2 = sc.nextInt();
		
		System.out.println("sum of two number");
		System.out.println(AddSumService.SumDigits(a1, a2));
		System.out.println("same number");
		System.out.println(AddSumService.SameNum(a1));
		sc.close();
	}
	
}
