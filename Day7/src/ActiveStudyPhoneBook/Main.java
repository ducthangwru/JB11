package ActiveStudyPhoneBook;

import java.util.Scanner;

public class Main {
    private static PhoneBook phoneBook = new PhoneBook();
    static Scanner input = new Scanner(System.in);
    static int Number;
    static String Name, PhoneNumber;

    public static void main(String[] args) {
        int choose;

        do {
            System.out.println("------DANH BẠ ĐIỆN THOẠI-------");
            System.out.println("1. Thêm một liên hệ.");
            System.out.println("2. Sửa liên hệ.");
            System.out.println("3. Xóa liên hệ.");
            System.out.println("4. Tìm kiếm liên hệ.");
            System.out.println("5. Hiển thị tất cả liên hệ.");
            System.out.println("0. Thoát.");
            System.out.println("Mời lựa chọn chức năng: ");

            choose = input.nextInt();

            switch (choose) {
                case 0:
                    break;
                case 1:
                    AddPhoneEntry();
                    PhoneEntry newPhoneEntry = new PhoneEntry(Number, Name, PhoneNumber);
                    phoneBook.AddEntry(newPhoneEntry);

                    if(phoneBook.AddEntry(newPhoneEntry)) {
                        System.out.println("Thêm thành công!");
                    }
                    else
                        System.out.println("Bộ nhớ đầy! Thêm không thành công!");
                    break;
                case 2:
                    EditPhoneEntry();
                    break;
                case 3:
                    DeletePhoneEntry();
                    break;
                case 4:
                    SearchPhoneEntry();
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

        System.out.println("Nhập mã liên hệ: ");
        Number = input.nextInt();
        input.nextLine();

        System.out.println("Nhập tên liên hệ: ");
        Name = input.nextLine();
        input.nextLine();

        System.out.println("Nhập số điện thoại: ");
        PhoneNumber = input.next();
    }

    public static void SearchPhoneEntry() {
        System.out.println("Nhập mã liên hệ cần tìm kiếm: ");
        Number = input.nextInt();
        input.nextLine();
        int indexCase5 = phoneBook.check(Number);

        if(!phoneBook.CheckPhoneEntry(Number))
            System.out.println("Liên hệ không tồn tại!");
        else {
            System.out.println("-------TÌM THẤY LIÊN HỆ--------");
            phoneBook.SearchPhoneEntry(indexCase5);
        }
    }

    public static void EditPhoneEntry() {
        System.out.println("Nhập mã liên hệ cần sửa: ");
        Number = input.nextInt();
        input.nextLine();
        int indexCase3 = phoneBook.check(Number);

        if(!phoneBook.CheckPhoneEntry(Number))
            System.out.println("Liên hệ không tồn tại!");
        else {
            System.out.println("Nhập tên mới: ");
            Name = input.nextLine();
            input.nextLine();

            System.out.println("Nhập số điện thoại mới: ");
            PhoneNumber = input.next();

            phoneBook.EditPhoneEntry(indexCase3, Name, PhoneNumber);
        }
    }

    public static void DeletePhoneEntry() {
        System.out.println("Nhập mã liên hệ cần xóa: ");
        Number = input.nextInt();
        input.nextLine();
        int indexCase4 = phoneBook.check(Number);

        if(!phoneBook.CheckPhoneEntry(Number)) {
            System.out.println("Liên hệ không tồn tại!");
        }
        else {
            phoneBook.DeletePhoneEntry(indexCase4);
            System.out.println("Xóa thành công!");
        }
    }

    public static void DisplayEntry () {
        System.out.println("-----DANH SÁCH LIÊN HỆ-------");
        System.out.println("-----------------------------");
        System.out.println("Mã\t\tHọ Tên\t\tSố điện thoại");
        phoneBook.SeeTheListPhoneEntry();
    }
}
