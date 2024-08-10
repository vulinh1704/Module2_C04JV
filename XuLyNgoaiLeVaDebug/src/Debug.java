public class Debug {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        for (int i = 0; i < 10; i++) {
            a += b;
            a += i;
        }
        increment(a, b);
        System.out.println(a);
        System.out.println(b);
    }

    public static void increment(int a, int b) {
        a++;
        b++;
    }
}
