public class student2 {
    private String id;
    private String name;
    private String age;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public  student2(){}
    public  student2(String id,String name,String age,String address){
        this.id=id;
        this.age=age;
        this.name=name;
       this.address=address;
    }
}
