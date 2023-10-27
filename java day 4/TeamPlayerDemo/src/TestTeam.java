import java.util.Scanner;

public class TestTeam {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
		System.out.println("1. Add new team\n 2. display all teams\n");
		System.out.println("3. search team by captain\n 4. exit\nchoice : ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			TeamService.addnewteam();
			break;
		case 2:
			TeamService.displayall();
			break;
		case 3:
			sc.nextLine();
			System.out.println("enetr the name of the captain");
			String nm=sc.nextLine();
			Team t=TeamService.searchByCName(nm);
			if(t!=null)
			   System.out.println(t);
			else
				System.out.println("Team not found");
			
			break;
		case 4:
			sc.close();
			System.out.println("Thank you for visiting....");
			break;
		default:
			System.out.println("wrong choice");
		}
		}while(choice!=4);
		
	}

}
