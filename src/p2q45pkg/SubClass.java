package p2q45pkg;
import p2q45.AccessSpecDemo;
public class SubClass extends AccessSpecDemo{
        public static void main(String[] args){
            SubClass obj=new SubClass();
            //System.out.println("diff  subclass diff package-"+obj.priVar);//not accessible
             System.out.println("diff subclass diff package-"+obj.proVar);
             //System.out.println("diff  subclass diff package-"+obj.defVar);//not accessible
            System.out.println("diff  subclass diff package-"+obj.pubVar);

            AccessSpecDemo obj1=new AccessSpecDemo();
            //System.out.println("diff  subclass diff package-"+obj1.priVar);//not accessible
           // System.out.println("diff subclass diff package-"+obj1.proVar);//------------why not accessible?????
            //System.out.println("diff  subclass diff package-"+obj1.defVar);//not accessible
            System.out.println("diff  subclass diff package-"+obj.pubVar);
        }
    }

class NonSubClass {
    public static void main(String[] args){
        AccessSpecDemo obj=new AccessSpecDemo();
        //System.out.println("diff  class diff package-"+obj.priVar);//not accessible
        //System.out.println("diff  class diff package-"+obj.proVar);
        //System.out.println("diff  class diff package-"+obj.defVar);
        System.out.println("diff  class diff package-"+obj.pubVar);
    }
}

