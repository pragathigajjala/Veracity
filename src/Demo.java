class Demo {
    int a;
   protected Demo()
    {
        this.a=10;
    }
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.a);
    }

}
