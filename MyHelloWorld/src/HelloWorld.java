
public class HelloWorld {
	public static void f1() {
		String s1="test";
		System.out.println(s1);
	}

	public static void main(String[] args) {
	   System.out.println("Hello World!!"+args[0]+"   "+args[1]);
	   String s="hello";
	   f1();
	   int s1=23;
	   Integer ob=56;
	   ob=s1;  /// boxing
	   //ob=new Integer(s1);
	   s1=ob;  ///unboxing
	   //s1=Integer.valueOf(ob);
	   
	}

}
