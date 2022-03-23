import java.util.Scanner;
//用StringBuilder实现字符反转
public class p132 {
    public static void main(String[] args) {

       Scanner s=new Scanner(System.in);
    String s1=s.nextLine();
    String s4=inverse(s1);
        System.out.println(s4);
}
    public static String inverse(String s1){
        StringBuilder s2=new StringBuilder(s1);
        s2.reverse();
        String s3=s2.toString();
        return s3;
    }
}
