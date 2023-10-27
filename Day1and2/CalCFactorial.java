//write a program to accept a number through commandline 
//argument and calcualte factorial of it
import java.util.Scanner;

class CalCFactorial{
    
   
   public static void main(String[] args)
   {
       //int num=Integer.parseInt(args[0]);
	   //int ans=CalCFactorial.factorial(num);
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter number");
	   int num=sc.nextInt();
	   //CalCFactorial ob=new CalCFactorial();
	   //int ans=ob.factorial(num);
	   //int ans=CalCFactorial.factorial(num);
	   int ans=NumberService.factorial(num);
	   System.out.println("Factorial: "+ans);

	   
   }
}