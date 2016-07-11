package ActiveStudyPhoneBook;

import java.util.Scanner;

public class Menu {
    private static PhoneBook phoneBook = new PhoneBook();
    private static Scanner input = new Scanner(System.in);
    private static int numberOfEntries;

    public void Menu() {

        int choose;

        do {
            System.out.println("------DANH BẠ ĐIỆN THOẠI-------");
            System.out.println("1. Nhập liên hệ.");
            System.out.println("2. Thêm một liên hệ.");
            System.out.println("3. Sửa liên hệ.");
            System.out.println("4. Xóa liên hệ.");
            System.out.println("5. Tìm kiếm liên hệ.");
            System.out.println("6. Hiển thị tất cả liên hệ.");
            System.out.println("0. Thoát.");
            System.out.println("Mời lựa chọn chức năng: ");

            choose = input.nextInt();

            switch (choose) {
                case 0:
                    break;
                case 1:
                    ImportPhoneEntry();
                    break;
                case 2:
                    AddPhoneEntry();
                    break;
                case 3:
                    EditPhoneEntry();
                    break;
                case 4:
                    DeletePhoneEntry();
                    break;
                case 5:
                    SearchPhoneEntry();
                    break;
                case 6:
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

    public void ImportPhoneEntry() {
        String Name, PhoneNumber;
        int Number;
        System.out.println("Nhập số lượng liên hệ: ");
        numberOfEntries = input.nextInt();
        phoneBook.setNumberOfEntries(numberOfEntries);

        System.out.println("Nhập thông tin liên hệ: ");
        for(int i = 0; i < numberOfEntries; i++) {
            System.out.println("Nhập thông tin liên hệ thứ " + (i + 1));
            input.nextLine();

            System.out.println("Nhập mã liên hệ: ");
            Number = input.nextInt();
            input.nextLine();

            System.out.println("Nhập tên liên hệ: ");
            Name = input.nextLine();

            System.out.println("Nhập số điện thoại: ");
            PhoneNumber = input.next();

            phoneBook.ImportPhoneEntry(i, Number, Name, PhoneNumber);
        }
    }

    public void AddPhoneEntry() {
        String Name, PhoneNumber;
        int Number;

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

        if(phoneBook.AddEntry(Number, Name, PhoneNumber)) {
            System.out.println("Thêm thành công!");
        }
        else
            System.out.println("Bộ nhớ đầy! Thêm không thành công!");

    }

    public void SearchPhoneEntry() {
        int Number;

        System.out.println("Nhập mã liên hệ cần tìm kiếm: ");
        Number = input.nextInt();
        input.nextLine();
        int indexCase5 = phoneBook.check(Number);

        if(!phoneBook.CheckPhoneEntry(Number))
            System.out.println("Liên hệ không tồn tại!");
        else {
            phoneBook.SearchPhoneEntry(indexCase5, Number);
        }
    }

    public void EditPhoneEntry() {
        String Name, PhoneNumber;
        int Number;

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

    public void DeletePhoneEntry() {
        int Number;

        System.out.println("Nhập mã liên hệ cần xóa: ");
        Number = input.nextInt();
        input.nextLine();
        int indexCase4 = phoneBook.check(Number);

        if(!phoneBook.CheckPhoneEntry(Number)) {
            System.out.println("Liên hệ không tồn tại!");
        }
        else {
            phoneBook.DeletePhoneEntry(indexCase4, Number);
            System.out.println("Xóa thành công!");
        }
    }

    public void DisplayEntry () {
        System.out.println("-----DANH SÁCH LIÊN HỆ-------");
        System.out.println("-----------------------------");
        phoneBook.SeeTheListPhoneEntry();
        System.out.println("-----------------------------");
    }
}
