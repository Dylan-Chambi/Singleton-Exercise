package state.exercise;

import java.util.Arrays;

public class ShutdownState implements IStateComputer {


    @Override
    public void startComputerState(Computer computer) {
        System.out.println("-------------------Shutdown State (Booting)-------------------");
        Arrays.fill(computer.getOpenPrograms(), null);
        computer.setOpenProgramsNumber(0);
        computer.getCpu().setCpuUsedPercentage(0);
        computer.getRam().setMemoryUsedPercentage(0);
    }

    @Override
    public void openProgram(Computer computer, String programName) {
        System.out.println("ERROR> The computer is in Shutdown state and cannot open " + programName + " program.");
    }

    @Override
    public void resourceManager(Computer computer) {
        System.out.println("There is " + computer.getOpenProgramsNumber() + " open programs.");
        System.out.println("CPU usage: " + computer.getCpu().getCpuUsedPercentage() + "%");
        System.out.println("RAM usage: " + computer.getRam().getMemoryUsedPercentage() + "%");
    }
}
