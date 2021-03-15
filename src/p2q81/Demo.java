package p2q81;

import java.util.HashSet;

class Product{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private String name;
    private int price;
    private int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return getName()+" "+getPrice()+" "+getPrice();
    }
    //do required changes in Product class
}

  //  Now create HashSet of Product and make sure duplicates are not there
public class Demo{
      public static void main(String[] args) {
          HashSet<Product> hs=new HashSet<>();
          hs.add(new Product("Shoe",100,50));
          hs.add(new Product("Socks",10,100));
          hs.add(new Product("shirts",12,70));
          System.out.println(hs);

      }
  }