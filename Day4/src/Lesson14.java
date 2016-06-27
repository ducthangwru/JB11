import java.util.Scanner;

public class Lesson14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a;
        int length, indexDelete = 0, indexAdd = 0, element, indexChange = 0, changeElement;

        do {
            System.out.println("Nhập số phần tử: ");
            length = input.nextInt();
        } while (length <= 0);

        a = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " ");
            a[i] = input.nextInt();
        }

        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < length; i++) {
            System.out.print(a[i] + "  ");
        }

        //Xóa phần tử
        do {
            System.out.println("\nNhập vị trí cần xóa: ");
            indexDelete = input.nextInt();
        } while (indexDelete < 0 || indexDelete >= length);

        length--;
        for (int i = indexDelete; i < length; i++) {
            a[i] = a[i + 1];
        }

        System.out.print("Mảng vừa xóa là: ");
        for (int i = 0; i < length; i++) {
            System.out.print(a[i] + "  ");
        }

        //Thêm phần tử
        do {
            System.out.println("\nNhập phần tử cần chèn: ");
            element = input.nextInt();
            System.out.println("Nhập vị trí chèn: ");
            indexAdd = input.nextInt();
        } while (indexAdd < 0 || indexAdd >= length);

        length++;
        for(int i = length - 1; i >  indexAdd; i--) {
            a[i] = a[i - 1];
        }
        a[indexAdd] = element;

        System.out.println("Mảng vừa thêm phần tử là: ");
        for(int i = 0; i < length; i++) {
            System.out.print(a[i] + "  ");
        }

        //Thay đổi giá trị phần tử
        System.out.println("\nNhập giá trị cần thay đổi: ");
        changeElement = input.nextInt();
        System.out.println("Nhập vị trí cần thay đổi: ");
        indexChange = input.nextInt();

        a[indexChange] = changeElement;

        System.out.println("Mảng vừa thay đổi là: ");
        for(int i = 0; i < length; i++) {
            System.out.print(a[i] + "  ");
        }
    }
}
