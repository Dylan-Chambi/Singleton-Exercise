package command.exercise;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List <ICommand> commands= new ArrayList<>();

    public Invoker(){}

    public void addCommand(ICommand command){
        commands.add(command);
    }

    public void runCommands(){
        for (ICommand command  : commands  ) {
            command.execute();
        }
        commands.clear();
    }



}
