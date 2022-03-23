import java.util.ArrayList;
import java.util.Scanner;

public class p139 {
    public static void main(String[] args) {
        ArrayList<student> x=new ArrayList<>();
        bind(x);
        bind(x);
        bind(x);
        for(int i=0;i< x.size();i++){
            student xx=x.get(i);
            System.out.println(xx.getName()+","+xx.getAge());
        }
    }
    public static void bind(ArrayList<student> x){
        Scanner y=new Scanner(System.in);
        System.out.println("请输入姓名");
        String name=y.nextLine();
        System.out.println("请输入年龄");
        String age=y.nextLine();
        student s=new student();
        s.setAge(age);
        s.setName(name);
        x.add(s);

    }
}
