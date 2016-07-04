import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a, count;
        a = new int[100];
        count = new int[100];

        int i = 0, number;
        System.out.println("Nhập vào số từ 0 -> 100 (Nhập 0 để dừng lại): ");
        do {
            number = input.nextInt();
            if (number == 0)
                break;
            a[i] = number;
            i++;
        } while (a[i - 1] != 0);

        for (int j = 0; j < i; j++) {
            if (a[j] != 0)
                System.out.println("Số " + a[j] + " xuất hiện " + getNumber(a, a[j]) + " lần!");
        }
    }

    public static int getNumber(int[] a, int number) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (number == a[i]) {
                count++;
                a[i] = 0;
            }
        }
        return count;
    }

}
