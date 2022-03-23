import java.util.Random;

public class p98 {
    public static void main(String[] args) {
        Random x=new Random(10);
//        int a1=x.nextInt();
//        int a2=x.nextInt();
//        int a3=x.nextInt();
//        int a4=x.nextInt();
//        int a5=x.nextInt();
//        int a6=x.nextInt();
        int[]arr={1,2,4,4,7,6};
        System.out.println(avarge(arr));

    }

    public static int  avarge(int[] arr) {
        int max=arr[0];
        for(int k=1;k<arr.length;k++){
            if(max<arr[k]){
                max=arr[k];
            }}
            int min=arr[0];
            for(int j=1;j<arr.length;j++){
                if(min>arr[j]){
                    min=arr[j];
                }
            }
        int sum=0;
        for(int i=0;i<arr.length;i++){
           sum+=arr[i];
        }
            int ave=(sum-max-min)/4;
        return ave;
    }
}



