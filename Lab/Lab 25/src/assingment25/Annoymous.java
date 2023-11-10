package assingment25;

public class Annoymous {
	public static void main(String[] args) {
	      new Thread() {
	         public void run() {
	            for (int i=1; i <= 5; i++) {
	               System.out.println("run() method: " + i);
	            }
	         }
	      }.start();
	      for (int j=1; j <= 5; j++) {
	         System.out.println("main() method: " + j);
	      }
	   }
}
