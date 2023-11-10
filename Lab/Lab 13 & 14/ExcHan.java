import java.util.Scanner;

public class ExcHan 
{

	public static void main(String[] args) throws AgeLimitException 
	{
		Scanner sc = new Scanner(System.in);
		while(1!=0)
		{
			System.out.println("Enter age: ");
			int age = sc.nextInt();
			if(age>18)
			{
				throw new AgeLimitException(age);
				
			}
			else 
			{
				System.out.println("AGE IS VALID");
			}
		}
	}
}

class AgeLimitException extends Exception
{
	private int age;
	public AgeLimitException(int age)
	{
		this.age=age;
	}
	
	@Override
	public String getMessage()
	{
		return "AGE LIMIT EXCEEDED";
	}
}

