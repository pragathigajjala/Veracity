package p2q41;
public class Demo {
    public static void main(String[] args) {
        String str = "Hello how are you shyam?";
        //here print the index of third occurrence 'o' character from str string
        int count=0;
        for(int i=0;i<=str.length()-1;i++)
        {
            if(str.charAt(i)=='o')
            {
                count++;
            }
            if(count==3)
            {
                System.out.println("Third occurence of o is at index : "+i);
                return;
            }

        }
    }
}
