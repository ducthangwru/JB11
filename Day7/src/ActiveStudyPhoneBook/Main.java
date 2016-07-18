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
            System.out.println("5. TÌm kiếm liên hệ bằng tên gợi ý.");
            System.out.println("6. Hiển thị tất cả liên hệ.");
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
                    EditContact();
                    break;
                case 3:
                    DeletePhoneEntry();
                    break;
                case 4:
                    findPhoneEntryByName();
                    break;
                case 5:
                    findPhoneEntryByCharaters();
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

    public static void AddPhoneEntry() {
        PhoneEntry newPhoneEntry = new PhoneEntry();
        System.out.println("Nhập thông tin liên hệ cần thêm: ");
        input.nextLine();

        System.out.println("Nhập tên liên hệ: ");
        Name = input.nextLine();
        newPhoneEntry.setName(Name);

        System.out.println("Nhập số các số điện thoại: ");
        int number = input.nextInt();

        for(int i = 0; i < number; i++) {
            System.out.printf("Nhập số điện thoại %d: ", i + 1);
            PhoneNumber = input.next();
            newPhoneEntry.setPhoneNumber(PhoneNumber);
        }

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

    public static void findPhoneEntryByCharaters() {
        input.nextLine();
        System.out.println("Nhập ký tự (đoạn ký tự trong liên hệ ) cần tìm: ");
        String Charaters = input.nextLine();

        if(phoneBook.findEntryByCharaters(Charaters) == null) {
            System.out.println("Liên hệ không tồn tại!");
        }
        else {
            System.out.println("-------TÌM THẤY LIÊN HỆ--------");
            System.out.println(phoneBook.findEntryByCharaters(Charaters));
        }

    }
    public static void EditContact() {
        input.nextLine();
        System.out.println("Nhập tên cần sửa: ");
        String oldName = input.nextLine();

        System.out.println("Nhập tên mới: ");
        String newName = input.nextLine();

        System.out.println("Bạn có muốn sửa số điện thoại không?");
        System.out.println("1. Có");
        System.out.println("2. Không");

        String newPhoneNumber;
        int Number;

        int choose = input.nextInt();
        if(choose == 1) {
            phoneBook.deleteArrayPhoneNumber(oldName);
            System.out.println("Nhập số các số điện thoại mới: ");
            Number = input.nextInt();
            for(int i = 0; i < Number; i++) {
                System.out.printf("Nhập số điện thoại %d: ", (i+1));
                newPhoneNumber = input.next();
                phoneBook.modifyNumber(oldName, newPhoneNumber);
            }
        }

        if (phoneBook.modifyEntry(oldName, newName))
            System.out.println("Liên hệ đã sửa!");
        else {
            System.out.println("Liên hệ không tồn tại!");
        }
    }

    public static void DeletePhoneEntry() {
        System.out.println("Nhập tên liên hệ cần xóa: ");
        input.nextLine();
        String entryName = input.nextLine();
        if(!phoneBook.deleteEntry(entryName)) {
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
