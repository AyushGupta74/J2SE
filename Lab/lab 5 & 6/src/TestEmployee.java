package Employee.src;

import java.util.Scanner;

public class TestEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {System.out.print("1. add new Employee\n2. display all \n3. display by id\n");
		System.out.print("4. Modify salary \n5. calculate salary by id\n6. calculate Bonus\n7. exit\nchoice :");
		choice=sc.nextInt();
		switch(choice) {
			case 1:
				System.out.println("\"1. Salaried \\n 2. Contract \\n 3. vendor\"");
				int pick = sc.nextInt();
				EmployeeService.addEmployee(pick);
				break;
			case 2:
				EmployeeService.displayAll();
				break;
			case 3:
				System.out.println("enter ID");
				int pid = sc.nextInt();
				EmployeeService.displaybyId(pid);
				break;
			case 4:
				System.out.println("enter ID");
				 pid = sc.nextInt();
				 EmployeeService.FindType(pid);
				System.out.println("enter amount to change");
				double amt = sc.nextDouble();
				boolean status = EmployeeService.modifySalbyId(pid, amt);
				if(status) {
					System.out.println("Changed");
				}else {
					System.out.println("failed");
				}
				break;
			case 5:
				System.out.println("enter ID");
				pid = sc.nextInt();
				double Salary = EmployeeService.CalculateSalbyID(pid);
				if(Salary != -1) {
					System.out.println("NetSalary" + Salary);
				}else {
					System.out.println("Not Found");
				}
				break;
			case 6:
				System.out.println("enter ID");
				pid = sc.nextInt();
				EmployeeService.CalculateBonus(pid);
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