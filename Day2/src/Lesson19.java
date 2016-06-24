import java.util.Scanner;
public class Lesson19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Number;
        System.out.println("Mời nhập số (1 - 9): ");
        Number = input.nextInt();
        switch (Number){
            case 1:
                System.out.println("OMột!");
                break;
            case 2:
                System.out.println("Hai!");
                break;
            case 3:
                System.out.println("Ba!");
                break;
            case 4:
                System.out.println("Bốn!");
                break;
            case 5:
                System.out.println("Năm!");
                break;
            case 6:
                System.out.println("Sáu!");
                break;
            case 7:
                System.out.println("Bảy!");
                break;
            case 8:
                System.out.println("Tám!");
                break;
            case 9:
                System.out.println("Chín!");
                break;
            default:
                System.out.println("Bạn đã nhập sai yêu cầu!");
                break;
        }

    }
}
