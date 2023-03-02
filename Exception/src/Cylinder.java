import static java.lang.Math.PI;

public class Cylinder implements  Calculate {
    private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        return  (PI*radius*radius*height);
    }

    @Override
    public double calculateArea() {
        return 2*PI * radius*( height + radius);
    }


}
