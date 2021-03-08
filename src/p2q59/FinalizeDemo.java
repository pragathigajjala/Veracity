//Write a program which will explain finalize method
package p2q59;
public class FinalizeDemo {
    public static void main(String[] args)
    {
        FinalizeDemo obj = new FinalizeDemo();
        obj = null;
        System.gc(); // requesting garbage collector
        System.out.println("end of garbage collection");
    }
    protected void finalize()
    {
        System.out.println("finalize method called");
    }
}

