public class p195 {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        for(int i=1;i<=10000;i++){
            System.out.println(i);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start+"毫秒");
    }
}
