public class p90 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            int k=i-10*(i/10);
            int j=i/10;
            if(i%7==0||k==7||j==7){
                continue;
            }
            else{
                System.out.println(i);
            }
        }
    }
}
