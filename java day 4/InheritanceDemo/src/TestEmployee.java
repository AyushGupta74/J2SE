import java.time.LocalDate;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e=new Employee(12,"xxx","3333","asd@gmail.com","Hr","mgr",LocalDate.of(2001,11,23));
        System.out.println(e);
        SalariedEmp semp=new SalariedEmp(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),4556,345);
		System.out.println(semp);
		ContractEmployee cemp=new ContractEmployee(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),30,4000);
		Employee e1=new SalariedEmp();
		((SalariedEmp)e1).getBonus();
		Person p=new SalariedEmp();
		System.out.println(cemp);
		SalariedEmp s=(SalariedEmp)e1;
	}

}
