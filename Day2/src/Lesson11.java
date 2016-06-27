import java.util.Scanner;

public class Lesson11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float F;
        System.out.println("Nhập vào độ F = ");
        F = input.nextFloat();
        System.out.println("Bạn vừa nhập là " + F + " độ F");

        float C = (float) ((F - 32) / 1.8);
        System.out.println(F + " độ F ==> " + C + " độ C");
    }
}
