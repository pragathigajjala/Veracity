package p2q48;

class Parent1{
    public static void show()
    {
        System.out.println("Parent1 method");
    }
}
class Parent2{
    public static void show()
    {
        System.out.println("Parent2 method");
    }
}

public class MultipleInheritanceDemo extends Parent1,Parent2{ //CE error
    MultipleInheritanceDemo child=new MultipleInheritanceDemo();
    child.show(); //Diamond problem; Whether to call Parent1 show() or Parent2 show()
}

