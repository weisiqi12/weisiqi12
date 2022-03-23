public class strings1 {
    public static void main(String[] args) {
        char[]chs={'a','b','c'};
        String s1=new String(chs);
        String s2=new String(chs);
        String s3="abc";
        String s4="abc";
//        比较值和地址值是否相同
        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s1==s3);
//        比较内容是否相同
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }
}
