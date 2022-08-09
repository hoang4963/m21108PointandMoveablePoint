public class test {
    public static void main(String[] args) {
        Point point = new Point(1,1);
        MoveablePoint moveablePoint = new MoveablePoint(6,2,3,4);
        System.out.println(point);
        moveablePoint.move();
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
