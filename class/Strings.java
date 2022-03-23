public class Strings {
    public static void main(String[] args) {
        String s1=new String();/*定义一个空白字符*/

        char[] chs={'a','b','c'};
//        第二种定义方式
        byte[] bys={98,99,100};
//        第三种定义方式
        String s2=new String(chs);
        String s3=new String(bys);
        String s4="abc";
//        直接赋值
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
