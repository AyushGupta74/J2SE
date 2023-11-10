package assingment23;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ObjectDemo extends Object {

	   private List synchedList;

	   public ObjectDemo() {
	 
	      synchedList = Collections.synchronizedList(new LinkedList());
	   }

	 
	   public String removeElement() throws InterruptedException {
	      synchronized (synchedList) {

	     
	         while (synchedList.isEmpty()) {
	            System.out.println("List is empty...");
	            synchedList.wait();
	            System.out.println("Waiting...");
	         }
	         String element = (String) synchedList.remove(0);

	         return element;
	      }
	   }

	   public void addElement(String element) {
	      System.out.println("Opening...");
	      synchronized (synchedList) {

	
	         synchedList.add(element);
	         System.out.println("New Element:'" + element + "'");

	         synchedList.notifyAll();
	         System.out.println("notifyAll called!");
	      }
	      System.out.println("Closing...");
	   }

	   public static void main(String[] args) {
	      final ObjectDemo demo = new ObjectDemo();

	      Runnable runA = new Runnable() {

	         public void run() {
	            try {
	               String item = demo.removeElement();
	               System.out.println("" + item);
	            } catch (InterruptedException ix) {
	               System.out.println("Interrupted Exception!");
	            } catch (Exception x) {
	               System.out.println("Exception thrown.");
	            }
	         }
	      };

	      Runnable runB = new Runnable() {

	       
	         public void run() {
	            demo.addElement("Hello!");
	         }
	      };

		      try {
		         Thread threadA1 = new Thread(runA, "A");
		         threadA1.start();
	
		         Thread.sleep(500);
	
		         Thread threadA2 = new Thread(runA, "B");
		         threadA2.start();
	
		         Thread.sleep(500);
	
		         Thread threadB = new Thread(runB, "C");
		         threadB.start();
	
		         Thread.sleep(1000);
	
		         threadA1.interrupt();
		         threadA2.interrupt();
		      } catch (InterruptedException x) {
	      }
	   }
	}