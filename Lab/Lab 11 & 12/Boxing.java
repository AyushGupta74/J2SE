import java.util.Scanner;

public class Boxing 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int for BOXING:");
		int x = sc.nextInt();
		Integer i = new Integer(x);
		System.out.println("Integer:"+i);
		
		int y = i;
		System.out.println("int:"+y);
		
		Integer a = Integer.valueOf(x);
		System.out.println("valueOf(a):"+a);
		
		Integer I = Integer.valueOf("1111", 2); 
        System.out.println(I);
	}
}
