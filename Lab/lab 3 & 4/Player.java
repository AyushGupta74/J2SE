package pract;

public class Player {
	private int pno;
	private String pname;
	private String skills;
	
	public Player() {
		super();
	}
	public Player(int pno, String pname, String skills) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.skills = skills;
	}
	public int getPno() {
		return pno;
	}
	public String getPname() {
		return pname;
	}
	public String getSkills() {
		return skills;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Player [pno=" + pno + ", pname=" + pname + ", skills=" + skills + "]";
	}
	
}
