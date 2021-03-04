package p2q37;
public class Demo {
    public static String reverseString(String str) {
        //reverse str string here and return
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        return rev;
    }
        public static void main(String[] args) {
        String str = "Hello Welcome";
        String reversedString = reverseString(str);
        System.out.println(reversedString);
    }
}
