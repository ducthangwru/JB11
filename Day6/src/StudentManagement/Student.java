package StudentManagement;

import java.util.Scanner;

public class Student {
    private String Name;
    private String Gender;
    private String Address;
    private int StudentCode;

    Scanner input = new Scanner(System.in);

    public Student() {
    }

    public Student(int StudentCode, String Name, String Gender, String Address) {
        this.StudentCode = StudentCode;
        this.Name = Name;
        this.Address = Address;
        this.Gender = Gender;
    }

    public int getStudentCode() {
        return StudentCode;
    }

    public void setStudentCode(int studentCode) {
        this.StudentCode = studentCode;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setGender(String gender) {
        this.Gender = gender;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public void InputStudent() {
        System.out.println("Nhập mã sinh viên: ");
        StudentCode = input.nextInt();
        setStudentCode(StudentCode);
        input.nextLine();

        System.out.println("Nhập Họ tên: ");
        Name = input.nextLine();
        setName(Name);

        System.out.println("Nhập giới tính: ");
        Gender = input.next();
        setGender(Gender);
        input.nextLine();

        System.out.println("Nhập địa chỉ: ");
        Address = input.nextLine();
        setAddress(Address);
        input.nextLine();
    }

    public void DisplayStudent() {
        System.out.println("------------------------------------");
        System.out.println("Mã Sinh Viên: " + StudentCode);
        System.out.println("Họ Tên: " + Name);
        System.out.println("Giới Tính: " + Gender);
        System.out.println("Địa chỉ: " + Address);
        System.out.println();
    }
}
