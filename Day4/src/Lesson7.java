import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1, s2, reverseS2;
        System.out.println("Nhập chuỗi cần kiểm tra: ");
        s1 = input.next();

        s2 = s1.substring(0, s1.length() / 2);
        reverseS2 = new StringBuffer(s2).reverse().toString();

        if (s1.endsWith(reverseS2)) {
            System.out.println("Chuỗi đối xứng!");
        } else {
            System.out.println("Chuỗi không đối xứng!");
        }

    }
}

