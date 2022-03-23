public class p82 {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);/*输出10*/
        change(a);
        System.out.println(a);/*还是输出10*/
    }
//形参不能改变实参的值，因为是基本数据类型参数(int b;)，值传递
    public static int  change(int b) {
        return b=20;

    }
}
