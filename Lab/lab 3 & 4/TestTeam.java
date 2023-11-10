package pract;

import java.util.Scanner;

public class TestTeam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
			do {System.out.println("1. Add New team");
				System.out.println("2. Dispaly all teams");
				System.out.println("3. Search Team by Captain");
				System.out.println("4. Exit");
				choice = sc.nextInt();
				switch(choice) {
				case 1:
					TeamService.addnewteam();
					break;
				case 2:
					TeamService.displayAll();
					break;
				case 3:
					sc.nextLine();
					System.out.println("enter captain name");
					String nm = sc.nextLine();
					Team t = TeamService.searchbyCname(nm);
					if(t != null) {
						System.out.println(t);
					}else {
						System.out.println("not found !!!");
					}
					break;
				default:
					System.out.println("wrong choice");
				}
			}
			while(choice != 3);
			
		}
	
	}
