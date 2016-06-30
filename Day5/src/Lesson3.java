import java.util.Scanner;
import java.util.regex.Matcher;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number;

        System.out.println("Nhập mã thẻ: ");
        number = input.nextLong();

        if (isValid(number))
            System.out.println("Mã thẻ " + number + " hợp lệ");
        else
            System.out.println("Mã thẻ " + number + " không hợp lệ");
    }

    public static boolean isValid(long number) {
        int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        return (sum % 10 == 0 && isRightPrefix(number));


    }

    public static int sumOfDoubleEvenPlace(long number) {
        int sumOfDoubleEven = 0, numberOFDoubleEven = 0;
        while (number != 0) {
            number /= 10;
            numberOFDoubleEven = (int) (number % 10);
            sumOfDoubleEven = sumOfDoubleEven + getDigit(numberOFDoubleEven);
            number /= 10;
        }
        return sumOfDoubleEven;
    }

    public static int getDigit(int number) {
        if ((number * 2) / 10 == 0)
            return number * 2;
        else
            return (number * 2) % 10 + (number * 2) / 10;
    }

    public static int sumOfOddPlace(long number) {
        int sumOfOdd = 0;
        while (number != 0) {
            sumOfOdd = (int) (sumOfOdd + number % 10);
            number /= 100;
        }
        return sumOfOdd;
    }

    public static int getSize(long number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static boolean isRightPrefix(long number) {
        int count = getSize(number);

        number = (int) (number / Math.pow(10, count - 2));
        return (number == 37 || (number >= 40 && number < 70));
    }
}
