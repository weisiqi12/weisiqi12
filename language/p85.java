public class p85 {

    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,11};
        System.out.println(change(arr));
    }
    //数组求最大值
    public static int change(int []arr) {
        int max = arr[0];
        for (int a = 1; a <arr.length; a++) {
            if (max < arr[a]) {
                max = arr[a];


            }
        }return max;
        }}