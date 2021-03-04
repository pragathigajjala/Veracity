package p2q51;

interface SimCard{
    void sms();
    void call();
}

class Test implements SimCard {
    @Override
    public void sms() {
        System.out.println("sms implementation");
    }

    @Override
    public void call() {
        System.out.println("call implementation");
    }

}
public class ISimDemo{
    public static void main(String[] args){
//implement SimCard in Test class and override methods
//call those methods from here
        SimCard obj=new Test();
        obj.sms();
        obj.call();

        }
        }