package pract;

import java.util.Scanner;

public class TeamService {
	static Team[] tarr;
	static int cnt;
	static {
		tarr= new Team[10];
		cnt = 0;
	}
	public static void addnewteam() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter team number");
		int tno = sc.nextInt();
		sc.nextLine();
		System.out.println("enter team name");
		String tname = sc.nextLine();
		System.out.println("cptain player Number");
		int pno = sc.nextInt();
		sc.nextLine();
		System.out.println("captain Name");
		String pname = sc.nextLine();
		System.out.println("enter captain skill");
		String skills = sc.nextLine();
		Player cap = new Player(pno, pname, skills);
		Player[] plist = new Player[1];
		for(int i=0; i<plist.length; i++) {
			System.out.println("enter player number");
			pno = sc.nextInt();
			sc.nextLine();
			System.out.println("enter player name");
			pname = sc.nextLine();
			System.out.println("enter palyer skill");
			skills = sc.nextLine();
			plist [i] = new Player(pno, pname, skills);
		}
		tarr[cnt] = new Team(tno, tname, cap, plist);
		cnt++;
	}
	
	
	public static void displayAll() {
		for(int i=0; i<cnt; i++) {
			System.out.println(tarr[i]);
		}
	}
	
	public static Team searchbyCname(String nm) {
		for(int i=0; i<cnt; i++) {
			Player cap = tarr[i].getCaptain();
			if(cap.getPname().equals(nm)) {
				return tarr[i];
			}
		}
		return null;
	}
	
	
}
