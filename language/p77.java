//运用带返回值的方法调用求最大值
public class p77 {
    public static void main(String[] args){

        System.out.println(max(10,20));
    }


    public static  int max(int a,int b){

        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
}
