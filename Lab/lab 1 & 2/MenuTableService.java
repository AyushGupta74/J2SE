package pract;
import java.util.Scanner;
public class MenuTableService {
		Scanner sc = new Scanner(System.in);
		
		public static void Table(int num) {
			for(int i=1; i<=10; i++) {
				  System.out.println(num*i); 
			}
		}
		
		public static void PrimeNumber(int num) {
			int cnt=0;
			for (int i =2;i<=num;i++) {
				if (num%i==0) {
					cnt++;
				}	
			}
			if(cnt == 1) {
				System.out.println("is prime");
			}
		}
		
		public static void Pattern(int num) {
			int k=0;
			for(int i=0; i<=2*num;i++) {
				if(i <= num) {
					k++;
					}else{
						k--;}
				for(int j=0;j<=2*num;j++) {
					if(j>=num+1-k && j<=num-1+k) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		
}
