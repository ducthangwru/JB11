package Lesson1;

public class StopWatch {
    private long startTime;
    private long endTime;
    private boolean check = false;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
        check = true;
    }

    public long stop() {
        if(check) {
            endTime = System.currentTimeMillis() - getStartTime();
            return endTime;
        }
        return 0;
    }
}
