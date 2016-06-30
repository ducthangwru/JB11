import java.util.Scanner;

public class Lesson20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr;
        int element;

        System.out.println("Nhập số phần tử: ");
        element = input.nextInt();
        System.out.println("Nhập các phần tử trong chuỗi: ");
        arr = new String[element];

        for(int i = 0; i < arr.length; i++) {
            System.out.println("Nhập chuỗi " + (i+1) + ": ");
            arr[i] = input.next();
        }

        reverseArray(arr);

    }

    public static int reverseArray(String[] arr) {
        String[] arr2 = new String[arr.length];
        for(int i = 0; i < arr.length; i++) {
            arr2[i] = arr[arr.length - 1 - i];
        }

        System.out.println("Chuỗi đảo ngược: ");
        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + "  ");
        }
        return 0;
    }
}
