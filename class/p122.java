import java.util.Scanner;

public class p122 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("请输入一个字符");
        String s=x.nextLine();
//        计算字符长度
        System.out.println(s.length());
//        遍历字符组
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }

}
