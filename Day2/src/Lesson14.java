import java.util.Scanner;
public class Lesson14 {
    public static void main(String[] args) {
        int Score;
        Scanner input = new Scanner(System.in);
        System.out.println(" 0 -> < 5: Trung Bình  \n 5 -> < 7: Khá \n 7 -> 9: Giỏi \n 10: Xuất Sắc");

        System.out.println("Mời nhập điểm: ");
        Score = input.nextInt();

        if(Score < 5 && Score >= 0) {
            System.out.println("Trung Bình");
        }
        else if(Score < 7) {
            System.out.println("Khá");
        }
        else if(Score <= 9) {
            System.out.println("Giỏi");
        }
        else if(Score == 10) {
            System.out.println("Xuất Sắc");
        }
    }
}
