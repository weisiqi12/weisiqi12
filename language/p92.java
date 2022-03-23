public class p92 {
    public static void main(String[] args) {
        for (int x = 0; x < 100; x++) {
            for (int y = 0; y < 100; y++) {
                for (int z = 0; z < 100; z++) {
                    if (z % 3 != 0) {
                        continue;
                    } else if ((x + y + z == 100) && (5 * x + 3 * y + z / 3 == 100)) {
                        System.out.println("鸡公是" + x + "鸡婆是" + y + "小鸡是" + z);
                    }
                }
            }
        }
    }
}
