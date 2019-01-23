package task07;

import java.util.ArrayList;
import java.util.List;

class MediumWindow implements Command {

    List<Window> windowList = new ArrayList<>();

    public List<Window> getWindowList() {
        return windowList;
    }

    public void setWindowList(List<Window> windowList) {
        this.windowList = windowList;
    }

    @Override
    public void execute() {

        int mediumSquare = 0;
        for (Window window : windowList) {
            mediumSquare += window.getCalc().getSquare();
        }
        mediumSquare /= windowList.size();
        System.out.println("medium square = " + mediumSquare);
    }

}
