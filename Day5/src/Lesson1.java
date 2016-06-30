import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year, month;

        System.out.println("Nhập vào tháng: ");
        month = input.nextInt();
        System.out.println("Nhập vào năm: ");
        year = input.nextInt();

        printMonthTitle(year, month);
        System.out.println();
        printMonthBody(year, month);
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0));
    }

    public static int getNumberOfDayInMonth(int year, int month) {
        int day;
        if (month == 2) {
            if (isLeapYear(year))
                day = 29;
            else
                day = 28;
        }
        else {
            if(month == 4 || month == 6 || month == 9 || month == 11)
                day = 30;
            else
                day = 31;
        }

        return day;
    }

    public static int getStartDay(int year, int month) {
        int h, k, j;

        if (month == 1 || month == 2) {
            year--;
            month += 12;
        }

        j = year / 100;
        k = year % 100;

        h = (1 + 26 * (month + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;

        return h;
    }

    public static void printMonthBody(int year, int month) {
            int count = 0, dates =  1;
        switch (getStartDay(year, month)) {
            case 0:
                count = 0;
                break;
            case 1:
                count = 5;
                break;
            case 2:
                count = 10;
                break;
            case 3:
                count = 15;
                break;
            case 4:
                count = 20;
                break;
            case 5:
                count = 25;
                break;
            case 6:
                count = 30;
                break;
        }
        
        int day = getNumberOfDayInMonth(year, month);

        for(int k = 0; k < count; k++) {
            System.out.print(" ");
        }
        for(int i = 0; i < 5; i++) {
            for(int j = count; j < 35; j += 5) {
                System.out.printf("%4d ", dates);
                dates++;
                if(dates > day) break;
            }
            count = 0;
            System.out.println();
        }
        
    }
    public static void printMonthTitle(int year, int month) {
        String NameMonth = null;
        switch (month) {
            case 1:
                NameMonth = "January";
                break;
            case 2:
                NameMonth = "February";
                break;
            case 3:
                NameMonth = "March";
                break;
            case 4:
                NameMonth = "April";
                break;
            case 5:
                NameMonth = "May";
                break;
            case 6:
                NameMonth = "June";
                break;
            case 7:
                NameMonth = "July";
                break;
            case 8:
                NameMonth = "August";
                break;
            case 9:
                NameMonth = "September";
                break;
            case 10:
                NameMonth = "October";
                break;
            case 11:
                NameMonth = "November";
                break;
            case 12:
                NameMonth = "December";
                break;
        }

        System.out.printf("%16s %d \n", NameMonth, year);

        for(int i = 0; i < 35; i++) {
            System.out.print("-");
        }

        System.out.printf("\n%4s %4s %4s %4s %4s %4s %4s", "Sat", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri");
    }
}
