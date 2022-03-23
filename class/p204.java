public class p204 {
    public static void main(String[] args) {
        String s="91 26 47 38 50";
        String[]sp =s.split(" ");/*运用split方法分割字符串且输出字符数组*/

        int []arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(sp[i]);
        }
        for(int x=0;x<arr.length-1;x++){
            for(int i=0;i< arr.length-1-x;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;/*利用temp中间值使两者交换值*/
                }/*冒泡排序*/
            }
        }
        StringBuilder s1=bind(arr);
        String s3=s1.toString();
        System.out.println(s3);
    }
    public static StringBuilder bind(int[]arr){
        StringBuilder x=new StringBuilder("[");
        for(int i=0;i<arr.length;i++){
            if(i<arr.length-1){
                x.append(arr[i]).append(" ");}
            else{
                x.append(arr[i]).append("]");
            }
        }
        return x;
    }
}
