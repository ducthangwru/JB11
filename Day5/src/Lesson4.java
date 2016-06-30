import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr;
        int length;

        System.out.println("Nhập số phần tử: ");
        length = input.nextInt();

        arr = new int[length];

        System.out.println("Nhập mảng: ");
        for(int i = 0; i < length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        System.out.println("Mảng vừa nhập là: ");
        for(int i = 0; i < length; i++) {
            System.out.println(arr[i] + "  ");
        }

        System.out.println("Mảng đã sắp xếp tăng dần?");
        System.out.println(isSorted(arr));

    }

    public static boolean isSorted(int[] array) {
        int value = array[0];
        for(int i = 0; i < array.length; i++) {
            if(value > array[i]) {
                value = 0;
                break;
            }
            else
                value = array[i];
        }
        return (value == array[array.length - 1]);
    }
}
