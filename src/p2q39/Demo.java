package p2q39;
public class Demo {
    public static void main(String[] args) {
        String str = "Hello how are you sam?";
        //here print the index of 'o' character from str string
        for(int i=0;i<=str.length()-1;i++)
        {
            if(str.charAt(i)=='o')
                System.out.println("o is present at "+i+"th index");
        }
    }
}
