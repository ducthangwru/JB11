import java.util.Scanner;
public class Lesson9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = 0;
        String c = "";
        int b = 0;
        boolean d = true;

        System.out.println("Nhập vào 1 số thực: ");
        a = input.nextDouble(); //hoặc float a = input.nextFloat();
        System.out.println("Nhập vào 1 ký tự: ");
        c = input.next();
        System.out.println("Nhap vào 1 số nguyên: ");
        b = input.nextInt(); //hoặc long - nextLong(); short - nextShort(); byte - nextByte();
        System.out.println("Nhập vào giá trị boolean: ");
        d = input.nextBoolean();

        System.out.println("Gia tri a = " + a);
        System.out.println("Gia tri b = " + b);
        System.out.println("Gia tri c = " + c);
        System.out.println("Gia tri d = " + d);
    }
}