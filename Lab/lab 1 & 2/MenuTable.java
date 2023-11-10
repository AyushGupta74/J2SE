package pract;
import java.util.Scanner;
public class MenuTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		do {
		System.out.println("1-> Print Table");
		System.out.println("2-> Prime number");
		System.out.println("3-> Display Pattern");
		System.out.println("4-> Exit");
		
		System.out.println("enter Index number");
		a = sc.nextInt();
		
		switch(a) {
		case(1):
			System.out.println("enter Number");
		int num = sc.nextInt();
			MenuTableService.Table(num);
			break;
	
		case(2):
			System.out.println("enter Number");
			num = sc.nextInt();
			MenuTableService.PrimeNumber(num);
			break;
	
		case(3):
			System.out.println("enter Number");
			num = sc.nextInt();
			MenuTableService.Pattern(num);
			break;
		case(4):
			System.exit(0);
		}
		sc.close();
		}while(a!=4);
	}


}
