public class p1 {
    public static void main(String[] args){
        int[]arr={2,7,11,15};
        int a=9;

        for(int i=0;i<arr.length;i++){
            for(int k=0;k<arr.length;k++){
                if(arr[i]+arr[k]==a){

                    System.out.println("["+i+","+k+"]");

                }

            }
        }

    }
}
