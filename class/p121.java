import java.util.Scanner;

public class p121 {
    public static void main(String[] args) {
        String user="weisiqi";
        String passport="123456789";
        System.out.println("请输入用户名和密码");

        for(int i=1;i<=3;i++) {Scanner user1=new Scanner(System.in);

            String a=user1.nextLine();
            String b=user1.nextLine();
            if (a.equals(user) && b.equals(passport)) {
                System.out.println("成功登录");
                break;
            }
            else{
                System.out.println("还有"+(3-i)+"次机会,"+"请重新输入");
            }
        }
    }
}
