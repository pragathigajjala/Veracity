package p2q43;
public class Demo {
    public static int calculateLength(String str){
        //calculate length here and don't use length function of string class
        int count=0;
        str=str+"\0";
        for(int i=0;str.charAt(i)!='\0';i++)
        {
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "Hello how are you shyam?";
        int len = calculateLength(str);
        System.out.println(len);
    }
}
