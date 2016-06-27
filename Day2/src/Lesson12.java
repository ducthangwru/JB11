
public class Lesson12 {
    public static void main(String[] args) {
        double a = 6.5;
        System.out.println("Giá trị phần nguyên của " + a + " là " + (int) a);
        int b = 2;
        System.out.println("Giá trị số thực của " + b + " là " + (float) b);
        System.out.println("Tổng của " + a + " và " + b + " là " + (a + b));
        System.out.println("Tổng phần nguyên là " + (int) (a + b));
        System.out.println("Phần thực của tổng 2 số là : " + ((float) (a + b) - (int) (a + b)));

    }
}
