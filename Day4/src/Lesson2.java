public class Lesson2 {
    public static void main(String[] args) {
        int x = 10, y = 0;

        //Vòng lặp for
        System.out.println("Vòng lặp For");
        for (int i = 0; i <= x; i++) {
            System.out.println(i);
        }

        //vòng lặp while
        System.out.println("Vòng lặp While");
        while (y < 0) {
            System.out.println(y);
            y++;
        }

        //vòng lặp do - while
        System.out.println("Vòng lặp do - while");
        do {
            System.out.println(y);
            y++;
        } while (y < 0);
    }
}
