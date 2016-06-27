import java.util.Scanner;
import java.io.*;
public class Lesson5 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int a, b;
        char choose;

        System.out.println("Nhập 2 số: ");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Nhập phép tính: ");
        choose = (char) System.in.read();

        switch (choose) {
            case 43:
                System.out.println("Tổng 2 số là: " + (a + b));
                break;
            case 45:
                System.out.println("Hiệu 2 số là: " + (a - b));
                break;
            case 42:
                System.out.println("Tích 2 số là: " + (a * b));
                break;
            case 47:
                System.out.println("Thương 2 số là: " + (float) a / b );
            break;
            default:
                System.out.println("Bạn nhập sai!");
                break;
        }
    }
}
