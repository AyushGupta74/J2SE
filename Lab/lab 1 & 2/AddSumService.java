package pract;

public class AddSumService {
	public static int SumDigits(int a, int b) {
		//sum of two digit
			return (a+b);		
	}
	
	public static int SameNum(int a) {
		//return same number
		int num=0;
		while (a!=0) {
			int d=a%10;
			num = num+d;
			a= (int)(a/10);
		}
		return num;
	}
}
