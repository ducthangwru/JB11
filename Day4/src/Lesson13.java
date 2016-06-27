import java.util.Scanner;

public class Lesson13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a;
        int length, max, min, indexMax, indexMin;

        do {
            System.out.println("Nhập số phần tử trong mảng: ");
            length = input.nextInt();
        } while (length <= 0);

        a = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " ");
            a[i] = input.nextInt();
        }

        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < length; i++) {
            System.out.print(a[i] + "  ");
        }

        max = a[0];
        indexMax = 0;
        min = a[0];
        indexMin = 0;

        for (int i = 0; i < length; i++) {
            if (a[i] > max) {
                max = a[i];
                indexMax = i;
            } else if (a[i] < min) {
                min = a[i];
                indexMin = i;
            }
        }

        System.out.println("\nGiá trị lớn nhất của mảng là: " + max + "  Chỉ số: " + indexMax);
        System.out.println("Giá trị nhỏ nhất của mảng là: " + min + "  Chỉ số: " + indexMin);
    }
}
