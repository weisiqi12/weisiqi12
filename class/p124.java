public class p124 {
    public static void main(String[] args) {
        int[]arr={1,2,3};
         String x=bind(arr);
        System.out.println(x);



    }
    public static String  bind(int[]arr){
        String s="";/*先定义一个空的字符*/
        s+="[";
for(int i=0;i<arr.length;i++){
    if(i<arr.length-1){
        s+=arr[i];
        s+=",";}
        else{
        s+=arr[i];
            s+="]";

    }

}return s;
    }}

