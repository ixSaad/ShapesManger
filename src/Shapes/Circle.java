package Shapes;
import java.lang.Math;

public class Circle {
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }
    // "I can't use an integer there because Pi is a double."
    public double CircleArea(double radius) {
        return (Math.PI*radius);
    }

    public double CirclCirumferemce(double radius) {
        return (2*Math.PI*radius);
    }
}