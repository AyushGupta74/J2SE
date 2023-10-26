import java.util.Scanner;

public class TestPersonArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
		System.out.println("1. Add new Person\n 2. display all\n 3. display by id\n 4. update mobile by id");
		System.out.println("5. display by name\n6. exit\n choice: ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			PersonService.addNewPerson();
			break;
		case 2:
			PersonService.displayAll();
			break;
		case 3:
			System.out.println("enter id");
			int id=sc.nextInt();
			Person ob=PersonService.searchById(id);
			if(ob!=null) {
				System.out.println(ob);
			}
			else {
				System.out.println("not found "+id);
			}
			break;
		case 4:
			break;
		case 5:
			System.out.println("enter name");
			sc.nextLine();
			String nm=sc.nextLine();
			Person[] plist=PersonService.getByName(nm);
			if(plist!=null) {
				for(Person p:plist) {
					System.out.println(p);
				}
			}
			else {
				System.out.println("not found");
			}
			break;
		case 6:
			System.out.println("Thank you for visiting.....");
			//System.exit(0);
			break;
		default:
			System.out.println("wrong choice");
		}
		
		}while(choice!=6);
	}

}
