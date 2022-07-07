package SS4_Class_Object.Exercise.StopWatchClass;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StopWatchClass newWatch = new StopWatchClass();
        System.out.println(newWatch.getStart());

        double[] ints = new double[100000];
        for (int i = 0; i < 100000; i++) {
            ints[i] = Math.random() * 1000;
        }
        Arrays.sort(ints);
        newWatch.getEndTime();
        System.out.println(newWatch.getElapsedTime());
    }
}


/*
public class Main {
    public static void main(String[] args) {
        StopWatchClass stopWatch = new StopWatchClass();
        stopWatch.start();
        for (int i = 0; i < 10000000; i++) {
            System.out.print("");
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}

 */