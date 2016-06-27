import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1, s2;

        System.out.println("Nhập chuỗi s1 : ");
        s1 = input.next();
        System.out.println("Nhập chuỗi s2: ");
        s2 = input.next();

        System.out.println("Chuỗi 2 có phải là substring chuỗi 1 không?");
        System.out.println(s1.contains(s2));
    }
}
