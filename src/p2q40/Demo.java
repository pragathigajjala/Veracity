package p2q40;
public class Demo {
    public static void main(String[] args) {
        String str = "Hello how are you sam?";
        //here print the index of last 'o' character from str string
        int last=0;
        for(int i=0;i<=str.length()-1;i++)
        {
            if(str.charAt(i)=='o')
            {
                last=i;
            }
        }
        System.out.println("Index of last o : "+last);
    }
}
