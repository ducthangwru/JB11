package StudentManagement;

import java.util.Scanner;

public class Main {

    public static StudentManager studentManager = new StudentManager();

    public static void main(String[] args) {
        do {
            System.out.println("-------------MENU QUẢN LÝ SINH VIÊN-------------");
            System.out.println("1. Nhập một sinh viên mới.");
            System.out.println("2. Xem danh sách sinh viên.");
            System.out.println("3. Sửa thông tin sinh viên bằng mã sinh viên");
            System.out.println("4. Xóa sinh viên bằng mã sinh viên");
            System.out.println("5. Thêm sinh viên");
            System.out.println("0. thoát.");
            System.out.println("------------------------------------------------");
            System.out.print("Nhập lựa chọn: ");
            Scanner input = new Scanner(System.in);
            int choose = input.nextInt();

            switch (choose) {
                case 1:
                    int length;
                    do {
                        System.out.println("Nhập số lượng sinh viên: ");
                        length = input.nextInt();
                    } while (length <= 0);
                    studentManager.setLength(length);

                    studentManager.ImportStudent();
                    break;

                case 2:
                    System.out.println("DANH SÁCH SINH VIÊN");
                    studentManager.SeeTheListStudent();
                    break;

                case 3:
                    break;
                default:
                    break;
            }

            if (choose == 0)
                break;
        } while (true);
    }
}