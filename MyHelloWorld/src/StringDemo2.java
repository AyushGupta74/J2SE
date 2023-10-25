
public class StringDemo2 {
	public static void main(String[] args) {
		String s="Teststring";
		System.out.println("uppercase"+s.toUpperCase());
		System.out.println("lowercase"+s.toLowerCase());
		System.out.println("charAt"+s.charAt(0));
		System.out.println("length"+s.length());
		String t1="ABC,PQR,XYZ";
		String[] sarr=t1.split(",");
		System.out.println(sarr);
		System.out.println(s.substring(3,6));
		System.out.println(s.substring(3));
		System.out.println(s.indexOf("s"));
		System.out.println(s.lastIndexOf("s"));
		StringBuilder sb=new StringBuilder("String builder");
		sb.append("test append");
		System.out.println(sb);
	}

}
