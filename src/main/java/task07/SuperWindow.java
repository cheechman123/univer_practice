package task07;


import java.io.Serializable;


public class SuperWindow implements Serializable {

    private Calc calc;
    private int width;
    private int length;
    private int height;

    public SuperWindow(int width, int length, int height) {

        this.width = width;
        this.length = length;
        this.height = height;
    }

    public SuperWindow() {
    }

    public int getHeight() {

        return height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {

        return width;
    }

    public Calc getCalc() {

        return calc;
    }

    public void setCalc(Calc calc) {

        this.calc = calc;
    }

}
