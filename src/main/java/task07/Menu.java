package task07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Menu{

    List<Command> commandList = new ArrayList<>();

    void addCommand(Command command) {
        commandList.add(command);
    }

    public List<Command> getCommandList() {
        return commandList;
    }

    void execute() {
        for (Command command : commandList) {
            command.execute();
            System.out.println("\n\n/////////////////////////");
        }
    }
    void execute(Command command){
        command.execute();
        System.out.println("\n\n/////////////////////////");
    }

}
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
        for(Window window:windowList){
            if(minWindow.getHeight() > window.getHeight())
                minWindow = window;
        }
        System.out.println("min room - " + minWindow);

    }

}

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