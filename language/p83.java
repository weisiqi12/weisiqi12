public class p83 {
    public static void main(String[] args) {
        int[] arr={10,20,30};
        System.out.println(arr[1]);/*输出20*/
        change(arr);
        System.out.println(arr[1]);/*输出40*/
    }
    //形参改变实参的值，因为是引用类型参数(int arr[]),地址传递
    public static void  change(int arr[] ) {
        arr[1]=40;

    }
}
