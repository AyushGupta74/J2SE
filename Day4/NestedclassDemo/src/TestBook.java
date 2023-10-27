
public class TestBook {

	public static void main(String[] args) {
		Book b=new Book();
   		Book.Lesson l=b.new Lesson();
        l.m1();
        //OuterClass ob=new OuterClass();
        OuterClass.InnerClass ob1=new OuterClass.InnerClass();
        ob1.test();
	}

}
