import java.util.Scanner;
public class Lesson14 {
    public static void main(String[] args) {
        int diem;
        Scanner input = new Scanner(System.in);
        System.out.println(" 0 -> < 5: Trung Bình  \n 5 -> < 7: Khá \n 7 -> 9: Giỏi \n 10: Xuất Sắc");

        System.out.println("Mời nhập điểm: ");
        diem = input.nextInt();

        if(diem < 5 && diem >= 0)
            System.out.println("Trung Bình");
        else if(diem >= 5 && diem < 7)
            System.out.println("Khá");
        else if(diem >= 7 && diem <= 9)
            System.out.println("Giỏi");
        else if(diem == 10)
            System.out.println("Xuất Sắc");
    }
}
