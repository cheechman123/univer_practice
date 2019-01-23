package task07;

public class Subcriber implements PublisherActionListener {
    static int i = 1;
    @Override
    public void doAction(String message) {
        System.out.println(message + " from " + this.getClass().getName() + i++);
    }
}
