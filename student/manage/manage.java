import java.util.ArrayList;
import java.util.Scanner;

public class manage {
    public static void main(String[] args) {
        ArrayList<student2> arr = new ArrayList<>();
        for (int time = 1; time < 100; time++) {
            System.out.println("------" + "欢迎来到学生管理系统" + "------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择");

            Scanner x = new Scanner(System.in);
            int num = x.nextInt();

            if (num == 1) {
                add(arr);

            } else if (num == 2) {
                remove(arr);

            } else if (num == 3) {
                set(arr);
            } else if (num == 4) {
                review(arr);
            } else if (num == 5) {
                break;
            }
        }


    }

    public static void add(ArrayList<student2> arr) {/*添加学生*/
        student2 s = new student2();
        Scanner x = new Scanner(System.in);
        String id;


        while (true) {
            System.out.println("请输入学号");
            id = x.nextLine();
            boolean k = overlap(arr, id);
            if (k) {
                System.out.println("输入的学号重复,请重新输入");
            } else {
                break;
            }
        }
        System.out.println("请输入姓名");
        String name = x.nextLine();
        System.out.println("请输入年龄");
        String age = x.nextLine();
        System.out.println("请输入地址");
        String address = x.nextLine();
        s.setAddress(address);
        s.setAge(age);
        s.setName(name);
        s.setId(id);
        arr.add(s);
        System.out.println("添加成功");
    }

    public static boolean overlap(ArrayList<student2> arr, String id) {
        boolean flag = false;
        for (int i = 0; i < arr.size(); i++) {
            student2 z = arr.get(i);
            if (z.getId().equals(id)) {
                flag = true;
            }
        }
        return flag;
    }


    public static void remove(ArrayList<student2> arr) {
        Scanner s2 = new Scanner(System.in);
        System.out.println("请输入要删除的学号");
        String id1 = s2.nextLine();
        boolean view = true;
        for (int i = 0; i < arr.size(); i++) {
            student2 s3 = arr.get(i);

            if (s3.getId().equals(id1)) {
                view = true;
                arr.remove(i);
                break;
            } else {
                view = false;
            }
        }
        if (view) {
            System.out.println("输入的学号不存在");
        } else {
            System.out.println("删除成功");
        }

    }

    public static void set(ArrayList<student2> arr) {
        student2 s4 = new student2();
        Scanner x2 = new Scanner(System.in);
        System.out.println("请输入要修改的学号");
        String id3 = x2.nextLine();
        System.out.println("请输入新姓名");
        String name = x2.nextLine();
        System.out.println("请输入新年龄");
        String age = x2.nextLine();
        System.out.println("请输入新地址");
        String address = x2.nextLine();
        s4.setAddress(address);
        s4.setAge(age);
        s4.setName(name);
        s4.setId(id3);
        for (int i = 0; i < arr.size(); i++) {
            student2 s5 = arr.get(i);
            if (s5.getId().equals(id3)) {
                arr.set(i, s5);
                break;
            }

        }
        System.out.println("修改成功");
    }

    public static void review(ArrayList<student2> arr) {
        for (int i = 0; i < arr.size(); i++) {
            student2 s6 = arr.get(i);
//            需要赋值给student类；
            System.out.println(s6.getName() + "," + s6.getAge() + "," + s6.getId() + "," + s6.getAddress());
        }
    }
}
