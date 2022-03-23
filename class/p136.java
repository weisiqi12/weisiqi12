import java.util.ArrayList;

public class p136 {
    public static void main(String[] args) {
        ArrayList<String> x=new ArrayList<>();
//        定义一个空的集合；
                x.add("Hello");
                x.add("World");
//                为空集合增加元素
        System.out.println(x);
        x.add(1,"Fuck");
//        在指定位置插入元素
        System.out.println(x);
//        删除元素并返回true或false

        System.out.println(x.remove("Fuck"));
//        删除指定索引元素,返回所删除元素
        x.remove(1);  System.out.println(x);
//        修改指定索引元素值，返回被修改元素值
        x.set(0,"World");  System.out.println(x);
//        得到指定元素值
        x.get(0);  System.out.println(x);
//        得到集合的长度
        ;  System.out.println(x.size());
    }

}
