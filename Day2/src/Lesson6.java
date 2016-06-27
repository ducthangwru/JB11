public class Lesson6 {
    public static void main(String args[]) {
        //compareTo(String str) so sánh chuỗi phân biệt chữ hoa chữ thường
        String s1 = "abcd";
        String s2 = "abcd";
        String s3 = "abc";
        String s4 = "aBCD";
        System.out.println("1: " + s1.compareTo(s2)); //0
        System.out.println("2: " + s1.compareTo(s3)); //1 (boi vi s1 > s3)
        System.out.println("3: " + s3.compareTo(s1)); //-1 (boi vi s3 < s1)

        //compareToIgnoreCase(String str) không phân biệt chữ hoa chữ thường

        System.out.println("4: " + s4.compareToIgnoreCase(s2)); // 0

        //Equals(String str) so sánh chuỗi
        System.out.println("5: " + s1.equals(s2)); //true vì s1 = s2
        System.out.println("6: " + s1.equals(s3)); //false vì s1 != s3

        //EqualsIgnoreCase(String str) so sánh chuỗi không phân biệt kiểu chữ
        System.out.println("7: " + s1.equalsIgnoreCase(s4)); //true

        //startsWith(String str) Chuỗi có bắt đầu bằng chuỗi con "..." không?
        String a = "Welcome to Java!";
        System.out.println("8: " + a.startsWith("Wel")); //true
        System.out.println("9: " + a.startsWith("to")); //false
        System.out.println("10: " + a.startsWith("come", 3)); //true vì come bắt đầu từ vị trí thứ 3
        System.out.println("11: " + a.startsWith("come", 5)); //false

        //endsWith(String str) Chuỗi có kết thúc bằng chuỗi con "..." không?
        System.out.println("12: " + a.endsWith("Java!")); //true
        System.out.println("13: " + a.endsWith("To")); //false

        //constains(String str) Kiểm tra xem chuỗi đó chứa chuỗi con không?
        System.out.println("14: " + a.contains("come")); //true
        System.out.println("15: " + a.contains("emoc")); //false
    }
}