package pract;

public class Factorial {

	public static void main(String[] args) {
		
		int ans = fact(Integer.parseInt(args[0]));
		System.out.println("factorial is "+ans);

	}
	
	public static int fact (int num) {
		int ans =1;
		for(int i=2;i<=num;i++) {
			ans = ans*i;
		}
		return ans;
	}

}
