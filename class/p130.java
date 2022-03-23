public class p130 {
//    用StringBuilder实现字符串的拼接
    public static void main(String[] args) {
        int []arr={1,21,33,14,5,8};
StringBuilder y=bind(arr);
String z= y.toString();
        System.out.println("冒泡排序前"+z);
        for(int x=0;x<arr.length-1;x++){
            for(int i=0;i< arr.length-1-x;i++){
                if(arr[i]<arr[i+1]){
                    int temp=arr[i];
                arr[i]=arr[i+1];
                    arr[i+1]=temp;/*利用temp中间值使两者交换值*/
                }/*冒泡排序*/
            }
        }
        StringBuilder y1=bind(arr);
        String z1= y1.toString();
        System.out.println("冒泡排序后"+z1);

    }
    public static StringBuilder bind(int[]arr){
        StringBuilder x=new StringBuilder("[");
        for(int i=0;i<arr.length;i++){
            if(i<arr.length-1){
            x.append(arr[i]).append(",");}
            else{
                x.append(arr[i]).append("]");
            }
        }
        return x;
    }
}
