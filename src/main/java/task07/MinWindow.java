package task07;

import java.util.ArrayList;
import java.util.List;

class MinWindow implements Command {

    List<Window> windowList = new ArrayList<>();

    public List<Window> getWindowList() {
        return windowList;
    }

    public void setWindowList(List<Window> windowList) {
        this.windowList = windowList;
    }

    @Override
    public void execute() {
        Window minWindow = windowList.get(0);
        for (Window window : windowList) {
            if (minWindow.getHeight() > window.getHeight())
                minWindow = window;
        }
        System.out.println("min room - " + minWindow);

    }

}
