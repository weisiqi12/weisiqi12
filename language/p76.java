//判断奇偶数
public class p76 {
    public static void main(String[] args){
        boolean x=isevenumber(10);
        System.out.println(x);
    }


    public static  boolean isevenumber(int a){

        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}
