//Create two product class objects and compare its data
package p2q56;
import p2q53.Product;
public class CompareDataDemo {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Shoe", 10.0f, 5);
        Product p2 = new Product(2, "Socks", 5.0f, 10);
        System.out.println(p1.equals(p2));//false

        Product p3 = new Product(1, "Shoe", 10.0f, 5);
        Product p4 = new Product(1, "Shoe", 10.0f, 5);
        System.out.println(p3.equals(p4)); //true
    }
}
