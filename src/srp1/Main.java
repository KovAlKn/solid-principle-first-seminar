package srp1;

import srp1.figure.Point;
import srp1.figure.Square;
import srp1.figure.ShapeDrawer;

public class Main {

    static ShapeDrawer squareDrawer = new ShapeDrawer() {
        @Override
        public void draw(Square square) {

        }
    };
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        System.out.printf("Square area: %d \n", square.getArea());
        squareDrawer.draw(square);
    }
}