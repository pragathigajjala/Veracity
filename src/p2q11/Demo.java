package p2q11;
public class Demo {
    public static void main(String[] args) {
        //call show method in different ways
        Demo d=new Demo();
        d.show();
        Demo.show();
    }
    public static void show(){
        System.out.println("show method");
    }
}
