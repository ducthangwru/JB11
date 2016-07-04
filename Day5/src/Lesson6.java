import java.util.Scanner;

public class Lesson6 {
    public static double getResult(String str) {
        int pos1 = -1, pos2 = -1, pos3 = -1, pos4 = -1;
        pos1 = str.indexOf("+");
        pos2 = str.indexOf("-");
        pos3 = str.indexOf("x");
        pos4 = str.indexOf(":");
        if (pos1 != -1) {
            String s1 = "";
            String s2 = "";
            for (int i = 0; i < pos1; i++) {
                s1 = s1 + str.charAt(i);
            }
            for (int i = pos1; i < str.length(); i++) {
                s2 = s2 + str.charAt(i);
            }
            return Double.valueOf(s1) + Double.valueOf(s2);
        }
        if (pos2 != -1) {
            String s1 = "";
            String s2 = "";
            for (int i = 0; i < pos2; i++) {
                s1 = s1 + str.charAt(i);
            }
            for (int i = pos2 + 1; i < str.length(); i++) {
                s2 = s2 + str.charAt(i);
            }
            return Double.valueOf(s1) - Double.valueOf(s2);
        }
        if (pos3 != -1) {
            String s1 = "";
            String s2 = "";
            for (int i = 0; i < pos3; i++) {
                s1 = s1 + str.charAt(i);
            }
            for (int i = pos3 + 1; i < str.length(); i++) {
                s2 = s2 + str.charAt(i);
            }
            return Double.valueOf(s1) * Double.valueOf(s2);
        }
        if (pos4 != -1) {
            String s1 = "";
            String s2 = "";
            for (int i = 0; i < pos4; i++) {
                s1 = s1 + str.charAt(i);
            }
            for (int i = pos4 + 1; i < str.length(); i++) {
                s2 = s2 + str.charAt(i);
            }
            return Double.valueOf(s1) / Double.valueOf(s2);
        } else
            return 0;

    }

    public static boolean isTrue(String str) {
        int pos1 = -1, pos2 = -1, pos3 = -1, pos4 = -1;
        pos1 = str.indexOf("+");
        pos2 = str.indexOf("-");
        pos3 = str.indexOf("x");
        pos4 = str.indexOf(":");
       return (!(pos1 == -1 && pos2 == -1 && pos3 == -1 && pos4 == -1));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr;
        System.out.println("Nhập phép toán:");
        String str = sc.nextLine();
        arr = str.toCharArray();
        str = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ')
                str = str + arr[i];
        }
        if (!isTrue(str))
            System.out.println("Bạn nhập sai toán tử");
        else {
            System.out.println("Kết quả: " + getResult(str));
        }

    }
}