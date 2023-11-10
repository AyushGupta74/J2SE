package assingment23;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ThreadLocalTest {
	 
    public static void main(String args[]) throws IOException {
        Thread t1 = new Thread(new Task());  
        Thread t2 = new Thread( new Task());
      
        t1.start();
        t2.start();      
      
    }
    
 
    public static String threadSafeFormat(Date date){
        DateFormat formatter = PerThreadFormatter.getDateFormatter();
        return formatter.format(date);
    }
    
}
 
 
class PerThreadFormatter {
 
    private static final ThreadLocal<SimpleDateFormat> dateFormatHolder = new ThreadLocal<SimpleDateFormat>() {
 
        
        @Override
        protected SimpleDateFormat initialValue() {
            System.out.println("Creating SimpleDateFormat for Thread : " + Thread.currentThread().getName());
            return new SimpleDateFormat("dd/MM/yyyy");
        }
    };
 
   
    public static DateFormat getDateFormatter() {
        return dateFormatHolder.get();
    }
}
 
class Task implements Runnable{
    
    @Override
    public void run() {
        for(int i=0; i<2; i++){
            System.out.println("Thread: " + Thread.currentThread().getName() + " Formatted Date: " + ThreadLocalTest.threadSafeFormat(new Date(i)) );
        }      
    }
}



