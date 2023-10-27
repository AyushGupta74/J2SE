
public class Player {
	private int pno;
	private String pname;
	private String skill;
	public Player() {
		super();
	}
	public Player(int pno, String pname, String skill) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.skill = skill;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	@Override
	public String toString() {
		return "Player [pno=" + pno + ", pname=" + pname + ", skill=" + skill + "]";
	}
	

}
