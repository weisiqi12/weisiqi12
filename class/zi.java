public class zi extends fu{
    public int weight=20;
    public  int age=20;


    public  zi(){
        System.out.println("子类展示无参数方法");
    }
    public zi(int age){
        System.out.println("子类展示带参数方法");
    }
public void show(){
        int age=10;
    System.out.println(age);
    System.out.println(this.age);
    System.out.println(super.age);
}
    }

