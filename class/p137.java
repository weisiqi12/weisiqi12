import java.util.ArrayList;

public class p137 {
    public static void main(String[] args) {
        ArrayList<String> x=new ArrayList<>();
        x.add("a");
        x.add("b");
        x.add("c");
        x.add("d");
        int a= x.size();
        for(int i=0;i<a;i++){
            System.out.println(x.get(i));
        }
    }
}
