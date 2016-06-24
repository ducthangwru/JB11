import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        float x1, x2, delta;
        System.out.println("Phương trình có dạng aX^2 + bX + c = 0");
        System.out.println("Nhập các hệ số a, b, c: ");

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        System.out.printf("Phương trình vừa nhập là: (%d)X^2 + (%d)X + (%d) = 0 \n", a, b, c);
        delta = (float) (Math.pow(b, 2) - 4 * a * c);

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                if (c == 0) {
                    System.out.println(" X = 0 ");
                } else {
                    System.out.println("X = " + (-b / c));
                }
            }
        } else {
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                System.out.println("Phương trình có nghiệm X = " + (-b / 2 * a));
            } else {
                x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("Phương trình có 2 nghiệm là: X1 = " + x1 + " và X2 = " + x2);
            }
        }
    }
}
