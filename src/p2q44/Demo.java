package p2q44;
public class Demo {
    public static void main(String[] args) {
        String str = "Hello Welcome";
        //print index of first 'l' after 'W'
        int index=0;
        for(int i=0;i<=str.length()-1;i++) {
            if(str.charAt(i)=='W') {
                for(int j=i+1;j<=str.length()-1;j++){
                    if(str.charAt(j)=='l'){
                       index=j;
                    }
                }
            }
        }
        System.out.println("index of first 'l' after 'W' is "+index);
    }
}
