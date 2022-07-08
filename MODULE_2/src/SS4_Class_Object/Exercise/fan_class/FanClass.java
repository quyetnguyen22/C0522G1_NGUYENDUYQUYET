package ss4_class_object.exercise.fan_class;

public class FanClass {
    final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    //    public int getSLOW() {
//        return SLOW;
//    }
//
//    public int getMEDIUM() {
//        return MEDIUM;
//    }
//
//    public int getFAST() {
//        return FAST;
//    }
    public int getSpeed() {
        return speed;
    }

    public boolean getOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public int setSpeed(int newSpeed) {
        return speed = newSpeed;
    }

    public boolean setOn(boolean newStatus) {
        return on = newStatus;
    }

    public double setRadius(double newRadius) {
        return radius = newRadius;
    }

    public String setColor(String newColor) {
        return color = newColor;
    }

    public FanClass() {

    }

    public String getToString() {
        if (getOn()) {
            return ("\nFan is on." + "\nSpeed: " + getSpeed() + "\nColor: " + getColor() + "\nRadius: " + getRadius());
        }
        return ("\nFan is off" + "\nColor: " + getColor() + "\nRadius: " + getRadius());
    }
}
