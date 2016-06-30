import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int y, h, m, q, k, j;

        System.out.println("Nhập vào năm: ");
        y = input.nextInt();
        System.out.println("Nhập vào tháng: ");
        m = input.nextInt();
        System.out.println("Nhập vào ngày: ");
        q = input.nextInt();

        if (m == 1 || m == 2) {
            y--;
            m += 12;
        }

        j = y / 100;
        k = y % 100;

        h = (q + (26 * (m + 1) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;

        switch (h) {
            case 0:
                System.out.println("Thứ 7");
                break;
            case 1:
                System.out.println("Chủ nhật");
                break;
            case 2:
                System.out.println("Thứ 2");
                break;
            case 3:
                System.out.println("Thứ 3");
                break;
            case 4:
                System.out.println("Thứ 4");
                break;
            case 5:
                System.out.println("Thứ 5");
                break;
            case 6:
                System.out.println("Thứ 6");
                break;

        }
    }
}
