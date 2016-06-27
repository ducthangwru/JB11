import java.util.Scanner;
import java.io.*;

public class Lesson4 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String Name;
        float Height, Weight;
        char choose;

        do {
            System.out.println("Mời bạn nhập tên: ");
            Name = input.next();
            System.out.println("Mời bạn nhập chiều cao (mét): ");
            Height = input.nextFloat();
            System.out.println("Mời bạn nhập cân nặng (Kg): ");
            Weight = input.nextFloat();

            float BMI = (float) (Weight / Math.pow(Height, 2));

            if (BMI < 18.5)
                System.out.println(Name + " Chỉ số BMI = " + BMI + " - Quá gầy");
            else if (BMI < 25)
                System.out.println(Name + " Chỉ số BMI = " + BMI + " - Thân hình chuẩn");
            else if (BMI <= 30)
                System.out.println(Name + " Chỉ số BMI = " + BMI + " - Thừa Cân");
            else
                System.out.println(Name + " Chỉ số BMI = " + BMI + " - Siêu thừa cân");

            System.out.println("Bạn có muốn nhập tiếp không? \nY:Có \nN:Không");
            choose = (char) System.in.read();
        } while (choose == 'Y' || choose == 'y');
    }
}
