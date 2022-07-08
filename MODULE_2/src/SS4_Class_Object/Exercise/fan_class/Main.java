package ss4_class_object.exercise.fan_class;

public class Main {
    public static void main(String[] args) {
        FanClass fan1 = new FanClass();
        fan1.setOn(true);
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow.");
        System.out.println("Information of fan 1: " + fan1.getToString());
        FanClass fan2 = new FanClass();
        fan2.setOn(false);
        fan2.setSpeed(fan2.MEDIUM);
        fan2.getRadius();
        fan2.getColor();
        System.out.println("Information of fan 2: " + fan2.getToString());
    }

}
