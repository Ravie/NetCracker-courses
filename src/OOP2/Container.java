package OOP2;

public class Container {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Container (double x, double y, double width, double height) {
        x1 = x;
        y1 = y;
        x2 = x + width;
        y2 = y + height;
    }

    public double getX() {
        return x1;
    }

    public double getY() {
        return y1;
    }

    public double getWidth() {
        return x2 - x1;
    }

    public double getHeight() {
        return y2 - y1;
    }

    public boolean collides(Ball ball) {
        boolean rightOutlet = (ball.getX() - ball.getRadius() > this.getX() + this.getWidth());
        boolean bottomOutlet = (ball.getY() - ball.getRadius() > this.getY() + this.getHeight());
        boolean leftOutlet = (ball.getX() + ball.getRadius() < this.getX());
        boolean topOutlet = (ball.getY() + ball.getRadius() < this.getY());
        if (rightOutlet || leftOutlet || topOutlet || bottomOutlet)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Container[(" + x1 + "," + y1 +
                "), (" + x2 + "," + y2 + ")]";
    }
}
