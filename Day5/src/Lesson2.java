import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number;

        System.out.println("Nhập 1 số: ");
        number = input.nextLong();

        System.out.println("Tổng các chữ số là: " + sumOfDigit(number));
    }

    public static int sumOfDigit(long number) {
        int sum = 0;
        while (number != 0) {
            sum = (int) (sum + number % 10);
            number /= 10;
        }
        return sum;
    }
}
