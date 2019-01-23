package task07;

import java.util.ArrayList;
import java.util.List;

class AddNewWindow implements Command {

    List<Window> windowList = new ArrayList<>();

    public List<Window> getWindowList() {
        return windowList;
    }

    public void setWindowList(List<Window> windowList) {
        this.windowList = windowList;
    }

    @Override
    public void execute() {
        windowList.add(windowList.get(0));
        System.out.println("added");
    }

}