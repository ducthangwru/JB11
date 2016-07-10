package StudentManagement;

import java.util.Scanner;

public class StudentManager {
    private int length = 0;
    Student[] students = new Student[100];

    Scanner input = new Scanner(System.in);

    public void setLength(int length) {
        this.length = length;
    }

    public StudentManager() {
    }

    public void ImportStudent() {
        System.out.println("Nhập thông tin sinh viên: ");
        for (int i = 0; i < length; i++) {
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
                int studentcode = input.nextInt();
                students[i].setStudentCode(studentcode);

                System.out.println("Nhập tên mới: ");
                String name = input.nextLine();
                students[i].setName(name);

                System.out.println("Nhập giới tính cần sửa: ");
                String gender = input.next();
                students[i].setGender(gender);

                System.out.println("Nhập địa chỉ mới: ");
                String address = input.nextLine();
                students[i].setAddress(address);

                check = true;
            }
        }

        if (!check) {
            System.out.println("Không có sinh viên nào có mã sinh viên là: " + StudentsCode);
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
        }
        return check;
    }
}
