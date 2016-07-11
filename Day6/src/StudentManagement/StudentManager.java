package StudentManagement;

import java.util.Scanner;

public class StudentManager {
    public int length = 0;
    Student[] students = new Student[100];
    String name;
    String gender;
    String address;
    int studentcode;

    Scanner input = new Scanner(System.in);

    public StudentManager() {
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void ImportStudent() {
        System.out.println("Nhập thông tin sinh viên: ");
        for (int i = 0; i < length; i++) {
            System.out.println("Nhập sinh viên thứ " + (i + 1));
            students[i] = new Student();
            students[i].InputStudent();
        }
    }

    public void SeeTheListStudent() {
        for (int i = 0; i < length; i++) {
            students[i].DisplayStudent();
        }
    }

    public void EditStudent(int StudentsCode) {
        boolean check = false;

        for (int i = 0; i < length; i++) {
            if (StudentsCode == students[i].getStudentCode()) {
                System.out.println("Nhập mã sinh viên mới: ");
                studentcode = input.nextInt();
                students[i].setStudentCode(studentcode);
                input.nextLine();

                System.out.println("Nhập tên mới: ");
                name = input.nextLine();
                students[i].setName(name);

                System.out.println("Nhập giới tính mới: ");
                gender = input.next();
                students[i].setGender(gender);
                input.nextLine();

                System.out.println("Nhập địa chỉ mới: ");
                address = input.nextLine();
                students[i].setAddress(address);

                check = true;
            }
        }

        if (!check) {
            System.out.println("Không có sinh viên nào có mã sinh viên là: " + StudentsCode);
            input.nextLine();
        }
    }

    public boolean DeleteStudent(int StudentCode) {
        boolean check = false;
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (students[i].getStudentCode() == StudentCode) {
                index = i;
                check = true;
            }
        }
        if (check) {
            for (int i = index; i < length - 1; i++) {
                students[i] = students[i + 1];
            }
            length--;
        }
        return check;
    }

    public void AddStudent() {
        length++;
        students[length - 1] = new Student();
        System.out.println("Nhập thông tin sinh viên cần thêm: ");
        System.out.println("Nhập mã sinh viên mới: ");
        studentcode = input.nextInt();
        students[length - 1].setStudentCode(studentcode);
        input.nextLine();

        System.out.println("Nhập Họ Tên: ");
        name = input.nextLine();
        students[length - 1].setName(name);

        System.out.println("Nhập giới tính: ");
        gender = input.next();
        students[length - 1].setGender(gender);
        input.nextLine();

        System.out.println("Nhập địa chỉ: ");
        address = input.nextLine();
        students[length - 1].setAddress(address);
    }
}
