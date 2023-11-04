import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class TestLocalDate {

	public static void main(String[] args) {
		Date dt=new Date();
		System.out.println(dt);
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		//date to String
		System.out.println(sdf.format(dt));
		
		//String to date conversion
		System.out.println("enetr date");
		String d1=sc.next();
		try {
			Date dt1=sdf.parse(d1);
			System.out.println(dt1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          /// to convert string to local date
		 LocalDate dt2=LocalDate.parse(d1,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		 System.out.println(dt2);
		 //convert locaDate to String
		System.out.println(dt2.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		System.out.println("Year: "+dt2.getYear());
	}

}
