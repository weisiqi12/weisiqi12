import java.util.Scanner;

public class p89 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();

        if (a == 1) {
            System.out.println("跑步");
        } else if (a == 2) {
            System.out.println("游泳");
        } else if (a == 3) {
            System.out.println("慢跑");
        } else if (a == 4) {
            System.out.println("动感单车");
        } else if (a == 5) {
            System.out.println("拳击");
        } else if (a == 6) {
            System.out.println("爬山");
        } else if (a == 7) {
            System.out.println("大吃一顿");
        } else {
            System.out.println("输入数据有误，请重新输入");
        }
    }
}
