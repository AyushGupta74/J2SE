
public class StringDemo 
{
	public static void main(String[] args) {
		String a = "anurag";
		String b = "AnuraG";
		System.out.println(a.toUpperCase());
		System.out.println(a.contains("rag"));
		System.out.println(b.compareTo(a));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.charAt(4));
		System.out.println(b.indexOf("u"));
		
	}
}
