package p2q47;

public class InheritanceDemo {
    public static void print()
    {
        System.out.println("child calling the parent method");
    }
}

class ChildClass extends InheritanceDemo{
    public static void main(String[] args){
        InheritanceDemo.print();
    }

}
