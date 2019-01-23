package task07;


import java.io.Serializable;
import java.util.Formatter;

public class Calc implements Serializable, Basic {

    private int perimeter;
    private int square;
    private int volume;

    @Override
    public String toString() {
        Formatter fmt = new Formatter();
        fmt.format("%-10.9s|%-15.10s|%-15.10s|", perimeter, square, volume);
        return fmt.toString();
    }

    public int Perimeter(int a, int b) {
        perimeter = 2 * (a + b);
        return perimeter;
    }

    public int Volume(int a, int b, int c) {
        volume = a * b * c;
        return volume;
    }

    public int Square(int a, int b) {
        square = a * b ;
        return square;
    }

    public int Square(int a) {
        square = (int)Math.round(Math.PI * Math.pow(a, 2));
        return square;
    }

    public int getSquare() {
        return square;
    }


}
