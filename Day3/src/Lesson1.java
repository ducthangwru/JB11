import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Month, Year;

        System.out.println("Mời nhập tháng: ");
        Month = input.nextInt();
        System.out.println("Mời nhập năm: ");
        Year = input.nextInt();

        if (Month == 2) {
            if ((Year % 100 == 0 && Year / 100 % 4 != 0)) {
                System.out.printf("Tháng 2 Năm %d có 28 ngày", Year);
            } else {
                System.out.printf("Tháng 2 Năm %d có 29 ngày", Year);
            }
        } else {
            if (Month == 4 || Month == 6 || Month == 9 || Month == 11) {
                System.out.printf("Tháng %d Năm %d có 30 ngày", Month, Year);
            } else {
                System.out.printf("Tháng %d Năm %d có 31 ngày", Month, Year);
            }
        }
    }
}
