public class p125 {
    public static void main(String[] args) {
        String s="abcdefg";
        String y=inverse(s);
        System.out.println(y);

    }
    public static String inverse(String s){
        String x="";
        for(int i=s.length()-1;i>=0;i--){
            x+=s.charAt(i);
        }
        return x;
    }
}
