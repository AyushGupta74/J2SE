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
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Player getCaptain() {
		return captain;
	}
	public void setCaptain(Player captain) {
		this.captain = captain;
	}
	public Player[] getPlist() {
		return plist;
	}
	public void setPlist(Player[] plist) {
		this.plist = plist;
	}
	@Override
	public String toString() {
		return "Team [tno=" + tno + ", tname=" + tname + ", captain=" + captain + ", plist=" + Arrays.toString(plist)
				+ "]";
	}
	
  
  
  
}
