package StudentManagement;

import java.util.Scanner;

public class Main {

    public static StudentManager studentManager = new StudentManager();

    public static void main(String[] args) {
        int studentCode;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("-------------MENU QUẢN LÝ SINH VIÊN-------------");
            System.out.println("1. Nhập danh sách sinh viên mới.");
            System.out.println("2. Xem danh sách sinh viên.");
            System.out.println("3. Sửa thông tin sinh viên bằng mã sinh viên.");
            System.out.println("4. Xóa sinh viên bằng mã sinh viên.");
            System.out.println("5. Thêm sinh viên.");
            System.out.println("0. Thoát.");
            System.out.println("------------------------------------------------");
            System.out.print("Nhập lựa chọn: ");
            int choose = input.nextInt();

            switch (choose) {
                case 1:
                    int length;
                    do {
                        System.out.println("\nNhập số lượng sinh viên: ");
                        length = input.nextInt();
                    } while (length <= 0);
                    studentManager.setLength(length);

                    studentManager.ImportStudent();
                    break;

                case 2:
                    System.out.println("\nDANH SÁCH SINH VIÊN");
                    studentManager.SeeTheListStudent();
                    break;

                case 3:
                    System.out.println("\nNhập Mã Sinh Viên cần sửa thông tin: ");
                    studentCode = input.nextInt();
                    studentManager.EditStudent(studentCode);
                    break;

                case 4:
                    System.out.println("\nNhập mã Sinh Viên cần xóa: ");
                    studentCode = input.nextInt();
                    if(studentManager.DeleteStudent(studentCode)) {
                        System.out.println("Xóa thành công!\n\n");
                    }

                    else {
                        System.out.println("Xóa không thành công!\n\n");
                    }
                    break;

                case 5:
                    studentManager.AddStudent();
                    System.out.println("Chèn thành công!\n\n");
                    break;
                default:
                    System.out.println("Nhập sai! Nhấn phím bất kì để thoát chương trình!");
                    choose = 0;
                    break;
            }

            if (choose == 0)
                break;
        } while (true);
    }
}