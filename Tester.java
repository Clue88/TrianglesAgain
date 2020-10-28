public class Tester {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(p1);
        System.out.println(p2.getX());
        System.out.println(p1.getY());
    }
}
