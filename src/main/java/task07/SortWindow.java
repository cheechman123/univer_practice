package task07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortWindow implements Command {

    Window window;
    List<Window> windowList = new ArrayList<>();

    public List<Window> getWindowListList() {
        return windowList;
    }

    public void setWindowList(List<Window> windowList) {
        this.windowList = windowList;
    }

    public void setWindow(Window room) {
        this.window = window;
    }

    @Override
    public void execute() {
        Collections.sort(windowList,
                Comparator.comparingInt(
                        (first) ->first.getCalc().getSquare())
        );
        // (first, second)-> first.getCalc().getSquare() - second.getCalc().getSquare());

        System.out.println("Sort");
        for (Window window : windowList)
            System.out.println(window);
    }

}
