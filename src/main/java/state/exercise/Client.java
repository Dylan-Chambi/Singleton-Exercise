package state.exercise;

public class Client {

    public static void main (String[]args){
        Computer computer = new Computer(new RAM(0, "16GB", "Kingston"), new CPU(0, "AMD", 4));

        computer.setState(new ShutdownState());
        computer.startComputerState();
        computer.resourceManager();
        computer.openProgram("Excel");

        computer.setState(new PowerOnState());
        computer.startComputerState();
        computer.resourceManager();
        computer.openProgram("Paint");
        computer.resourceManager();

        computer.setState(new RebootState());
        computer.startComputerState();
        computer.resourceManager();
        computer.openProgram("Eclipse");
        computer.resourceManager();
    }
}
