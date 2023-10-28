import java.time.LocalDate;
import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		
		//Employee e=new Employee(12,"xxx","3333","asd@gmail.com","Hr","mgr",LocalDate.of(2001,11,23));
        //System.out.println(e);
        SalariedEmp semp=new SalariedEmp(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),4556,345);
		System.out.println(semp);
		semp.calculateSal();
	
		ContractEmployee cemp=new ContractEmployee(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),30,4000);
		cemp.calculateSal();
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		Employee e1=null;
		
		if(i>5)
		    e1=new SalariedEmp();
		else 
			e1=new ContractEmployee();
		e1.calculateSal();
		Person p=new SalariedEmp();
		System.out.println(cemp);
		SalariedEmp s=(SalariedEmp)e1;
	}

}
