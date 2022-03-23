public class p91 {
    public static void main(String[] args) {
        int[] a=new int[20];
         a[0]=1;a[1]=1;
         for(int k=2;k<a.length;k++){
             a[k]=a[k-1]+a[k-2];

         }
        System.out.println(a[19]);
    }
}
