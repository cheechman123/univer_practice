package task07;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Menu menu = new Menu();

    static List<Window> windowList = new ArrayList<>();

    public static void init() {
        for (int i = 0; i < 5; i++) {
            Window window = new Window((int) (Math.random() * 30), (int) (Math.random() * 30), (int) (Math.random() * 3 + 1));
            Calc calc = new Calc();
            calc.Perimeter(window.getWidth(), window.getLength());
            calc.Square(window.getWidth(), window.getLength());
            calc.Volume(window.getWidth(), window.getLength(), window.getHeight());
            window.setCalc(calc);
            windowList.add(window);
        }
    }

    public static void initCommandMenu() {
        AddNewWindow addNewWindow = new AddNewWindow();
        addNewWindow.setWindowList(windowList);

        MediumWindow mediumWindow = new MediumWindow();
        mediumWindow.setWindowList(windowList);

        SortWindow sortWindow = new SortWindow();
        sortWindow.setWindowList(windowList);

        SearchWindow searchWindow = new SearchWindow();
        searchWindow.setWindowList(windowList);
        searchWindow.setWindow(windowList.get(windowList.size() - 1));

        MinWindow minWindow = new MinWindow();
        minWindow.setWindowList(windowList);

        menu.addCommand(addNewWindow);
        menu.addCommand(mediumWindow);
        menu.addCommand(searchWindow);
        menu.addCommand(minWindow);
        menu.addCommand(sortWindow);
    }

    public static void main(String[] args) {

        Main.init();

        for (Window window : windowList)
            System.out.println(window);
        System.out.println("//////////////////////////");

        Main.initCommandMenu();
        menu.execute();

        showPublisherWork();
    }

    public static void showPublisherWork() {
        Publisher publisher = new Publisher();
        publisher.addListener(new Subcriber());
        publisher.addListener(new Subcriber());

        publisher.createNewMessage("Message!!!!!");

//        Class classPublisher = Publisher.class;
//        Field field = classPublisher.getDeclaredField("str");
//        field.setAccessible(true);
//        System.out.println(field.get(publisher));
    }


}
