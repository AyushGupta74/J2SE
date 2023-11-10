public class TestEmployee {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J"); 
        // System.out.flush();
        Employee[] earr = new Employee[4];
		earr[0]=new Employee(1,"Anurag",50000);
		earr[1]=new Employee(2,"Omkar",5000);
		earr[2]=new Employee(3,"Harsh",500);
		earr[3]=new Employee(4,"Nilesh",50);

        for (Employee e : earr) {
            System.out.println(e);
        }
    }
}
