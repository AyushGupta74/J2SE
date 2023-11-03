package com.demo.beans;

public class Project {
private int pid;

private String pname;
private int duration;
public Project() {
	super();
}
public Project(int pid, String pname, int duration) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.duration = duration;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
@Override
public String toString() {
	return "Project [pid=" + pid + ", pname=" + pname + ", duration=" + duration + "]";
}

}
