package task07;


import java.io.Serializable;

public class Window extends SuperWindow implements Serializable {
    private Calc calc;

    public Window(int width, int length, int height) {
        super(width, length, height);
    }

    public Window() {}

    public Calc getCalc() {
        return calc;
    }

    public void setCalc(Calc calc) {
        this.calc = calc;
    }

    @Override
    public String toString() {
        return "Window { " +
                "calc = " + calc +
                '}';
    }
}
