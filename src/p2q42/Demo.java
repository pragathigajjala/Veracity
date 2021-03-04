package p2q42;
public class Demo {
    public static void main(String[] args) {
        String str = "Hello how are you shyam?";
        //here print number of occurrences of 'o' character from str string
        int count=0;
        for(int i=0;i<=str.length()-1;i++)
        {
            if(str.charAt(i)=='o')
                count++;
        }
        System.out.println("Number of occurences of 'o' : "+count);
    }
}
