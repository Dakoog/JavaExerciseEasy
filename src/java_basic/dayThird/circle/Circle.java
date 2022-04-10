package java_basic.dayThird.circle;

import java_basic.new_method.RoundsNumbers;

public class Circle {
    private final float radius;
    private final float area;
    private final float circumference;

    public Circle(float radius) {
        this.radius = radius;
        this.area = (float)Math.PI*radius*radius;
        this.circumference = 2*(float)Math.PI*radius;
    }

    @Override
    public String toString() {
        return "  Circle: " +
                "\n * r = " + radius +
                "\n * P = " + RoundsNumbers.hundredths(area) +
                "\n * L = " + RoundsNumbers.hundredths(circumference);
    }
}
