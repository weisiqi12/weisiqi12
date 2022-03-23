import java.util.ArrayList;

public class p138 {
    public static void main(String[] args) {
        ArrayList<student> x=new ArrayList<>();
        student s1=new student("小明","30");
        student s2=new student("小黄","20");
        student s3=new student("小兰","10");
        x.add(s1);
        x.add(s2);
        x.add(s3);
        for(int i=0;i< x.size();i++){
            student  s=x.get(i);
//            需要赋值给student类；
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
