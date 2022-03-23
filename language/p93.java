public class p93 {
    public static void main(String[] args) {
        int []arr=new int[]{68,27,95,88,171,996,51,210};
        int sum=0;
        for (int k=0;k<arr.length;k++){
            if(arr[k]%10!=7&&arr[k]/10%10!=7&&arr[k]%2==0){
                    sum+=arr[k];}

        }
        System.out.println(sum);
    }
}
