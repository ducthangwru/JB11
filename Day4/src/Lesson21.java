public class Lesson21 {

    public static void main(String[] args) {
        Lesson21 obj = new Lesson21();
        obj.add(10, 10);
        obj.add(10.5f, 10.24f);
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(float a, float b) {
        System.out.println(a + b);
    }
}
