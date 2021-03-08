package P1;

import p2q53.Product;

public class Employee implements Cloneable {
    private int id;
    private String name;
    private int sal;

    public Employee(int id, String name, int sal) {
        super();
        this.id = id;
        this.name = name;
        this.sal = sal;
    }
    public Employee() {

    }

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

   public String toString()
    {
        return getId()+" "+getName()+" "+getSal();
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    public boolean equals(Object o){
        Employee e2=(Employee)o;
        if(id==e2.id&&name==e2.name&&sal==e2.sal)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}

