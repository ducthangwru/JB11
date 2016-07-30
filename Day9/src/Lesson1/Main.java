package Lesson1;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for(int i = 0; i < 1000; i++) {
            System.out.println(i+1);
        }
        stopWatch.stop();
        System.out.println("Thời gian: ");
        System.out.println(stopWatch.getEndTime() + "ms");
    }
}
