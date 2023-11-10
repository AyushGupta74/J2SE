package yeild;

public class YieldDemo extends Thread
{
	 public void run() {
	      for (int i = 0; i < 5; ++i) {
	         Thread.yield();
	         System.out.println("Thread started:" + Thread.currentThread().getName());
	      }
	      System.out.println("Thread ended:" + Thread.currentThread().getName());
	   }
	
	
	   public static void main(String[] args) {
		   YieldDemo thread = new YieldDemo();
	      thread.start();
	      for (int i = 0; i < 5; ++i) {
	         System.out.println("Thread started:" + Thread.currentThread().getName());
	      }
	      System.out.println("Thread ended:" + Thread.currentThread().getName());
	   }
}