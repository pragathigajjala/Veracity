package p2q29;
public class Demo {
    public static float m1(int i){
        System.out.println("m1 called");
        return i*i;
    }
    public static void main(String[] args) {
        //call m1 method and pass some number
        float result=m1(10);
        int total = 100 + (int)result;
        System.out.println(total);
    }
}
