public class p129 {
    public static void main(String[] args) {
//        创建对象
        StringBuilder s=new StringBuilder("helloworld");
//        字符拼接
        s.append("001").append("002").append("003");
//        链式编程
        System.out.println(s);
//        字符反转
        s.reverse();
        System.out.println(s);
//        StringBuilder转化为String
String s2=s.toString();
        System.out.println(s2);
//        String转化为StringBuilder
        StringBuilder s3=new StringBuilder(s);
    }
}
