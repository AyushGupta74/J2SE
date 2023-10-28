import java.util.Scanner;

public class TestEmpArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
		System.out.println("1. add new Employee\n 2. Modify salary \n3. display all\n ");
		System.out.println("4. display by id \n 5. calculate salary by id\n 6. calculate Bonus\n 7. exit\nchoice :");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("1. Salaried \n 2. Contract \n 3. vendor");
			int ch=sc.nextInt();
			EmployeeService.addnewEmployee(ch);
			break;
		case 2:
			System.out.println("enetr id");
			int pid=sc.nextInt();
			System.out.println("enter salary");
			double s=sc.nextDouble();
			boolean status=EmployeeService.ModifysalById(pid,s);
			if(status) {
				System.out.println("modification done");
			}
			else {
				System.out.println("id not found");
			}
			
			break;
		case 3:
			EmployeeService.displayAll();
			break;
		case 4:
			break;
		case 5:
			System.out.println("enetr id");
			 pid=sc.nextInt();
		     double salary=EmployeeService.calculateSalaryById(pid);
		     if(salary!=-1) {
		    	 System.out.println("Net Salary : "+salary);
		     }
		     else {
		    	 System.out.println("not found");
		     }
			break;
		case 6:
			break;
		case 7:
			sc.close();
			System.out.println("Thank you for visiting.....");
			break;
		default:
			System.out.println("wrong choice");
			break;
		}
		}while(choice!=7);

	}

}
