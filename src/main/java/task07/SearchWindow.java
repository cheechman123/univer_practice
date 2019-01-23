package task07;

import java.util.ArrayList;
import java.util.List;

class SearchWindow implements Command {
    Window room;
    List<Window> windowList = new ArrayList<>();

    public void setWindow(Window room) {
        this.room = room;
    }

    public List<Window> getWindowList() {
        return windowList;
    }

    public void setWindowList(List<Window> windowList) {
        this.windowList = windowList;
    }

    @Override
    public void execute() {
        System.out.println("search - " + windowList.get(windowList.indexOf(room)));
    }
}
