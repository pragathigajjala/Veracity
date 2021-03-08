//Create product class with id,name,price,qnty and create object with some data
// and display that data using toString
package p2q53;
public class Product {
    private int id;
    private String name;
    private float price;
    private int qty;
    public Product(int id, String name, float price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString()
    {
        return getId()+" "+getName()+" "+getPrice()+" "+getQty();
    }

    public static void main(String[] args)
    {
        Product p=new Product(1,"Shoe",40.0f,5);
        System.out.println(p);
    }

    public boolean equals(Object o){
        Product p2=(Product)o;
        if(id==p2.id&&name==p2.name&&price==p2.price&&qty==p2.qty)
        {
            return true;
        }
        else
        {
            return false;
        }

    }


}
