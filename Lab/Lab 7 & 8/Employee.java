public class Employee {
    private int id;
    private String name;
    private int sal;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSal() {
        return sal;
    }
    public void setSal(int sal) {
        this.sal = sal;
    }
    public Employee() {
    }
    public Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public String toString(){
        return ("Employee: [Name: "+this.name+" ID:"+this.id+" Salary: "+sal+" ]");
    }
    
}
