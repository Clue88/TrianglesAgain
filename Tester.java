public class Tester {
    public static void main(String[] args) {
        int err = 0;
        Point p1 = new Point(1, 2);
        Point p2 = new Point(p1);
        Point p3 = new Point(8, 3);
        Point p4 = new Point(15, -3);
        Triangle t1 = new Triangle(p1, p3, p4);

        err += check("p1.getX()", p1.getX(), 1.0);
        err += check("p2.getY()", p2.getY(), 2.0);
        err += check("p1.distanceTo(p3)", p1.distanceTo(p3), 7.0710678118654755);
        err += check("p1.equals(p2)", p1.equals(p2), true);
        err += check("p1.equals(p3)", p1.equals(p3), false);
        err += check("t1.getPerimeter()", t1.getPerimeter(), 31.156681016476867);
        err += check("t1.getPerimeter()", t1.getArea(), 24.499999999999975);

        if (err == 0) System.out.println("All good!");
        else if (err == 1) System.out.println("Uh oh... 1 error found.");
        else System.out.println("Uh oh... " + err + " errors found.");
    }

    public static int check(String name, Object actual, Object expected) {
        if (actual.equals(expected)) return 0;
        else {
            System.out.println("Failure on " + name + ": Expected \"" +
                                expected + "\", got \"" + actual + "\".");
            return 1;
        }
    }
}
