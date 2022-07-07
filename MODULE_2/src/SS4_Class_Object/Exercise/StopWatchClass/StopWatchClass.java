package SS4_Class_Object.Exercise.StopWatchClass;

import java.util.Date;

public class StopWatchClass {
    long startTime;
    long endTime;

    StopWatchClass() {
    }

    long getStart() {
        return startTime = System.currentTimeMillis();
    }

    long getEndTime() {
        return endTime = System.currentTimeMillis();
    }

    long getElapsedTime() {
        return endTime - startTime;
    }
}


/*
public class StopWatchClass {
    private Date startTime, endTime;

    public StopWatchClass() {
        this.startTime = new Date();
    }

    public void start() {
        this.startTime = new Date();
    }

    public void stop() {
        this.endTime = new Date();
    }

    public long getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }
}

 */