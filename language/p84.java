public class p84 {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,11};
        change(arr);
    }
//数组遍历且成一行
    public static void change(int []arr) {
        System.out.print("[");
        for(int a=0;a<arr.length;a++){
            if(a==arr.length-1){
                System.out.print(arr[a]);
            }else{
                System.out.print(arr[a]+",");
            }

        }System.out.print("]");
    }
}
