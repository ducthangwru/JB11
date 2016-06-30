import java.util.Scanner;

public class Lesson20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr;
        int length;
        System.out.println("Nhập số phần tử: ");
        length = input.nextInt();
        System.out.println("Nhập các phần tử trong chuỗi: ");
        arr = new String[length];

        for(int i = 0; i < arr.length; i++) {
            System.out.println("Nhập chuỗi " + (i+1) + ": ");
            arr[i] = input.next();
        }

        arr = reverseArray(arr);
        System.out.println("Chuỗi đảo là: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

    }

    public static String[] reverseArray(String[] arr) {
        String[] array;
        array = new String [arr.length];

        for(int i = 0; i < array.length; i++) {
            array[i] = arr[arr.length - 1 - i];
        }
        return array;
    }
}
