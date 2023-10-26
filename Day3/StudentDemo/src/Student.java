
public class Student {
	private String id;
	private String name;
	private int m1,m2,m3;
	static int count;
	static {
		count=0;
	}
	//static function or static block can access only static variables
	public static void f1() {
		
	}
	private String generateCode() {
		count++;
		if(this.name!=null)
		   return this.name.substring(0, 3)+count;
		else 
			return "aaa"+count;
	}
     public Student() {
    	// id=generateCode();
    	 //name=null;
    	// m1=0;
    	// m2=0;
    	 //m3=0;
    	 //to call other constructor of same class
    	 
    	 this(null,0,0,0);
    	 
     }
     public Student(String nm,int m1,int m2,int m3) {
    	 //count++;
    	 //this.id=count;
    	 this.name=nm;
    	 this.id=generateCode();
    	 this.m1=m1;
    	 this.m2=m2;
    	 this.m3=m3;
     }
    /* public void setId(String id) {
    	 this.id=id;
     }*/
     public void setName(String nm) {
    	 this.name=name;
    	 
     }
     public void setM1(int m1) {
    	 this.m1=m1;
     }
     public void setM2(int m2) {
    	 this.m2=m2;
     }
     public void setM3(int m3) {
    	 this.m3=m3;
     }
     //getter methods
     public String getId() {
    	 return this.id;
     }
     public String getName() {
    	 return this.name;
     }
     public int getM1(int m1) {
    	 return this.m1;
     }
     public int getM2(int m2) {
    	 return this.m2;
     }
     public int getM3() {
    	 return this.m3;
     }
     public String toString() {
    	 return "ID : "+this.id+"\nName: "+this.name+"\n M1: "+this.m1+"\nM2: "+this.m2+"\nM3 :"+this.m3;
     }
}
