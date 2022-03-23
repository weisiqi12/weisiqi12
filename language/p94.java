public class p94 {
    public static void main(String[] args) {
        int[]arr1={1,2,3,4,5,6,9};
        int[]arr2={1,2,3,4,5,6,9};
        System.out.println(issame(arr1,arr2));
    }

    public static boolean issame(int[] arr1,int[] arr2) {
        if(arr1.length!=arr2.length){
            return false;
        }
        else {
            for(int k=0;k<arr1.length;k++){
                if(arr1[k]!=arr2[k]){
                   return false;

                }


            }return true;
        }


    }
}
