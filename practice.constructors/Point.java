
class Point {

    double x;
    double y;

    Point(int a, int b) {
        x = a;
        y = b;

    }

    Point(double a, double b) {
        x = a;
        y = b;
    }

    public static void main(String[] args) {
        Point p = new Point(10, 20);
        Point p1 = new Point(10.0, 20.0);
        System.out.println(p.x + " " + p.y);
        System.out.println(p1.x + " " + p1.y);

    }
}
