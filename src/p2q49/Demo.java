package p2q49;
class Test{
    public void methodTest()
    {
        System.out.println("Test class method");
    }
}
class Test1 extends Test{
    public void methodTest()
    {
        System.out.println("Test1 class method");
    }

}
public class Demo{

    public static void main(String[] args) {
        //create one method in class Test
        //override that method in Test1 class
        //call that overridden method from here
        //to do this thing do required changes in all these three classes
        Test t=new Test1();
        t.methodTest();

    }

}
