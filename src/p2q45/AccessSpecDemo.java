package p2q45;
public class AccessSpecDemo {
    private String priVar;
    protected String proVar;
    String defVar;
    public String pubVar;
    public static void main(String[] args) {
        AccessSpecDemo obj=new AccessSpecDemo();
        System.out.println("same class-"+obj.priVar);
        System.out.println("same class-"+obj.proVar);
        System.out.println("same class-"+obj.defVar);
        System.out.println("same class-"+obj.pubVar);
    }
}
class NonSubclass{
    public static void main(String[] args){
        AccessSpecDemo obj=new AccessSpecDemo();
        //System.out.println("different  class same package-"+obj.priVar);//not accessible
        System.out.println("different  class same package-"+obj.proVar);
        System.out.println("different  class same package-"+obj.defVar);
        System.out.println("different  class same package-"+obj.pubVar);
    }
}
class subclass extends AccessSpecDemo{
   public static void main(String[] args){
        AccessSpecDemo obj=new AccessSpecDemo();
        //System.out.println("different  class same package-"+obj.priVar);//not accessible
        System.out.println("subclass same package-"+obj.proVar);
        System.out.println("subclass same package-"+obj.defVar);
        System.out.println("subclass same package-"+obj.pubVar);
    }
}



