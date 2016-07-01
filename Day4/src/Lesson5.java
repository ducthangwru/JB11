import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Sum = 0, Count = 0, Number;

        do {
            System.out.print("Nhập số nguyên: ");
            Number = input.nextInt();
            Sum += Number;
            Count++;
        } while (Number != 0);

        System.out.println("Trung bình cộng các số vừa nhập là: " + ((float) Sum / (Count - 1)));
    }
}
