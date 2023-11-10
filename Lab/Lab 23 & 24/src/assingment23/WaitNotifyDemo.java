package assingment23;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class WaitNotifyDemo{
	public static void main(String[] args)
	   {
	      List<Integer> taskQueue = new ArrayList<Integer>();
	      int MAX_CAPACITY = 5;
	      Thread tProducer = new Thread(new Producer(taskQueue, MAX_CAPACITY), "Producer");
	      Thread tConsumer = new Thread(new Consumer(taskQueue), "Consumer");
	      tProducer.start();
	      tConsumer.start();
	   }
}