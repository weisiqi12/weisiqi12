public class student {

    private String age;
    private String name;

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String getAge(){
        return age;
    }
    public student(){

    }
    public student(String name, String age){
        this.name=name;
        this.age=age;
    }
    public void show(){
        System.out.println(name+","+age);
    }
}
