import java.util.Scanner;
//计算字符出现次数
public class p123 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("请输入一个字符");
        String s=x.nextLine();
//        计算字符长度
        System.out.println(s.length());
//        遍历字符组
        int a=0;int b=0;int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                a++;
            }
        }
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)>='A'&&s.charAt(j)<='Z'){
                b++;
            }
        }
        for(int k=0;k<s.length();k++){
            if(s.charAt(k)>='0'&&s.charAt(k)<='9'){
                c++;
            }
        }
        System.out.println("小写字母个数是"+a);
        System.out.println("大写字母个数是"+b);
        System.out.println("数字个数是"+c);
    }
}
