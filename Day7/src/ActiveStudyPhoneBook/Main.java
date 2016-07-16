package ActiveStudyPhoneBook;

import java.util.Scanner;

public class Main {
    private static PhoneBook phoneBook = new PhoneBook();
    static Scanner input = new Scanner(System.in);
    static String Name, PhoneNumber;

    public static void main(String[] args) {
        int choose;

        do {
            System.out.println("------DANH BẠ ĐIỆN THOẠI-------");
            System.out.println("1. Thêm một liên hệ.");
            System.out.println("2. Sửa tên liên hệ.");
            System.out.println("3. Xóa liên hệ.");
            System.out.println("4. Tìm kiếm liên hệ bằng tên.");
            System.out.println("5. Hiển thị tất cả liên hệ.");
            System.out.println("0. Thoát.");
            System.out.println("Mời lựa chọn chức năng: ");

            choose = input.nextInt();

            switch (choose) {
                case 0:
                    break;
                case 1:
                    AddPhoneEntry();
                    break;
                case 2:
                    EditContactName();
                    break;
                case 3:
                    DeletePhoneEntry();
                    break;
                case 4:
                    findPhoneEntryByName();
                    break;
                case 5:
                    DisplayEntry();
                    break;
                default:
                    choose = 0;
                    break;
            }

            if(choose == 0)
                break;

        } while(true);
    }

    public static void AddPhoneEntry() {
        System.out.println("Nhập thông tin liên hệ cần thêm: ");
        input.nextLine();

        System.out.println("Nhập tên liên hệ: ");
        Name = input.nextLine();
        input.nextLine();

        System.out.println("Nhập số điện thoại: ");
        PhoneNumber = input.next();

        PhoneEntry newPhoneEntry = new PhoneEntry(Name, PhoneNumber);

        if(phoneBook.AddEntry(newPhoneEntry)) {
            System.out.println("Thêm thành công!");
        }
        else
            System.out.println("Bộ nhớ đầy! Thêm không thành công!");
    }

    public static void findPhoneEntryByName() {
        input.nextLine();
        System.out.println("Nhập tên cần tìm: ");
        String nameContact = input.nextLine();

        if(phoneBook.findEntryByName(nameContact) == null)
            System.out.println("Liên hệ không tồn tại!");
        else {
            System.out.println("-------TÌM THẤY LIÊN HỆ--------");
            System.out.println(phoneBook.findEntryByName(nameContact));
        }
    }


    public static void EditContactName() {
        input.nextLine();
        System.out.println("Nhập tên cần sửa: ");
        String oldName = input.nextLine();

        System.out.println("Nhập tên mới: ");
        String newName = input.nextLine();
        input.nextLine();

        System.out.println("Nhập số điện thoại mới: ");
        String newPhoneNumber = input.next();

        if(phoneBook.modifyEntry(oldName, newName, newPhoneNumber))
            System.out.println("Liên hệ đã sửa!");
        else {
            System.out.println("Liên hệ không tồn tại!");
        }
    }

    public static void DeletePhoneEntry() {
        System.out.println("Nhập tên liên hệ cần xóa: ");
        String contactName = input.nextLine();
        input.nextLine();

        if(!phoneBook.deleteEntry(contactName)) {
            System.out.println("Liên hệ không tồn tại!");
        }
        else {
            System.out.println("Xóa thành công!");
        }
    }

    public static void DisplayEntry () {
        System.out.println("-----DANH SÁCH LIÊN HỆ-------");
        System.out.println("-----------------------------");
        System.out.println(phoneBook.toString());
    }
}
