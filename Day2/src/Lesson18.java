import java.util.Scanner;

public class Lesson18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Year;

        System.out.println("Mời nhập năm: ");
        Year = input.nextInt();

        System.out.println("Năm " + Year + " là có phải là năm nhuận không? ");
        System.out.println((Year % 100 != 0 && Year % 4 == 0) || (Year % 400 == 0));
    }
}
