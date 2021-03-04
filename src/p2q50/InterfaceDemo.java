//Create one interface with two abstract methods and implement those methods in one class and call them.
package p2q50;
public class InterfaceDemo implements IClass {
    @Override
    public void method1() {
        System.out.println("Method1 implemented");
    }
    @Override
    public void method2() {
        System.out.println("Method2 implemented");

    }
    public static void main(String[] args)
    {
        InterfaceDemo obj=new InterfaceDemo();
        obj.method1();
        obj.method2();
    }

}

interface IClass{
    void method1();
    void method2();
}
