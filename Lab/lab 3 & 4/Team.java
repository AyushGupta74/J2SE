package pract;

import java.util.Arrays;

public class Team {
	private int tno;
	private String tname;
	private Player captain;
	private Player[] plist;
	
	public Team() {
		super();
	}
	public Team(int tno, String tname, Player captain, Player[] plist) {
		super();
		this.tno = tno;
		this.tname = tname;
		this.captain = captain;
		this.plist = plist;
	}
	public int gettno() {
		return this.tno;
	}
	public String gettname() {
		return this.tname;
	}
	public Player getCaptain() {
		return this.captain;
	}
	public Player[] getPlist() {
		return this.plist;
	}
	public void settno(int tno) {
		this.tno = tno;
	}
	public void settame(String tname) {
		this.tname = tname;
	}
	public void setCaptain(Player captain) {
		this.captain = captain;
	}
	public void setPlist(Player[] plist) {
		this.plist = plist;
	}
	@Override
	public String toString() {
		return "Team[ tno=" + tno + ", tname = "+tname+", captain ="+captain+", plist = "+ Arrays.toString(plist) +"]";
	}
}
