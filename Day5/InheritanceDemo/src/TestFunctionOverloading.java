
public class TestFunctionOverloading {
	public static void add(Integer i,Integer j) {
		System.out.println("in Integer add");
	}
	public static void add(int i,int j) {
		System.out.println("in int add");
	}
	public static void add(float i,float j) {
		System.out.println("in float add");
	}
	public static void main(String[] args) {
		add(12,13);
		final int i=23;
		i=34;
	}

}
