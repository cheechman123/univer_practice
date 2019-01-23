package task07;

import java.util.ArrayList;
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








