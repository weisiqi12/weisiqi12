public class studentgg {
    public static void main(String[] args) {
        student s1=new student();
            s1.setAge("30");
        s1.setName("小明");
        s1.show();
//       输出 无参构造方法
//                小明30
        student s2=new student("小明","30");
        s2.show();
//        输出 带参数的构造方法；
    }
}
