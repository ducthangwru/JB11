import java.util.Scanner;

public class Lesson18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Year;

        System.out.println("Mời nhập năm: ");
        Year = input.nextInt();

        System.out.printf("Năm %d có phải là năm nhuận không? -- ", Year);
        System.out.println(isLeapYear(Year));

    }

    public static boolean isLeapYear(int Year) {
        return Year % 400 == 0 || (Year % 100 != 0 && Year % 4 == 0);
    }
}
