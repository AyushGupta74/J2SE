//write a program to accept 2 numbers from user
//and display addition of both, also display 
//addition of digits of the first number
import java.util.Scanner;

class TestCalaculate{
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
	 System.out.println("enter number 1");
	 int num1=sc.nextInt();
	 System.out.println("enter number 2");
	 int num2=sc.nextInt();
	 int ans=NumberService.addition(num1,num2);
	 System.out.println("Addtion : "+ans);
	 ans=NumberService.add_digits(num1);
	 System.out.println("Add_digits : "+ans);
  }
}
