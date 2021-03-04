package p2q1;
class Employee {
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

    private int id;
    private String name;
    private int sal;
    public Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }
}
public class EmployeeData {
    public static void main(String[] args){
        Employee e=new Employee(1,"Sam",1000);
        System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
    }
}
