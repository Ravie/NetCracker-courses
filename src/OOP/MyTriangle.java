package OOP;

public class MyTriangle {
    private MyPoint v1 = new MyPoint();
    private MyPoint v2 = new MyPoint();
    private MyPoint v3 = new MyPoint();

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1.setXY(x1,y1);
        v2.setXY(x2,y2);
        v3.setXY(x3,y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }

    public double getPerimeter(){
        return v1.distance(v2)+v2.distance(v3)+v3.distance(v1);
    }

    public String getType(){
        if(v1.distance(v2)==v2.distance(v3) && v2.distance(v3)==v3.distance(v1))
            return "Equilateral";
        else if(v1.distance(v2)==v1.distance(v3) || v2.distance(v1)==v2.distance(v3) || v3.distance(v1)==v3.distance(v2))
            return "Isosceles";
        else
            return "Scalene";
    }

    public static void main(String[] args) {
        MyTriangle triangle = new MyTriangle(0,0,1,1,0,1);
        System.out.println(triangle.toString());
    }
}
