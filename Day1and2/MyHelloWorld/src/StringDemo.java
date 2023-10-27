
public class StringDemo {

	public static void main(String[] args) {
		String s="Hello";
		String s1="Hello";
		String s2="welcome";
		String s3="welcome";
		s=s+" world!!";
		String s4="Hello";
		String s5=new String("Hello");
		System.out.println("--------------------------");
		System.out.println(s3+"----"+s2);
		System.out.println("s3==s2--->"+(s3==s2));  //true
		System.out.println("s1==s5--->"+(s1==s5));  //false
		System.out.println("s1.equals(s5)  -->"+(s1.equals(s5)));  //true
		System.out.println("s1.compareTo(s5)"+(s1.compareTo(s5)));  ///-ve number s3<s5 0 if they are equal +ve s3>s5
		StringBuffer sbf=new StringBuffer("String buffer");
		StringBuilder sbr=new StringBuilder("String builder");
		
	}

}
