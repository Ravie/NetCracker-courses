package OOP2;

public class Ball {
    private double x;
    private double y;
    private double radius;
    private double xDelta;
    private double yDelta;

    public Ball(double x, double y, double radius, double speed, double direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        //direction = (direction < -180.0) ? -180.0 : direction;
        //direction = (direction > 180.0) ? 180.0 : direction;
        this.xDelta = speed * Math.cos(direction);
        this.yDelta = -speed * Math.sin(direction);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getxDelta() {
        return xDelta;
    }

    public void setxDelta(double xDelta) {
        this.xDelta = xDelta;
    }

    public double getyDelta() {
        return yDelta;
    }

    public void setyDelta(double yDelta) {
        this.yDelta = yDelta;
    }

    public void move() {
        this.x += xDelta;
        this.y += yDelta;
    }

    public void reflectHorizontal() {
        this.xDelta *= -1;
    }

    public void reflectVertical() {
        this.yDelta *= -1;
    }

    @Override
    public String toString() {
        return "Ball[(" + x + "," + y + "), speed=(" + xDelta + "," + yDelta + ")]";
    }

    public static void main(String[] args) {
        Container con = new Container(0,0,10,10);
        Ball ball = new Ball(1,1,0.5,1,-45);
        while(!con.collides(ball)){
            System.out.println(ball.toString());
            ball.move();
        }
        System.out.println(ball.toString());
    }
}
